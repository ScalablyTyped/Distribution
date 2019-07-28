package typings.atPulumiAws.mediastoreContainerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerState extends js.Object {
  /**
    * The ARN of the container.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The DNS endpoint of the container.
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the container. Must contain alphanumeric characters or underscores.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object ContainerState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    endpoint: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ContainerState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
}

