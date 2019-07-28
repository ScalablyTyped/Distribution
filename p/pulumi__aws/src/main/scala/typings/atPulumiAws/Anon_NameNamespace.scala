package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNamespace extends js.Object {
  var name: String
  var namespace: String
  var resource: js.UndefOr[String] = js.undefined
  var value: String
}

object Anon_NameNamespace {
  @scala.inline
  def apply(name: String, namespace: String, value: String, resource: String = null): Anon_NameNamespace = {
    val __obj = js.Dynamic.literal(name = name, namespace = namespace, value = value)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Anon_NameNamespace]
  }
}

