package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: java.lang.String
  var condition: java.lang.String
  var relation: java.lang.String
}

object Anon_Column {
  @scala.inline
  def apply(column: java.lang.String, condition: java.lang.String, relation: java.lang.String): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, condition = condition, relation = relation)
  
    __obj.asInstanceOf[Anon_Column]
  }
}

