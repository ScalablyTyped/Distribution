package typings.reactResolver

import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[P] extends js.Object {
  var Resolved: StatelessComponent[P]
  var data: js.Any
}

object AnonData {
  @scala.inline
  def apply[P](Resolved: StatelessComponent[P], data: js.Any): AnonData[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonData[P]]
  }
}

