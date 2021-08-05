package typings.storybookComponents

import typings.overlayscrollbars.mod.Extensions
import typings.overlayscrollbars.mod.Options
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayScrollbarsComponentMod {
  
  @JSImport("@storybook/components/dist/ScrollArea/OverlayScrollbarsComponent", "OverlayScrollbarsComponent")
  @js.native
  val OverlayScrollbarsComponent: FC[OverlayScrollbarsComponentProps] = js.native
  
  trait OverlayScrollbarsComponentProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    @JSName("children")
    var children_OverlayScrollbarsComponentProps: js.UndefOr[js.Any] = js.undefined
    
    var extensions: js.UndefOr[Extensions] = js.undefined
    
    var options: js.UndefOr[Options] = js.undefined
  }
  object OverlayScrollbarsComponentProps {
    
    inline def apply(): OverlayScrollbarsComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayScrollbarsComponentProps]
    }
    
    extension [Self <: OverlayScrollbarsComponentProps](x: Self) {
      
      inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setExtensions(value: Extensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
