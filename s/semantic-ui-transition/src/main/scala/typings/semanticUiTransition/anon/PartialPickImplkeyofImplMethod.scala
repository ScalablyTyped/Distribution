package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends js.Object {
  var method: js.UndefOr[String] = js.undefined
  var noAnimation: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplMethod {
  @scala.inline
  def apply(method: String = null, noAnimation: String = null): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (noAnimation != null) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
}

