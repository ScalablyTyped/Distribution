package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteSpecHttpRouteMatchHeaderMatchRange extends js.Object {
  /**
    * The end of the range.
    */
  var end: Double = js.native
  /**
    * The start of the range.
    */
  var start: Double = js.native
}

object RouteSpecHttpRouteMatchHeaderMatchRange {
  @scala.inline
  def apply(end: Double, start: Double): RouteSpecHttpRouteMatchHeaderMatchRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatchRange]
  }
}

