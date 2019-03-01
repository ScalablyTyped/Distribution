package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  var container: stdLib.HTMLElement
  def refresh(): Sigma
  def render(): Sigma
  def resize(): Sigma
  def settings(settings: Settings): scala.Unit
}

object Renderer {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement,
    refresh: js.Function0[Sigma],
    render: js.Function0[Sigma],
    resize: js.Function0[Sigma],
    settings: js.Function1[Settings, scala.Unit]
  ): Renderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("refresh")(refresh)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[Renderer]
  }
}

