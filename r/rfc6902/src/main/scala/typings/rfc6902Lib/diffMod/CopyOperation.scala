package typings
package rfc6902Lib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyOperation extends Operation {
  var from: java.lang.String
  var op: rfc6902Lib.rfc6902LibStrings.copy
  var path: java.lang.String
}

object CopyOperation {
  @scala.inline
  def apply(from: java.lang.String, op: rfc6902Lib.rfc6902LibStrings.copy, path: java.lang.String): CopyOperation = {
    val __obj = js.Dynamic.literal(from = from, op = op, path = path)
  
    __obj.asInstanceOf[CopyOperation]
  }
}

