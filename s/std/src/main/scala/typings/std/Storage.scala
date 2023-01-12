package typings.std

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Storage API interface provides access to a particular domain's session or local storage. It allows, for example, the addition, modification, or deletion of stored data items. */
trait Storage
  extends StObject
     with /* standard dom */
/* name */ StringDictionary[Any] {
  
  /**
    * Removes all key/value pairs, if there are any.
    *
    * Dispatches a storage event on Window objects holding an equivalent Storage object.
    */
  /* standard dom */
  def clear(): Unit
  
  /** Returns the current value associated with the given key, or null if the given key does not exist. */
  /* standard dom */
  def getItem(key: java.lang.String): java.lang.String | Null
  
  /** Returns the name of the nth key, or null if n is greater than or equal to the number of key/value pairs. */
  /* standard dom */
  def key(index: Double): java.lang.String | Null
  
  /** Returns the number of key/value pairs. */
  /* standard dom */
  val length: Double
  
  /**
    * Removes the key/value pair with the given key, if a key/value pair with the given key exists.
    *
    * Dispatches a storage event on Window objects holding an equivalent Storage object.
    */
  /* standard dom */
  def removeItem(key: java.lang.String): Unit
  
  /**
    * Sets the value of the pair identified by key to value, creating a new key/value pair if none existed for key previously.
    *
    * Throws a "QuotaExceededError" DOMException exception if the new value couldn't be set. (Setting could fail if, e.g., the user has disabled storage for the site, or if the quota has been exceeded.)
    *
    * Dispatches a storage event on Window objects holding an equivalent Storage object.
    */
  /* standard dom */
  def setItem(key: java.lang.String, value: java.lang.String): Unit
}
object Storage {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Storage] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGetItem(value: java.lang.String => java.lang.String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double => java.lang.String | Null): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemoveItem(value: java.lang.String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def setSetItem(value: (java.lang.String, java.lang.String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
  }
}
