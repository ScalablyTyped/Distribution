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
  def apply(Item: js.Function1[scala.Double, java.lang.String], length: scala.Double): Anon_Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[Anon_Item]
  }
}

