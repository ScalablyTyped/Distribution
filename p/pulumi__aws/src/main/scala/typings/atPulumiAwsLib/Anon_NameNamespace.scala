package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNamespace extends js.Object {
  var name: java.lang.String
  var namespace: java.lang.String
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Anon_NameNamespace {
  @scala.inline
  def apply(
    name: java.lang.String,
    namespace: java.lang.String,
    value: java.lang.String,
    resource: java.lang.String = null
  ): Anon_NameNamespace = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Anon_NameNamespace]
  }
}

