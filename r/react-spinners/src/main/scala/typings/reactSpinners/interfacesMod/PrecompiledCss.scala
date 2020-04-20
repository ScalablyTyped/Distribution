package typings.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecompiledCss extends js.Object {
  var name: String
  var styles: String
}

object PrecompiledCss {
  @scala.inline
  def apply(name: String, styles: String): PrecompiledCss = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecompiledCss]
  }
}

