package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderIgnoreTags extends js.Object {
  var keyPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ProviderIgnoreTags {
  @scala.inline
  def apply(keyPrefixes: Input[js.Array[Input[String]]] = null, keys: Input[js.Array[Input[String]]] = null): ProviderIgnoreTags = {
    val __obj = js.Dynamic.literal()
    if (keyPrefixes != null) __obj.updateDynamic("keyPrefixes")(keyPrefixes.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderIgnoreTags]
  }
}

