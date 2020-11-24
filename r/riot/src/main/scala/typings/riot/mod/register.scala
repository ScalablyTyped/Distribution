package typings.riot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("riot", "register")
@js.native
object register extends js.Object {
  
  def apply[Props, State](componentName: String, shell: RiotComponentShell[Props, State]): RegisteredComponentsMap = js.native
}
