package typings
package sqlDotJsLib.sqlDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResults extends js.Object {
  var columns: js.Array[java.lang.String]
  var values: js.Array[ValueType]
}

object QueryResults {
  @scala.inline
  def apply(columns: js.Array[java.lang.String], values: js.Array[ValueType]): QueryResults = {
    val __obj = js.Dynamic.literal(columns = columns, values = values)
  
    __obj.asInstanceOf[QueryResults]
  }
}

