package typings.atPulumiAws.appmeshMeshMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.appmeshNs.MeshSpec
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshState extends js.Object {
  /**
    * The ARN of the service mesh.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The creation date of the service mesh.
    */
  val createdDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The last update date of the service mesh.
    */
  val lastUpdatedDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name to use for the service mesh.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The service mesh specification to apply.
    */
  val spec: js.UndefOr[Input[MeshSpec]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object MeshState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createdDate: Input[String] = null,
    lastUpdatedDate: Input[String] = null,
    name: Input[String] = null,
    spec: Input[MeshSpec] = null,
    tags: Input[StringDictionary[_]] = null
  ): MeshState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshState]
  }
}

