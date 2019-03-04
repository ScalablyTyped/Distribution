package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: java.lang.String, `type`: java.lang.String = null): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Query]
  }
}

