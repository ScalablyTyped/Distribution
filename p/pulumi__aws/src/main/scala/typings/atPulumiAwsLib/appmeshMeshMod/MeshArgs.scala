package typings
package atPulumiAwsLib.appmeshMeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshArgs extends js.Object {
  /**
    * The name to use for the service mesh.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object MeshArgs {
  @scala.inline
  def apply(name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): MeshArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshArgs]
  }
}

