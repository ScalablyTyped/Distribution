package typings.rdfjsFetchLite.mod

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfjsFetchLite.anon.PickparsersSinkMapEventEm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends FormatsInit {
  
  var factory: DatasetCoreFactory[OutQuad, InQuad, D] = js.native
}
object FactoryInit {
  
  @scala.inline
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](factory: DatasetCoreFactory[OutQuad, InQuad, D], formats: PickparsersSinkMapEventEm): FactoryInit[D, OutQuad, InQuad] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
  }
  
  @scala.inline
  implicit class FactoryInitOps[Self <: FactoryInit[_, _, _], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] (val x: Self with (FactoryInit[D, OutQuad, InQuad])) extends AnyVal {
    
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
    def setFactory(value: DatasetCoreFactory[OutQuad, InQuad, D]): Self = this.set("factory", value.asInstanceOf[js.Any])
  }
}
