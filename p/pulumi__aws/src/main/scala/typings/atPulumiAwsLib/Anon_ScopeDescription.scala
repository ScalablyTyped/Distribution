package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ScopeDescription extends js.Object {
  var scopeDescription: java.lang.String
  var scopeName: java.lang.String
}

object Anon_ScopeDescription {
  @scala.inline
  def apply(scopeDescription: java.lang.String, scopeName: java.lang.String): Anon_ScopeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scopeDescription")(scopeDescription)
    __obj.updateDynamic("scopeName")(scopeName)
    __obj.asInstanceOf[Anon_ScopeDescription]
  }
}

