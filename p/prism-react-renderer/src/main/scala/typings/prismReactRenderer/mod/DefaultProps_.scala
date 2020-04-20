package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps_ extends js.Object {
  var Prism: PrismLib
  var theme: PrismTheme
}

object DefaultProps_ {
  @scala.inline
  def apply(Prism: PrismLib, theme: PrismTheme): DefaultProps_ = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps_]
  }
}

