package typings.pulumiAws.trafficMirrorFilterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterState extends js.Object {
  /**
    * A description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of amazon network services that should be mirrored. Valid values: amazon-dns
    */
  val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object TrafficMirrorFilterState {
  @scala.inline
  def apply(description: Input[String] = null, networkServices: Input[js.Array[Input[String]]] = null): TrafficMirrorFilterState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (networkServices != null) __obj.updateDynamic("networkServices")(networkServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterState]
  }
}

