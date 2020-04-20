package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFooter extends js.Object {
  var Footer: Double
  var Loading: Double
  var Option: Double
  var Separator: Double
}

object AnonFooter {
  @scala.inline
  def apply(Footer: Double, Loading: Double, Option: Double, Separator: Double): AnonFooter = {
    val __obj = js.Dynamic.literal(Footer = Footer.asInstanceOf[js.Any], Loading = Loading.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFooter]
  }
}

