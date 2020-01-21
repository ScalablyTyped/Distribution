package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.AnonLabels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVG extends js.Object {
  var edges: AnonLabels
  var labels: StringDictionary[SVGObject[Node]]
  var nodes: StringDictionary[SVGObject[Node]]
}

object SVG {
  @scala.inline
  def apply(
    edges: AnonLabels,
    labels: StringDictionary[SVGObject[Node]],
    nodes: StringDictionary[SVGObject[Node]]
  ): SVG = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SVG]
  }
}

