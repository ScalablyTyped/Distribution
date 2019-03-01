package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchema
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchema }
  */
trait ObjectSchema extends js.Object {
  var name: java.lang.String
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  var properties: PropertiesTypes
}

object ObjectSchema {
  @scala.inline
  def apply(name: java.lang.String, properties: PropertiesTypes, primaryKey: java.lang.String = null): ObjectSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey)
    __obj.asInstanceOf[ObjectSchema]
  }
}

