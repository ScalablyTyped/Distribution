package typings.qlik

import typings.qlik.qlikStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var uses: data
}

object AnonData {
  @scala.inline
  def apply(uses: data): AnonData = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData]
  }
}

