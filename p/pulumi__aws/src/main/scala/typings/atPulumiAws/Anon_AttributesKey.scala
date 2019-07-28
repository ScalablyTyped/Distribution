package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesKey extends js.Object {
  var attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var namespaceName: Input[String]
  var serviceName: Input[String]
}

object Anon_AttributesKey {
  @scala.inline
  def apply(
    namespaceName: Input[String],
    serviceName: Input[String],
    attributes: Input[StringDictionary[Input[String]]] = null
  ): Anon_AttributesKey = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AttributesKey]
  }
}

