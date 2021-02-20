package typings.reactNavigation.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import typings.reactNavigation.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeAreaViewProps extends ViewProps {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var forceInset: js.UndefOr[Bottom] = js.native
}
object SafeAreaViewProps {
  
  @scala.inline
  def apply(): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaViewProps]
  }
  
  @scala.inline
  implicit class SafeAreaViewPropsMutableBuilder[Self <: SafeAreaViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setForceInset(value: Bottom): Self = StObject.set(x, "forceInset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceInsetUndefined: Self = StObject.set(x, "forceInset", js.undefined)
  }
}
