package typings.sigmajs.SigmaJs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var container: HTMLElement
  def refresh(): Sigma
  def render(): Sigma
  def resize(): Sigma
  def settings(settings: Settings): Unit
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
    val __obj = js.Dynamic.literal(container = container, refresh = js.Any.fromFunction0(refresh), render = js.Any.fromFunction0(render), resize = js.Any.fromFunction0(resize), settings = js.Any.fromFunction1(settings))
  
    __obj.asInstanceOf[Renderer]
  }
}

