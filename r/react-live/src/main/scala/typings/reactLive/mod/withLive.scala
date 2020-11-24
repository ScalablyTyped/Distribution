package typings.reactLive.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-live", "withLive")
@js.native
object withLive extends js.Object {
  
  def apply[P](wrappedComponent: ComponentType[P]): ComponentClass[P, ComponentState] = js.native
}
