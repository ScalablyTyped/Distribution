package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.Item
import typings.reactBulmaComponents.reactBulmaComponentsStrings.arrow
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bullet
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.dot
import typings.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.succeeds
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsBreadcrumbMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/breadcrumb", JSImport.Default)
  @js.native
  val default: (BulmaComponent[BreadcrumbProps, nav]) & Item = js.native
  
  trait BreadcrumbItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbItemProps {
    
    inline def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    extension [Self <: BreadcrumbItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait BreadcrumbProps extends StObject {
    
    var align: js.UndefOr[right | center] = js.undefined
    
    var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    extension [Self <: BreadcrumbProps](x: Self) {
      
      inline def setAlign(value: right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setSeparator(value: arrow | bullet | dot | succeeds): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[BreadcrumbProps, nav]) & Item
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsBreadcrumbMod.foo` */
  override def _to: (BulmaComponent[BreadcrumbProps, nav]) & Item = default
}
