package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-line:no-empty-interface
trait GoToActionProps extends js.Object {
  var margin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function1[
      /* goToSlide */ js.UndefOr[js.Function1[/* slide */ scala.Double | java.lang.String, scala.Unit]], 
      scala.Unit
    ]
  ] = js.undefined
  var slide: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GoToActionProps {
  @scala.inline
  def apply(
    margin: scala.Double | java.lang.String = null,
    padding: scala.Double | java.lang.String = null,
    render: js.Function1[
      /* goToSlide */ js.UndefOr[js.Function1[/* slide */ scala.Double | java.lang.String, scala.Unit]], 
      scala.Unit
    ] = null,
    slide: scala.Double | java.lang.String = null,
    style: CSSProperties = null
  ): GoToActionProps = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GoToActionProps]
  }
}

