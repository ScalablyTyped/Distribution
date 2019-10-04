package typings.atPulumiAws.appmeshVirtualNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appmeshNs.VirtualNodeSpec
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeState extends js.Object {
  /**
    * The ARN of the virtual node.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The creation date of the virtual node.
    */
  val createdDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The last update date of the virtual node.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name to use for the virtual node.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The virtual node specification to apply.
    */
  val spec: js.UndefOr[Input[VirtualNodeSpec]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object VirtualNodeState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createdDate: Input[String] = null,
    lastUpdatedDate: Input[String] = null,
    meshName: Input[String] = null,
    name: Input[String] = null,
    spec: Input[VirtualNodeSpec] = null,
    tags: Input[StringDictionary[_]] = null
  ): VirtualNodeState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (meshName != null) __obj.updateDynamic("meshName")(meshName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeState]
  }
}

