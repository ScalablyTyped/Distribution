package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelTableOpts[MClass /* <: Instantiable0[AnyModel] */] extends js.Object {
  val arrName: ArrName[MClass]
  val fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any
  val idAttribute: IdAttribute[MClass]
  val mapName: MapName[MClass]
}

object ModelTableOpts {
  @scala.inline
  def apply[MClass](
    arrName: ArrName[MClass],
    fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any,
    idAttribute: IdAttribute[MClass],
    mapName: MapName[MClass]
  ): ModelTableOpts[MClass] = {
    val __obj = js.Dynamic.literal(arrName = arrName.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], idAttribute = idAttribute.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTableOpts[MClass]]
  }
}

