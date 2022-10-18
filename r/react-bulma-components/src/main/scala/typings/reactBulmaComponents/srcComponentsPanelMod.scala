package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Block
import typings.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsPanelMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/panel", JSImport.Default)
  @js.native
  val default: (BulmaComponent[PanelProps, nav]) & Block = js.native
  
  trait PanelBlockProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object PanelBlockProps {
    
    inline def apply(): PanelBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelBlockProps]
    }
    
    extension [Self <: PanelBlockProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait PanelProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
  }
  object PanelProps {
    
    inline def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait PanelTabProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object PanelTabProps {
    
    inline def apply(): PanelTabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelTabProps]
    }
    
    extension [Self <: PanelTabProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[PanelProps, nav]) & Block
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsPanelMod.foo` */
  override def _to: (BulmaComponent[PanelProps, nav]) & Block = default
}
