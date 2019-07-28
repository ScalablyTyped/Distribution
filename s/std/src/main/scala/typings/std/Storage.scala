package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Web Storage API provides access to a particular domain's session or local storage. It allows, for example, the addition, modification, or deletion of stored data items. */
trait Storage
  extends /* name */ StringDictionary[js.Any] {
  /**
    * Returns the number of key/value pairs currently present in the list associated with the
    * object.
    */
  val length: Double
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  def clear(): Unit
  /**
    * value = storage[key]
    */
  def getItem(key: java.lang.String): java.lang.String | Null
  /**
    * Returns the name of the nth key in the list, or null if n is greater
    * than or equal to the number of key/value pairs in the object.
    */
  def key(index: Double): java.lang.String | Null
  /**
    * delete storage[key]
    */
  def removeItem(key: java.lang.String): Unit
  /**
    * storage[key] = value
    */
  def setItem(key: java.lang.String, value: java.lang.String): Unit
}

@JSGlobal("Storage")
@js.native
class StorageCls () extends Storage {
  /**
    * Returns the number of key/value pairs currently present in the list associated with the
    * object.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Empties the list associated with the object of all key/value pairs, if there are any.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * value = storage[key]
    */
  /* CompleteClass */
  override def getItem(key: java.lang.String): java.lang.String | Null = js.native
  /**
    * Returns the name of the nth key in the list, or null if n is greater
    * than or equal to the number of key/value pairs in the object.
    */
  /* CompleteClass */
  override def key(index: Double): java.lang.String | Null = js.native
  /**
    * delete storage[key]
    */
  /* CompleteClass */
  override def removeItem(key: java.lang.String): Unit = js.native
  /**
    * storage[key] = value
    */
  /* CompleteClass */
  override def setItem(key: java.lang.String, value: java.lang.String): Unit = js.native
}

@JSGlobal("Storage")
@js.native
object Storage extends Instantiable0[Storage]

