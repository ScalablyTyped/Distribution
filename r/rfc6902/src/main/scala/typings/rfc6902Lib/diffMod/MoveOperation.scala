package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveOperation extends Operation {
  var from: java.lang.String
  var op: rfc6902Lib.rfc6902LibStrings.move
  var path: java.lang.String
}

object MoveOperation {
  @scala.inline
  def apply(from: java.lang.String, op: rfc6902Lib.rfc6902LibStrings.move, path: java.lang.String): MoveOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[MoveOperation]
  }
}

