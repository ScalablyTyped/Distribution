package typings.reactNavigation.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import typings.reactNavigation.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeAreaViewProps
  extends StObject
     with ViewProps {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var forceInset: js.UndefOr[Bottom] = js.undefined
}
object SafeAreaViewProps {
  
  inline def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  
  extension [Self <: SafeAreaViewProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
    
    inline def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
  }
}
