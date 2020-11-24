package typings.reduxOrm.tableMod

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.modelMod.AnyModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelTableOpts[MClass /* <: Instantiable0[AnyModel] */] extends js.Object {
  
  val arrName: ArrName[MClass] = js.native
  
  val fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any = js.native
  
  val idAttribute: IdAttribute[MClass] = js.native
  
  val mapName: MapName[MClass] = js.native
}
object ModelTableOpts {
  
  @scala.inline
  def apply[MClass /* <: Instantiable0[AnyModel] */](
    arrName: ArrName[MClass],
    fields: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any,
    idAttribute: IdAttribute[MClass],
    mapName: MapName[MClass]
  ): ModelTableOpts[MClass] = {
    val __obj = js.Dynamic.literal(arrName = arrName.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], idAttribute = idAttribute.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTableOpts[MClass]]
  }
  
  @scala.inline
  implicit class ModelTableOptsOps[Self <: ModelTableOpts[_], MClass /* <: Instantiable0[AnyModel] */] (val x: Self with ModelTableOpts[MClass]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrName(value: ArrName[MClass]): Self = this.set("arrName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(
      value: /* import warning: importer.ImportType#apply Failed type conversion: MClass['fields'] */ js.Any
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdAttribute(value: IdAttribute[MClass]): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapName(value: MapName[MClass]): Self = this.set("mapName", value.asInstanceOf[js.Any])
  }
}
