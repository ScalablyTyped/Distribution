package typings.reactNativeSwiper.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Swiper
  extends Component[SwiperProperties, SwiperState, js.Any] {
  def scrollBy(index: Double, animated: Boolean): Unit = js.native
}

