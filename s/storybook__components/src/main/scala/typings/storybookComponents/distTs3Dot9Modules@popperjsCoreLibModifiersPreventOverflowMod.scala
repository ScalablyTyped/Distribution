package typings.storybookComponents

import org.scalablytyped.runtime.Shortcut
import typings.std.Element
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.Boundary
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibEnumsMod`.RootBoundary
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Modifier
import typings.storybookComponents.`distTs3Dot9Modules@popperjsCoreLibTypesMod`.Padding
import typings.storybookComponents.anon.AltAxis
import typings.storybookComponents.anon.Placement
import typings.storybookComponents.storybookComponentsStrings.preventOverflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTs3Dot9Modules@popperjsCoreLibModifiersPreventOverflowMod` extends Shortcut {
  
  @JSImport("@storybook/components/dist/ts3.9/_modules/@popperjs-core-lib-modifiers-preventOverflow", JSImport.Default)
  @js.native
  val default: PreventOverflowModifier = js.native
  
  trait Options extends StObject {
    
    var altAxis: Boolean
    
    var altBoundary: Boolean
    
    var boundary: Boundary
    
    var mainAxis: Boolean
    
    var padding: Padding
    
    var rootBoundary: RootBoundary
    
    /**
      * Allows the popper to overflow from its boundaries to keep it near its
      * reference element
      */
    var tether: Boolean
    
    var tetherOffset: TetherOffset
  }
  object Options {
    
    inline def apply(
      altAxis: Boolean,
      altBoundary: Boolean,
      boundary: Boundary,
      mainAxis: Boolean,
      padding: Padding,
      rootBoundary: RootBoundary,
      tether: Boolean,
      tetherOffset: TetherOffset
    ): Options = {
      val __obj = js.Dynamic.literal(altAxis = altAxis.asInstanceOf[js.Any], altBoundary = altBoundary.asInstanceOf[js.Any], boundary = boundary.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], rootBoundary = rootBoundary.asInstanceOf[js.Any], tether = tether.asInstanceOf[js.Any], tetherOffset = tetherOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAltAxis(value: Boolean): Self = StObject.set(x, "altAxis", value.asInstanceOf[js.Any])
      
      inline def setAltBoundary(value: Boolean): Self = StObject.set(x, "altBoundary", value.asInstanceOf[js.Any])
      
      inline def setBoundary(value: Boundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryVarargs(value: Element*): Self = StObject.set(x, "boundary", js.Array(value*))
      
      inline def setMainAxis(value: Boolean): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setRootBoundary(value: RootBoundary): Self = StObject.set(x, "rootBoundary", value.asInstanceOf[js.Any])
      
      inline def setTether(value: Boolean): Self = StObject.set(x, "tether", value.asInstanceOf[js.Any])
      
      inline def setTetherOffset(value: TetherOffset): Self = StObject.set(x, "tetherOffset", value.asInstanceOf[js.Any])
      
      inline def setTetherOffsetFunction1(value: /* arg0 */ Placement => Double | AltAxis): Self = StObject.set(x, "tetherOffset", js.Any.fromFunction1(value))
    }
  }
  
  type PreventOverflowModifier = Modifier[preventOverflow, Options]
  
  type TetherOffset = (js.Function1[/* arg0 */ Placement, Double | AltAxis]) | Double | AltAxis
  
  type _To = PreventOverflowModifier
  
  /* This means you don't have to write `default`, but can instead just say ``distTs3Dot9Modules@popperjsCoreLibModifiersPreventOverflowMod`.foo` */
  override def _to: PreventOverflowModifier = default
}
