package typings.storybookComponents

import typings.std.Element
import typings.storybookComponents.anon.PartialOptions
import typings.storybookComponents.popperjsCoreLibEnumsMod.Boundary
import typings.storybookComponents.popperjsCoreLibEnumsMod.Context
import typings.storybookComponents.popperjsCoreLibEnumsMod.Placement
import typings.storybookComponents.popperjsCoreLibEnumsMod.RootBoundary
import typings.storybookComponents.popperjsCoreLibTypesMod.Padding
import typings.storybookComponents.popperjsCoreLibTypesMod.SideObject
import typings.storybookComponents.popperjsCoreLibTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperjsCoreLibUtilsDetectOverflowMod {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-utils-detectOverflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: State): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[SideObject]
  inline def default(state: State, options: PartialOptions): SideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideObject]
  
  trait Options extends StObject {
    
    var altBoundary: Boolean
    
    var boundary: Boundary
    
    var elementContext: Context
    
    var padding: Padding
    
    var placement: Placement
    
    var rootBoundary: RootBoundary
  }
  object Options {
    
    inline def apply(
      altBoundary: Boolean,
      boundary: Boundary,
      elementContext: Context,
      padding: Padding,
      placement: Placement,
      rootBoundary: RootBoundary
    ): Options = {
      val __obj = js.Dynamic.literal(altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], elementContext = elementContext.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setElementContext(value: Context): Self = StObject.set(x, "elementContext", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
    }
  }
}
