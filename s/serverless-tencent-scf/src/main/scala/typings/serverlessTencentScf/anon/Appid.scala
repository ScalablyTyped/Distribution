package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appid extends js.Object {
  var appid: String
  var name: String
  var region: String
}

object Appid {
  @scala.inline
  def apply(appid: String, name: String, region: String): Appid = {
    val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
}

