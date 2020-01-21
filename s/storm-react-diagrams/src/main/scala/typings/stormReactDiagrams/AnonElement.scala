package typings.stormReactDiagrams

import typings.std.Element
import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends js.Object {
  var element: Element
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object AnonElement {
  @scala.inline
  def apply(element: Element, model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): AnonElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElement]
  }
}

