package typings.reactDashFadeDashIn.reactDashFadeDashInMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FadeInProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /**
    * Default: 50. Delay between each child's animation in milliseconds.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Default: 400. Duration of each child's animation in milliseconds.
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object FadeInProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    delay: Int | Double = null,
    transitionDuration: Int | Double = null
  ): FadeInProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FadeInProps]
  }
}

