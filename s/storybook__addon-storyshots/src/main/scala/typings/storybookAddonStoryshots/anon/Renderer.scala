package typings.storybookAddonStoryshots.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var renderer: js.UndefOr[js.Any] = js.native
  var serializer: js.UndefOr[js.Any] = js.native
}

object Renderer {
  @scala.inline
  def apply(): Renderer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
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
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSerializer(value: js.Any): Self = this.set("serializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
  }
  
}

