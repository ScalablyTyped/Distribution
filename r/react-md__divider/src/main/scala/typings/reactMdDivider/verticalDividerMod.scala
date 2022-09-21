package typings.reactMdDivider

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalDividerMod {
  
  @JSImport("@react-md/divider/types/VerticalDivider", "VerticalDivider")
  @js.native
  val VerticalDivider: ForwardRefExoticComponent[VerticalDividerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait VerticalDividerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /** {@inheritDoc VerticalDividerHookOptions.maxHeight} */
    var maxHeight: js.UndefOr[Double] = js.undefined
  }
  object VerticalDividerProps {
    
    inline def apply(): VerticalDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalDividerProps]
    }
    
    extension [Self <: VerticalDividerProps](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    }
  }
}
