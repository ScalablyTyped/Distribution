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
    isValid: js.Function0[scala.Boolean],
    linkingObjects: js.Function2[java.lang.String, java.lang.String, Results[js.Any with Object]],
    linkingObjectsCount: js.Function0[scala.Double],
    objectSchema: js.Function0[ObjectSchema]
  ): Object = {
    val __obj = js.Dynamic.literal(isValid = isValid, linkingObjects = linkingObjects, linkingObjectsCount = linkingObjectsCount, objectSchema = objectSchema)
  
    __obj.asInstanceOf[Object]
  }
}

