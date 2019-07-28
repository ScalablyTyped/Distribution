package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: String, `type`: String = null): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Query]
  }
}

