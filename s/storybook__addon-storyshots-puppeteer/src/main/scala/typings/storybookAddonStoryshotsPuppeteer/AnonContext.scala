package typings.storybookAddonStoryshotsPuppeteer

import typings.storybookAddonStoryshotsPuppeteer.configMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: Context
  var image: String
}

object AnonContext {
  @scala.inline
  def apply(context: Context, image: String): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

