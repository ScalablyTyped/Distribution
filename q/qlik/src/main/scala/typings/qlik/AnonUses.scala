package typings.qlik

import typings.qlik.qlikStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUses extends js.Object {
  var uses: data
}

object AnonUses {
  @scala.inline
  def apply(uses: data): AnonUses = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUses]
  }
}

