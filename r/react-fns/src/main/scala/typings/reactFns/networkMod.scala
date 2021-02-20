package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.networkNetworkMod.NetworkProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkMod {
  
  @JSImport("react-fns/dist/Network", "Network")
  @js.native
  class Network protected ()
    extends typings.reactFns.networkNetworkMod.Network {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/Network", "withNetwork")
  @js.native
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
}
