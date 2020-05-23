package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplAnimating extends js.Object {
  var animating: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[String] = js.undefined
  var inward: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[String] = js.undefined
  var looping: js.UndefOr[String] = js.undefined
  var outward: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplAnimating {
  @scala.inline
  def apply(
    animating: String = null,
    disabled: String = null,
    hidden: String = null,
    inward: String = null,
    loading: String = null,
    looping: String = null,
    outward: String = null,
    transition: String = null,
    visible: String = null
  ): PartialPickImplkeyofImplAnimating = {
    val __obj = js.Dynamic.literal()
    if (animating != null) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (inward != null) __obj.updateDynamic("inward")(inward.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (looping != null) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (outward != null) __obj.updateDynamic("outward")(outward.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplAnimating]
  }
}

