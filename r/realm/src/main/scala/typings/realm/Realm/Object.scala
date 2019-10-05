package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Object.html }
  */
trait Object extends js.Object {
  /**
    * @returns void
    */
  def addListener(callback: ObjectChangeCallback): Unit
  /**
    * @returns boolean
    */
  def isValid(): Boolean
  /**
    * @returns Results<T>
    */
  def linkingObjects[T](objectType: String, property: String): Results[T with Object]
  /**
    * @returns number
    */
  def linkingObjectsCount(): Double
  /**
    * @returns ObjectSchema
    */
  def objectSchema(): ObjectSchema
  def removeAllListeners(): Unit
  def removeListener(callback: ObjectChangeCallback): Unit
}

object Object {
  @scala.inline
  def apply(
    addListener: ObjectChangeCallback => Unit,
    isValid: () => Boolean,
    linkingObjects: (String, String) => Results[js.Any with Object],
    linkingObjectsCount: () => Double,
    objectSchema: () => ObjectSchema,
    removeAllListeners: () => Unit,
    removeListener: ObjectChangeCallback => Unit
  ): Object = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), isValid = js.Any.fromFunction0(isValid), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[Object]
  }
}

