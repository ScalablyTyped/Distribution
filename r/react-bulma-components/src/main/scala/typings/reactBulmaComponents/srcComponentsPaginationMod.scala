package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsPaginationMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/pagination", JSImport.Default)
  @js.native
  val default: BulmaComponent[PaginationProps, nav] = js.native
  
  trait PaginationProps extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var delta: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var next: js.UndefOr[ReactNode] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var previous: js.UndefOr[ReactNode] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var showFirstLast: js.UndefOr[Boolean] = js.undefined
    
    var showPrevNext: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setNext(value: ReactNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOnChange(value: /* page */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrevious(value: ReactNode): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setShowFirstLast(value: Boolean): Self = StObject.set(x, "showFirstLast", value.asInstanceOf[js.Any])
      
      inline def setShowFirstLastUndefined: Self = StObject.set(x, "showFirstLast", js.undefined)
      
      inline def setShowPrevNext(value: Boolean): Self = StObject.set(x, "showPrevNext", value.asInstanceOf[js.Any])
      
      inline def setShowPrevNextUndefined: Self = StObject.set(x, "showPrevNext", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type _To = BulmaComponent[PaginationProps, nav]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsPaginationMod.foo` */
  override def _to: BulmaComponent[PaginationProps, nav] = default
}
