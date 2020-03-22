package typings.rcSlider.mod

import typings.rcSlider.PartialProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithTooltipProps extends js.Object {
  var tipFormatter: js.UndefOr[js.Function1[/* value */ Double, ReactNode]] = js.undefined
  var tipProps: js.UndefOr[PartialProps] = js.undefined
}

object WithTooltipProps {
  @scala.inline
  def apply(tipFormatter: /* value */ Double => ReactNode = null, tipProps: PartialProps = null): WithTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (tipProps != null) __obj.updateDynamic("tipProps")(tipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithTooltipProps]
  }
}

