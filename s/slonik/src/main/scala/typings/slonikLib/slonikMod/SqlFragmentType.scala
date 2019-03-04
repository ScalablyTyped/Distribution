package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlFragmentType extends js.Object {
  var parameters: js.Array[PrimitiveValueExpressionType]
  var sql: java.lang.String
}

object SqlFragmentType {
  @scala.inline
  def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: java.lang.String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters, sql = sql)
  
    __obj.asInstanceOf[SqlFragmentType]
  }
}

