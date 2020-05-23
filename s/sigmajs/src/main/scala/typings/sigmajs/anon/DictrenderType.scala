package typings.sigmajs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.SigmaJs.Edge
import typings.sigmajs.SigmaJs.SVGEdgeLabels
import typings.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictrenderType extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  var labels: SVGEdgeLabels
}

object DictrenderType {
  @scala.inline
  def apply(
    labels: SVGEdgeLabels,
    StringDictionary: /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] = null
  ): DictrenderType = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictrenderType]
  }
}

