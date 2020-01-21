package typings.pulumiAws.sagemakerEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointArgs extends js.Object {
  /**
    * The name of the endpoint configuration to use.
    */
  val endpointConfigName: Input[String] = js.native
  /**
    * The name of the endpoint. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object EndpointArgs {
  @scala.inline
  def apply(
    endpointConfigName: Input[String],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): EndpointArgs = {
    val __obj = js.Dynamic.literal(endpointConfigName = endpointConfigName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointArgs]
  }
}

