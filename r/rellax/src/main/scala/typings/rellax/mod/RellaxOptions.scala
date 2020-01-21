package typings.rellax.mod

import typings.rellax.AnonX
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RellaxOptions extends js.Object {
  /**
    * Will run on every animation event
    * @param positions Object with x and y positions of the rellax element
    */
  var callback: js.UndefOr[js.Function1[/* positions */ AnonX, Unit]] = js.undefined
  /**
    * Enable the ability to center parallax elements in your viewport
    */
  var center: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
    */
  var horizontal: js.UndefOr[Boolean] = js.undefined
  /**
    * Do we want rellax element to be relative to the mentioned wrapper.
    */
  var relativeToWrapper: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow decimal pixel values
    */
  var round: js.UndefOr[Boolean] = js.undefined
  /**
    * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
    */
  var speed: js.UndefOr[Double] = js.undefined
  /**
    * Enable vertical parallax
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
    */
  var wrapper: js.UndefOr[String | HTMLElement] = js.undefined
}

object RellaxOptions {
  @scala.inline
  def apply(
    callback: /* positions */ AnonX => Unit = null,
    center: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    relativeToWrapper: js.UndefOr[Boolean] = js.undefined,
    round: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    wrapper: String | HTMLElement = null
  ): RellaxOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeToWrapper)) __obj.updateDynamic("relativeToWrapper")(relativeToWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RellaxOptions]
  }
}

