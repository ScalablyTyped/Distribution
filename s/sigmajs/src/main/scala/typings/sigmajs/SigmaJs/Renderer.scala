package typings.sigmajs.SigmaJs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var container: HTMLElement = js.native
  def refresh(): Sigma = js.native
  def render(): Sigma = js.native
  def resize(): Sigma = js.native
  def settings(settings: Settings): Unit = js.native
}

object Renderer {
  @scala.inline
  def apply(
    container: HTMLElement,
    refresh: () => Sigma,
    render: () => Sigma,
    resize: () => Sigma,
    settings: Settings => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), render = js.Any.fromFunction0(render), resize = js.Any.fromFunction0(resize), settings = js.Any.fromFunction1(settings))
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: () => Sigma): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setRender(value: () => Sigma): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def setResize(value: () => Sigma): Self = this.set("resize", js.Any.fromFunction0(value))
    @scala.inline
    def setSettings(value: Settings => Unit): Self = this.set("settings", js.Any.fromFunction1(value))
  }
  
}

