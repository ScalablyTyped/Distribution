package typings.reactBootstrapTable.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  var comparator: CSSProperties
  var number: CSSProperties
}

object Number {
  @scala.inline
  def apply(comparator: CSSProperties, number: CSSProperties): Number = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

