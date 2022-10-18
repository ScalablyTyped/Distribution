package typings.reactNativeNavigation

import typings.react.mod.FunctionComponent
import typings.reactNativeNavigation.libDistSrcInterfacesNavigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesNavigationFunctionComponentMod {
  
  @js.native
  trait NavigationFunctionComponent[Props]
    extends StObject
       with FunctionComponent[Props & NavigationComponentProps] {
    
    var options: js.UndefOr[(js.Function1[/* props */ Props & NavigationComponentProps, Options]) | Options] = js.native
  }
}
