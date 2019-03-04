package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId extends js.Object {
  var dataId: java.lang.String
  var negated: scala.Boolean
  var `type`: java.lang.String
}

object Anon_DataId {
  @scala.inline
  def apply(dataId: java.lang.String, negated: scala.Boolean, `type`: java.lang.String): Anon_DataId = {
    val __obj = js.Dynamic.literal(dataId = dataId, negated = negated)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DataId]
  }
}

