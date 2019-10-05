package typings.semanticDashUiDashDimmer.SemanticUI.Dimmer.TemplateSettings

import typings.semanticDashUiDashDimmer.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  def dimmer(): JQuery
}

object _Impl {
  @scala.inline
  def apply(dimmer: () => JQuery): _Impl = {
    val __obj = js.Dynamic.literal(dimmer = js.Any.fromFunction0(dimmer))
  
    __obj.asInstanceOf[_Impl]
  }
}

