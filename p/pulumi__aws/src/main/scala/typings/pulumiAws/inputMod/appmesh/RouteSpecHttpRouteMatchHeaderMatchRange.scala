package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeaderMatchRange extends js.Object {
  /**
    * The end of the range.
    */
  var end: Input[Double] = js.native
  /**
    * The start of the range.
    */
  var start: Input[Double] = js.native
}

object RouteSpecHttpRouteMatchHeaderMatchRange {
  @scala.inline
  def apply(end: Input[Double], start: Input[Double]): RouteSpecHttpRouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatchRange]
  }
}

