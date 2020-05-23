package typings.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Storage API interface provides access to a particular domain's session or local storage. It allows, for example, the addition, modification, or deletion of stored data items. */
trait Storage
  extends /* name */ StringDictionary[js.Any] {
  /**
    * Returns the number of key/value pairs currently present in the list associated with the object.
    */
  val length: Double
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  def clear(): Unit
  /**
    * Returns the current value associated with the given key, or null if the given key does not exist in the list associated with the object.
    */
  def getItem(key: java.lang.String): java.lang.String | Null
  /**
    * Returns the name of the nth key in the list, or null if n is greater than or equal to the number of key/value pairs in the object.
    */
  def key(index: Double): java.lang.String | Null
  /**
    * Removes the key/value pair with the given key from the list associated with the object, if a key/value pair with the given key exists.
    */
  def removeItem(key: java.lang.String): Unit
  /**
    * Sets the value of the pair identified by key to value, creating a new key/value pair if none existed for key previously.
    * 
    * Throws a "QuotaExceededError" DOMException exception if the new value couldn't be set. (Setting could fail if, e.g., the user has disabled storage for the site, or if the quota has been exceeded.)
    */
  def setItem(key: java.lang.String, value: java.lang.String): Unit
}

object Storage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: java.lang.String => java.lang.String | Null,
    key: Double => java.lang.String | Null,
    length: Double,
    removeItem: java.lang.String => Unit,
    setItem: (java.lang.String, java.lang.String) => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Storage]
  }
}

