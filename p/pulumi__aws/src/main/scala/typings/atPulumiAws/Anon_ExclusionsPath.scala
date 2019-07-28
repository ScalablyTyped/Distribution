package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExclusionsPath extends js.Object {
  var exclusions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var path: Input[String]
}

object Anon_ExclusionsPath {
  @scala.inline
  def apply(path: Input[String], exclusions: Input[js.Array[Input[String]]] = null): Anon_ExclusionsPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (exclusions != null) __obj.updateDynamic("exclusions")(exclusions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExclusionsPath]
  }
}

