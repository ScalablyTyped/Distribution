package typings.scrollmagic.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerConstructorOptions extends js.Object {
  var container: js.UndefOr[String | Element] = js.native
  var globalSceneOptions: js.UndefOr[SceneConstructorOptions] = js.native
  var loglevel: js.UndefOr[Double] = js.native
  var refreshInterval: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ControllerConstructorOptions {
  @scala.inline
  def apply(): ControllerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerConstructorOptions]
  }
  @scala.inline
  implicit class ControllerConstructorOptionsOps[Self <: ControllerConstructorOptions] (val x: Self) extends AnyVal {
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
    def setContainer(value: String | Element): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setGlobalSceneOptions(value: SceneConstructorOptions): Self = this.set("globalSceneOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalSceneOptions: Self = this.set("globalSceneOptions", js.undefined)
    @scala.inline
    def setLoglevel(value: Double): Self = this.set("loglevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoglevel: Self = this.set("loglevel", js.undefined)
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

