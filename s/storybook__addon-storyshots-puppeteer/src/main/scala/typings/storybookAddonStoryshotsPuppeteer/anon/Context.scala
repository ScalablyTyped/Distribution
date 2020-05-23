package typings.storybookAddonStoryshotsPuppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: typings.storybookAddonStoryshotsPuppeteer.configMod.Context
  var image: String
}

object Context {
  @scala.inline
  def apply(context: typings.storybookAddonStoryshotsPuppeteer.configMod.Context, image: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

