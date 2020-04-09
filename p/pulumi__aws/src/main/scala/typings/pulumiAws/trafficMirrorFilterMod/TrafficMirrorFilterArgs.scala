package typings.pulumiAws.trafficMirrorFilterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterArgs extends js.Object {
  /**
    * A description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of amazon network services that should be mirrored. Valid values: `amazon-dns`.
    */
  val networkServices: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object TrafficMirrorFilterArgs {
  @scala.inline
  def apply(
    description: Input[String] = null,
    networkServices: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): TrafficMirrorFilterArgs = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (networkServices != null) __obj.updateDynamic("networkServices")(networkServices.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilterArgs]
  }
}

