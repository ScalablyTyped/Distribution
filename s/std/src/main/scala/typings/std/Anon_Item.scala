package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var length: Double
  def Item(n: Double): java.lang.String
}

object Anon_Item {
  @scala.inline
  def apply(Item: Double => java.lang.String, length: Double): Anon_Item = {
    val __obj = js.Dynamic.literal(Item = js.Any.fromFunction1(Item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Item]
  }
}

