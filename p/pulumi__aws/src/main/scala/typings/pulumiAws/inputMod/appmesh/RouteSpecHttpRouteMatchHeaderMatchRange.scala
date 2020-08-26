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
  @scala.inline
  implicit class RouteSpecHttpRouteMatchHeaderMatchRangeOps[Self <: RouteSpecHttpRouteMatchHeaderMatchRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Input[Double]): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Input[Double]): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

