package typings.storybookApi.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagerProvider
  extends Component[ManagerProviderProps, State, js.Any] {
  
  var api: API = js.native
  
  def initModules(): Unit = js.native
  
  var modules: js.Array[Module] = js.native
  
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MManagerProvider(nextProps: ManagerProviderProps, nextState: State): Boolean = js.native
}
