package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId extends js.Object {
  var dataId: String
  var negated: Boolean
  var `type`: String
}

object Anon_DataId {
  @scala.inline
  def apply(dataId: String, negated: Boolean, `type`: String): Anon_DataId = {
    val __obj = js.Dynamic.literal(dataId = dataId, negated = negated)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DataId]
  }
}

