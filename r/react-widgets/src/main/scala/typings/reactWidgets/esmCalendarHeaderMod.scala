package typings.reactWidgets

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactWidgets.esmLocalizationMod.Localizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCalendarHeaderMod {
  
  @JSImport("react-widgets/esm/CalendarHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isRtl: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var localizer: Localizer[Any, Any]
    
    var navigateNextIcon: js.UndefOr[ReactNode] = js.undefined
    
    var navigatePrevIcon: js.UndefOr[ReactNode] = js.undefined
    
    var nextDisabled: Boolean
    
    def onMoveLeft(): Unit
    
    def onMoveRight(): Unit
    
    def onMoveToday(): Unit
    
    def onViewChange(): Unit
    
    var prevDisabled: Boolean
    
    var todayDisabled: Boolean
    
    var upDisabled: Boolean
  }
  object Props {
    
    inline def apply(
      label: String,
      localizer: Localizer[Any, Any],
      nextDisabled: Boolean,
      onMoveLeft: () => Unit,
      onMoveRight: () => Unit,
      onMoveToday: () => Unit,
      onViewChange: () => Unit,
      prevDisabled: Boolean,
      todayDisabled: Boolean,
      upDisabled: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], nextDisabled = nextDisabled.asInstanceOf[js.Any], onMoveLeft = js.Any.fromFunction0(onMoveLeft), onMoveRight = js.Any.fromFunction0(onMoveRight), onMoveToday = js.Any.fromFunction0(onMoveToday), onViewChange = js.Any.fromFunction0(onViewChange), prevDisabled = prevDisabled.asInstanceOf[js.Any], todayDisabled = todayDisabled.asInstanceOf[js.Any], upDisabled = upDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLocalizer(value: Localizer[Any, Any]): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
      
      inline def setNavigateNextIcon(value: ReactNode): Self = StObject.set(x, "navigateNextIcon", value.asInstanceOf[js.Any])
      
      inline def setNavigateNextIconUndefined: Self = StObject.set(x, "navigateNextIcon", js.undefined)
      
      inline def setNavigatePrevIcon(value: ReactNode): Self = StObject.set(x, "navigatePrevIcon", value.asInstanceOf[js.Any])
      
      inline def setNavigatePrevIconUndefined: Self = StObject.set(x, "navigatePrevIcon", js.undefined)
      
      inline def setNextDisabled(value: Boolean): Self = StObject.set(x, "nextDisabled", value.asInstanceOf[js.Any])
      
      inline def setOnMoveLeft(value: () => Unit): Self = StObject.set(x, "onMoveLeft", js.Any.fromFunction0(value))
      
      inline def setOnMoveRight(value: () => Unit): Self = StObject.set(x, "onMoveRight", js.Any.fromFunction0(value))
      
      inline def setOnMoveToday(value: () => Unit): Self = StObject.set(x, "onMoveToday", js.Any.fromFunction0(value))
      
      inline def setOnViewChange(value: () => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction0(value))
      
      inline def setPrevDisabled(value: Boolean): Self = StObject.set(x, "prevDisabled", value.asInstanceOf[js.Any])
      
      inline def setTodayDisabled(value: Boolean): Self = StObject.set(x, "todayDisabled", value.asInstanceOf[js.Any])
      
      inline def setUpDisabled(value: Boolean): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
    }
  }
}
