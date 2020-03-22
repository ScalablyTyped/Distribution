package typings.sloc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<sloc.sloc.Key, number> */
trait RecordKeynumber extends js.Object {
  var block: Double
  var blockEmpty: Double
  var comment: Double
  var empty: Double
  var mixed: Double
  var single: Double
  var source: Double
  var todo: Double
  var total: Double
}

object RecordKeynumber {
  @scala.inline
  def apply(
    block: Double,
    blockEmpty: Double,
    comment: Double,
    empty: Double,
    mixed: Double,
    single: Double,
    source: Double,
    todo: Double,
    total: Double
  ): RecordKeynumber = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], blockEmpty = blockEmpty.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], todo = todo.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RecordKeynumber]
  }
}

