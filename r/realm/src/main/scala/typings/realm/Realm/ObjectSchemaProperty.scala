package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchemaProperty
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchemaProperty }
  */
trait ObjectSchemaProperty extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var indexed: js.UndefOr[Boolean] = js.undefined
  var mapTo: js.UndefOr[String] = js.undefined
  var objectType: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var property: js.UndefOr[String] = js.undefined
  var `type`: PropertyType
}

object ObjectSchemaProperty {
  @scala.inline
  def apply(
    `type`: PropertyType,
    default: js.Any = null,
    indexed: js.UndefOr[Boolean] = js.undefined,
    mapTo: String = null,
    objectType: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    property: String = null
  ): ObjectSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed.get.asInstanceOf[js.Any])
    if (mapTo != null) __obj.updateDynamic("mapTo")(mapTo.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSchemaProperty]
  }
}

