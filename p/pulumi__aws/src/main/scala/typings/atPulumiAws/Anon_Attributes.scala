package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var namespaceName: String
  var serviceName: String
}

object Anon_Attributes {
  @scala.inline
  def apply(namespaceName: String, serviceName: String, attributes: StringDictionary[String] = null): Anon_Attributes = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName, serviceName = serviceName)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

