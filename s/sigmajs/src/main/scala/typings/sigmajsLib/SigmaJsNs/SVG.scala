package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVG extends js.Object {
  var edges: sigmajsLib.Anon_Labels
  var labels: org.scalablytyped.runtime.StringDictionary[SVGObject[Node]]
  var nodes: org.scalablytyped.runtime.StringDictionary[SVGObject[Node]]
}

object SVG {
  @scala.inline
  def apply(
    edges: sigmajsLib.Anon_Labels,
    labels: org.scalablytyped.runtime.StringDictionary[SVGObject[Node]],
    nodes: org.scalablytyped.runtime.StringDictionary[SVGObject[Node]]
  ): SVG = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("labels")(labels)
    __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[SVG]
  }
}

