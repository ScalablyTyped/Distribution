package typings.slonik.slonikMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinarySqlTokenType extends _SqlTokenType {
  var data: Buffer
  var `type`: js.Symbol
}

object BinarySqlTokenType {
  @scala.inline
  def apply(data: Buffer, `type`: js.Symbol): BinarySqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinarySqlTokenType]
  }
}

