package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl>> */
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[String] = js.undefined
  var dimmable: js.UndefOr[String] = js.undefined
  var dimmed: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[String] = js.undefined
  var hide: js.UndefOr[String] = js.undefined
  var pageDimmer: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
  var transition: js.UndefOr[String] = js.undefined
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(
    active: String = null,
    dimmable: String = null,
    dimmed: String = null,
    disabled: String = null,
    hide: String = null,
    pageDimmer: String = null,
    show: String = null,
    transition: String = null
  ): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (dimmable != null) __obj.updateDynamic("dimmable")(dimmable.asInstanceOf[js.Any])
    if (dimmed != null) __obj.updateDynamic("dimmed")(dimmed.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (pageDimmer != null) __obj.updateDynamic("pageDimmer")(pageDimmer.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
}

