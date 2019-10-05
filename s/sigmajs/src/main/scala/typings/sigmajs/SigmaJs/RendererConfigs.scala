package typings.sigmajs.SigmaJs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererConfigs extends js.Object {
  var container: js.UndefOr[Element] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object RendererConfigs {
  @scala.inline
  def apply(container: Element = null, id: String = null, `type`: String = null): RendererConfigs = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RendererConfigs]
  }
}

