package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardWhitelistedNames extends js.Object {
  var forward: Input[String]
  var whitelistedNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_ForwardWhitelistedNames {
  @scala.inline
  def apply(forward: Input[String], whitelistedNames: Input[js.Array[Input[String]]] = null): Anon_ForwardWhitelistedNames = {
    val __obj = js.Dynamic.literal(forward = forward.asInstanceOf[js.Any])
    if (whitelistedNames != null) __obj.updateDynamic("whitelistedNames")(whitelistedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardWhitelistedNames]
  }
}

