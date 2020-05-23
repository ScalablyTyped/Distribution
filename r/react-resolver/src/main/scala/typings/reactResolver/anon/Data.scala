package typings.reactResolver.anon

import typings.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[P] extends js.Object {
  var Resolved: StatelessComponent[P]
  var data: js.Any
}

object Data {
  @scala.inline
  def apply[P](Resolved: StatelessComponent[P], data: js.Any): Data[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[P]]
  }
}

