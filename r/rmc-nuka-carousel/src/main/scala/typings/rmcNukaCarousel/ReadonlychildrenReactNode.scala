package typings.rmcNukaCarousel

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<rmc-nuka-carousel.rmc-nuka-carousel/lib/decorators.IDecoratorProps> */
trait ReadonlychildrenReactNode extends js.Object {
  val cellSpacing: js.UndefOr[Double] = js.undefined
  val children: js.UndefOr[ReactNode] = js.undefined
  val currentSlide: Double
  val frameWidth: Double | String
  val goToSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  val nextSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
  val previousSlide: js.Function0[Unit]
  val slideCount: Double
  val slideWidth: Double | String
  val slidesToScroll: Double
  val slidesToShow: js.UndefOr[Double] = js.undefined
  val wrapAround: js.UndefOr[Boolean] = js.undefined
}

object ReadonlychildrenReactNode {
  @scala.inline
  def apply(
    currentSlide: Double,
    frameWidth: Double | String,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double | String,
    slidesToScroll: Double,
    cellSpacing: Int | Double = null,
    children: ReactNode = null,
    goToSlide: /* index */ Double => Unit = null,
    nextSlide: () => Unit = null,
    slidesToShow: Int | Double = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): ReadonlychildrenReactNode = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (goToSlide != null) __obj.updateDynamic("goToSlide")(js.Any.fromFunction1(goToSlide))
    if (nextSlide != null) __obj.updateDynamic("nextSlide")(js.Any.fromFunction0(nextSlide))
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNode]
  }
}

