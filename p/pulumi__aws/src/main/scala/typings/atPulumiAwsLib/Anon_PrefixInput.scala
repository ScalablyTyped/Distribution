package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixInput extends js.Object {
  var prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_PrefixInput {
  @scala.inline
  def apply(prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_PrefixInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrefixInput]
  }
}

