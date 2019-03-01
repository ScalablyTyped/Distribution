package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigmaConfigs extends js.Object {
  var container: js.UndefOr[stdLib.Element] = js.undefined
  var graph: js.UndefOr[GraphData] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var renderers: js.UndefOr[js.Array[Renderer]] = js.undefined
  var settings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object SigmaConfigs {
  @scala.inline
  def apply(
    container: stdLib.Element = null,
    graph: GraphData = null,
    id: java.lang.String = null,
    renderers: js.Array[Renderer] = null,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): SigmaConfigs = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (graph != null) __obj.updateDynamic("graph")(graph)
    if (id != null) __obj.updateDynamic("id")(id)
    if (renderers != null) __obj.updateDynamic("renderers")(renderers)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[SigmaConfigs]
  }
}

