package typings.stormDashReactDashDiagrams

import typings.std.Element
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Element extends js.Object {
  var element: Element
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object Anon_Element {
  @scala.inline
  def apply(element: Element, model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Anon_Element = {
    val __obj = js.Dynamic.literal(element = element, model = model)
  
    __obj.asInstanceOf[Anon_Element]
  }
}

