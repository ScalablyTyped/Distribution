package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationModes extends js.Object {
  var location: js.UndefOr[Input[String]] = js.undefined
  var modes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_LocationModes {
  @scala.inline
  def apply(
    location: Input[String] = null,
    modes: Input[js.Array[Input[String]]] = null,
    `type`: Input[String] = null
  ): Anon_LocationModes = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocationModes]
  }
}

