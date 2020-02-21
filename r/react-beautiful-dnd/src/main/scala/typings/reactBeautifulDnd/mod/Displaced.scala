package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displaced extends js.Object {
  var backwards: DisplacementGroups
  var forwards: DisplacementGroups
}

object Displaced {
  @scala.inline
  def apply(backwards: DisplacementGroups, forwards: DisplacementGroups): Displaced = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], forwards = forwards.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Displaced]
  }
}

