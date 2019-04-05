package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchemaProperty
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchemaProperty }
  */
trait ObjectSchemaProperty extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var indexed: js.UndefOr[scala.Boolean] = js.undefined
  var mapTo: js.UndefOr[java.lang.String] = js.undefined
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: PropertyType
}

object ObjectSchemaProperty {
  @scala.inline
  def apply(
    `type`: PropertyType,
    default: js.Any = null,
    indexed: js.UndefOr[scala.Boolean] = js.undefined,
    mapTo: java.lang.String = null,
    objectType: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    property: java.lang.String = null
  ): ObjectSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(indexed)) __obj.updateDynamic("indexed")(indexed)
    if (mapTo != null) __obj.updateDynamic("mapTo")(mapTo)
    if (objectType != null) __obj.updateDynamic("objectType")(objectType)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (property != null) __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[ObjectSchemaProperty]
  }
}

