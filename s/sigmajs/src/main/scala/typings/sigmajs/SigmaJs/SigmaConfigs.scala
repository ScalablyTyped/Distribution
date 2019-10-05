package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigmaConfigs extends js.Object {
  var container: js.UndefOr[Element] = js.undefined
  var graph: js.UndefOr[GraphData] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var renderers: js.UndefOr[js.Array[Renderer]] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object SigmaConfigs {
  @scala.inline
  def apply(
    container: Element = null,
    graph: GraphData = null,
    id: String = null,
    renderers: js.Array[Renderer] = null,
    settings: StringDictionary[js.Any] = null
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

