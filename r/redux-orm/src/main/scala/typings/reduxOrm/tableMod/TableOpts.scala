package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.StringDictionary
import typings.reduxOrm.fieldsMod.Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOpts extends js.Object {
  val arrName: js.UndefOr[String] = js.undefined
  val fields: js.UndefOr[StringDictionary[Field]] = js.undefined
  val idAttribute: js.UndefOr[String] = js.undefined
  val mapName: js.UndefOr[String] = js.undefined
}

object TableOpts {
  @scala.inline
  def apply(
    arrName: String = null,
    fields: StringDictionary[Field] = null,
    idAttribute: String = null,
    mapName: String = null
  ): TableOpts = {
    val __obj = js.Dynamic.literal()
    if (arrName != null) __obj.updateDynamic("arrName")(arrName.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (mapName != null) __obj.updateDynamic("mapName")(mapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOpts]
  }
}

