package typings.semanticUiShape.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl, keyof semantic-ui-shape.SemanticUI.Shape.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var animating: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(active: String = null, animating: String = null, hidden: String = null, loading: String = null): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (animating != null) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
}

