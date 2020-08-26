package typings.storybookAddonStoryshotsPuppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var context: typings.storybookAddonStoryshotsPuppeteer.configMod.Context = js.native
  var image: String = js.native
}

object Context {
  @scala.inline
  def apply(context: typings.storybookAddonStoryshotsPuppeteer.configMod.Context, image: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: typings.storybookAddonStoryshotsPuppeteer.configMod.Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
  }
  
}

