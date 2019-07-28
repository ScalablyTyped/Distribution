package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyNameParameters extends js.Object {
  var name: js.UndefOr[Input[String]] = js.undefined
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var serializationLibrary: js.UndefOr[Input[String]] = js.undefined
}

object Anon_KeyNameParameters {
  @scala.inline
  def apply(
    name: Input[String] = null,
    parameters: Input[StringDictionary[Input[String]]] = null,
    serializationLibrary: Input[String] = null
  ): Anon_KeyNameParameters = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serializationLibrary != null) __obj.updateDynamic("serializationLibrary")(serializationLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyNameParameters]
  }
}

