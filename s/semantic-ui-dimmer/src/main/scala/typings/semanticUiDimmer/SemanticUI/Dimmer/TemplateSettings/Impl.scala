package typings.semanticUiDimmer.SemanticUI.Dimmer.TemplateSettings

import typings.semanticUiDimmer.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  def dimmer(): JQuery
}

object Impl {
  @scala.inline
  def apply(dimmer: () => JQuery): Impl = {
    val __obj = js.Dynamic.literal(dimmer = js.Any.fromFunction0(dimmer))
    __obj.asInstanceOf[Impl]
  }
}

