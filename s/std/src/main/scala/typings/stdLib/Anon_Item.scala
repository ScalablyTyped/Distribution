package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var length: scala.Double
  def Item(n: scala.Double): java.lang.String
}

object Anon_Item {
  @scala.inline
  def apply(Item: scala.Double => java.lang.String, length: scala.Double): Anon_Item = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length)
  
    __obj.asInstanceOf[Anon_Item]
  }
}

