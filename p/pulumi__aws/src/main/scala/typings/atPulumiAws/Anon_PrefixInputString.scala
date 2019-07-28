package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixInputString extends js.Object {
  var prefix: js.UndefOr[Input[String]] = js.undefined
}

object Anon_PrefixInputString {
  @scala.inline
  def apply(prefix: Input[String] = null): Anon_PrefixInputString = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrefixInputString]
  }
}

