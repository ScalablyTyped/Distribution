package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RendererConfigs extends js.Object {
  var container: js.UndefOr[stdLib.Element] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RendererConfigs {
  @scala.inline
  def apply(container: stdLib.Element = null, id: java.lang.String = null, `type`: java.lang.String = null): RendererConfigs = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (id != null) __obj.updateDynamic("id")(id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RendererConfigs]
  }
}

