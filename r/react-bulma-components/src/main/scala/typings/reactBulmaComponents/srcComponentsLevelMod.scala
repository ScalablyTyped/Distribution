package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Side
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.mobile
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsLevelMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/level", JSImport.Default)
  @js.native
  val default: (BulmaComponent[LevelProps, div]) & Side = js.native
  
  trait LevelProps extends StObject {
    
    var breakpoint: js.UndefOr[mobile] = js.undefined
  }
  object LevelProps {
    
    inline def apply(): LevelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LevelProps] (val x: Self) extends AnyVal {
      
      inline def setBreakpoint(value: mobile): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
    }
  }
  
  trait LevelSideProps extends StObject {
    
    var align: js.UndefOr[left | right] = js.undefined
  }
  object LevelSideProps {
    
    inline def apply(): LevelSideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelSideProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LevelSideProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[LevelProps, div]) & Side
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsLevelMod.foo` */
  override def _to: (BulmaComponent[LevelProps, div]) & Side = default
}
