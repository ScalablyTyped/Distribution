package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionNameExclusions extends js.Object {
  var connectionName: Input[String]
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var path: Input[String]
}

object Anon_ConnectionNameExclusions {
  @scala.inline
  def apply(
    connectionName: Input[String],
    path: Input[String],
    exclusions: Input[js.Array[Input[String]]] = null
  ): Anon_ConnectionNameExclusions = {
    val __obj = js.Dynamic.literal(connectionName = connectionName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConnectionNameExclusions]
  }
}

