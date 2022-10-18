package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distNetworkNetworkMod.NetworkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkWithNetworkMod {
  
  @JSImport("react-fns/dist/Network/withNetwork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withNetwork[Props](Component: ComponentType[Props & NetworkProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNetwork")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
