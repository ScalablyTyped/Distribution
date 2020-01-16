package typings.atStorybookAddonDashStoryshotsDashPuppeteer.distConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var context: Context
  var url: String
}

object Options {
  @scala.inline
  def apply(context: Context, url: String): Options = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

