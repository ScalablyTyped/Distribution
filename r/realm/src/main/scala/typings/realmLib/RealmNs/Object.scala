package typings
package realmLib.RealmNs

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
  def addListener(callback: ObjectChangeCallback): scala.Unit
  /**
    * @returns boolean
    */
  def isValid(): scala.Boolean
  /**
    * @returns Results<T>
    */
  def linkingObjects[T](objectType: java.lang.String, property: java.lang.String): Results[T with Object]
  /**
    * @returns number
    */
  def linkingObjectsCount(): scala.Double
  /**
    * @returns ObjectSchema
    */
  def objectSchema(): ObjectSchema
  def removeAllListeners(): scala.Unit
  def removeListener(callback: ObjectChangeCallback): scala.Unit
}

object Object {
  @scala.inline
  def apply(
    addListener: ObjectChangeCallback => scala.Unit,
    isValid: () => scala.Boolean,
    linkingObjects: (java.lang.String, java.lang.String) => Results[js.Any with Object],
    linkingObjectsCount: () => scala.Double,
    objectSchema: () => ObjectSchema,
    removeAllListeners: () => scala.Unit,
    removeListener: ObjectChangeCallback => scala.Unit
  ): Object = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1(addListener), isValid = js.Any.fromFunction0(isValid), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema), removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener))
  
    __obj.asInstanceOf[Object]
  }
}

