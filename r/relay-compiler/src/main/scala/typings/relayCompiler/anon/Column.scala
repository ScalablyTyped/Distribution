package typings.relayCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  /**
    * The column in the source file that the tag starts on.
    *
    * Columns use 1-based indexing.
    */
  var column: Double
  /**
    * The line in the source file that the tag is placed on.
    *
    * Lines use 1-based indexing.
    */
  var line: Double
}

object Column {
  @scala.inline
  def apply(column: Double, line: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

