package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var namespaceName: java.lang.String
  var serviceName: java.lang.String
}

object Anon_Attributes {
  @scala.inline
  def apply(
    namespaceName: java.lang.String,
    serviceName: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName, serviceName = serviceName)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

