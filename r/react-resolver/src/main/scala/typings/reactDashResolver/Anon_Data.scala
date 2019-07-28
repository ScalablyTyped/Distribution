package typings.reactDashResolver

import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[P] extends js.Object {
  var Resolved: StatelessComponent[P]
  var data: js.Any
}

object Anon_Data {
  @scala.inline
  def apply[P](Resolved: StatelessComponent[P], data: js.Any): Anon_Data[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved, data = data)
  
    __obj.asInstanceOf[Anon_Data[P]]
  }
}

