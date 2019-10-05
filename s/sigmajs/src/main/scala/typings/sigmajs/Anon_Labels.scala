package typings.sigmajs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.SigmaJs.Edge
import typings.sigmajs.SigmaJs.SVGEdgeLabels
import typings.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Labels extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  var labels: SVGEdgeLabels
}

object Anon_Labels {
  @scala.inline
  def apply(
    labels: SVGEdgeLabels,
    StringDictionary: /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] = null
  ): Anon_Labels = {
    val __obj = js.Dynamic.literal(labels = labels)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Labels]
  }
}

