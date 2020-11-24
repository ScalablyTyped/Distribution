package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Storage API interface provides access to a particular domain's session or local storage. It allows, for example, the addition, modification, or deletion of stored data items. */
@js.native
trait Storage
  extends /* name */ StringDictionary[js.Any] {
  
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  def clear(): Unit = js.native
  
  /**
    * Returns the current value associated with the given key, or null if the given key does not exist in the list associated with the object.
    */
  def getItem(key: java.lang.String): java.lang.String | Null = js.native
  
  /**
    * Returns the name of the nth key in the list, or null if n is greater than or equal to the number of key/value pairs in the object.
    */
  def key(index: Double): java.lang.String | Null = js.native
  
  /**
    * Returns the number of key/value pairs currently present in the list associated with the object.
    */
  val length: Double = js.native
  
  /**
    * Removes the key/value pair with the given key from the list associated with the object, if a key/value pair with the given key exists.
    */
  def removeItem(key: java.lang.String): Unit = js.native
  
  /**
    * Sets the value of the pair identified by key to value, creating a new key/value pair if none existed for key previously.
    * 
    * Throws a "QuotaExceededError" DOMException exception if the new value couldn't be set. (Setting could fail if, e.g., the user has disabled storage for the site, or if the quota has been exceeded.)
    */
  def setItem(key: java.lang.String, value: java.lang.String): Unit = js.native
}
object Storage {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: java.lang.String => java.lang.String | Null,
    key: Double => java.lang.String | Null,
    length: Double,
    removeItem: java.lang.String => Unit,
    setItem: (java.lang.String, java.lang.String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: java.lang.String => java.lang.String | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: Double => java.lang.String | Null): Self = this.set("key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveItem(value: java.lang.String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItem(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
}
