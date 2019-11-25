package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchema
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchema }
  */
trait ObjectSchema extends js.Object {
  var name: String
  var primaryKey: js.UndefOr[String] = js.undefined
  var properties: PropertiesTypes
}

object ObjectSchema {
  @scala.inline
  def apply(name: String, properties: PropertiesTypes, primaryKey: String = null): ObjectSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchema]
  }
}

