package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl>> */
trait PartialPickImplkeyofImplHide extends js.Object {
  var hide: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImplHide {
  @scala.inline
  def apply(hide: js.UndefOr[Double] = js.undefined, show: js.UndefOr[Double] = js.undefined): PartialPickImplkeyofImplHide = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImplHide]
  }
}

