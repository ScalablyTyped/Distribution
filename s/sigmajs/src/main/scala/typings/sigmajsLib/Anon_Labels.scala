package typings
package sigmajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Labels
  extends /* renderType */ org.scalablytyped.runtime.StringDictionary[
      sigmajsLib.SigmaJsNs.SVGObject[sigmajsLib.SigmaJsNs.Edge] | sigmajsLib.SigmaJsNs.SVGEdgeLabels
    ] {
  var labels: sigmajsLib.SigmaJsNs.SVGEdgeLabels
}

object Anon_Labels {
  @scala.inline
  def apply(
    labels: sigmajsLib.SigmaJsNs.SVGEdgeLabels,
    StringDictionary: /* renderType */ org.scalablytyped.runtime.StringDictionary[
      sigmajsLib.SigmaJsNs.SVGObject[sigmajsLib.SigmaJsNs.Edge] | sigmajsLib.SigmaJsNs.SVGEdgeLabels
    ] = null
  ): Anon_Labels = {
    val __obj = js.Dynamic.literal(labels = labels)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Labels]
  }
}

