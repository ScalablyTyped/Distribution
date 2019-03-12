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
}

object Object {
  @scala.inline
  def apply(
    isValid: () => scala.Boolean,
    linkingObjects: (java.lang.String, java.lang.String) => Results[js.Any with Object],
    linkingObjectsCount: () => scala.Double,
    objectSchema: () => ObjectSchema
  ): Object = {
    val __obj = js.Dynamic.literal(isValid = js.Any.fromFunction0(isValid), linkingObjects = js.Any.fromFunction2(linkingObjects), linkingObjectsCount = js.Any.fromFunction0(linkingObjectsCount), objectSchema = js.Any.fromFunction0(objectSchema))
  
    __obj.asInstanceOf[Object]
  }
}

