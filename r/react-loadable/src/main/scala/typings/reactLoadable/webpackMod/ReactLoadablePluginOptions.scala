package typings.reactLoadable.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactLoadablePluginOptions extends js.Object {
  var filename: String = js.native
}

object ReactLoadablePluginOptions {
  @scala.inline
  def apply(filename: String): ReactLoadablePluginOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLoadablePluginOptions]
  }
  @scala.inline
  implicit class ReactLoadablePluginOptionsOps[Self <: ReactLoadablePluginOptions] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
  }
  
}

