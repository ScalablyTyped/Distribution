package typings.atPulumiAws.appmeshMeshMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_EgressFilterAnonTypeInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshArgs extends js.Object {
  /**
    * The name to use for the service mesh.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The service mesh specification to apply.
    */
  val spec: js.UndefOr[Input[Anon_EgressFilterAnonTypeInput]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object MeshArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    spec: Input[Anon_EgressFilterAnonTypeInput] = null,
    tags: Input[StringDictionary[_]] = null
  ): MeshArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshArgs]
  }
}

