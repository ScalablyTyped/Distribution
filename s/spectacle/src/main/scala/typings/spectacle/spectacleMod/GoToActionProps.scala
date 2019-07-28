package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line:no-empty-interface
trait GoToActionProps extends js.Object {
  var margin: js.UndefOr[Double | String] = js.undefined
  var padding: js.UndefOr[Double | String] = js.undefined
  var render: js.UndefOr[
    js.Function1[/* goToSlide */ js.UndefOr[js.Function1[/* slide */ Double | String, Unit]], Unit]
  ] = js.undefined
  var slide: js.UndefOr[Double | String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GoToActionProps {
  @scala.inline
  def apply(
    margin: Double | String = null,
    padding: Double | String = null,
    render: /* goToSlide */ js.UndefOr[js.Function1[/* slide */ Double | String, Unit]] => Unit = null,
    slide: Double | String = null,
    style: CSSProperties = null
  ): GoToActionProps = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GoToActionProps]
  }
}

