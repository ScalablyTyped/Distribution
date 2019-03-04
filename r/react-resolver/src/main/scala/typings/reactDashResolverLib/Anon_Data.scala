package typings
package reactDashResolverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[P] extends js.Object {
  var Resolved: reactLib.reactMod.ReactNs.StatelessComponent[P]
  var data: js.Any
}

object Anon_Data {
  @scala.inline
  def apply[P](Resolved: reactLib.reactMod.ReactNs.StatelessComponent[P], data: js.Any): Anon_Data[P] = {
    val __obj = js.Dynamic.literal(Resolved = Resolved, data = data)
  
    __obj.asInstanceOf[Anon_Data[P]]
  }
}

