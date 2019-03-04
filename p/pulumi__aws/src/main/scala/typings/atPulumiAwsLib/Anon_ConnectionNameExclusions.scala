package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionNameExclusions extends js.Object {
  var connectionName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var exclusions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var path: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ConnectionNameExclusions {
  @scala.inline
  def apply(
    connectionName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    path: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    exclusions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_ConnectionNameExclusions = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConnectionNameExclusions]
  }
}

