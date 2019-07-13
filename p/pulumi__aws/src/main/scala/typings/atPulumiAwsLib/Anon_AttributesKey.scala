package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesKey extends js.Object {
  var attributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var namespaceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AttributesKey {
  @scala.inline
  def apply(
    namespaceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    serviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    attributes: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): Anon_AttributesKey = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributesKey]
  }
}

