package typings.rcComponentTour

import typings.rcComponentTour.anon.Color
import typings.rcComponentTour.anon.Placeholder
import typings.rcComponentTour.anon.PointAtCenter
import typings.rcComponentTour.esHooksUseTargetMod.Gap
import typings.rcComponentTour.esPlacementsMod.PlacementType
import typings.rcComponentTour.esTourStepMod.TourStepInfo
import typings.rcComponentTour.esTourStepMod.TourStepProps
import typings.rcComponentTrigger.esInterfaceMod.AlignType
import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.ScrollIntoViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTourMod {
  
  @JSImport("@rc-component/tour/es/Tour", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TourProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent std.Pick<@rc-component/trigger.@rc-component/trigger.TriggerProps, 'onPopupAlign' | 'builtinPlacements'> */
  trait TourProps extends StObject {
    
    var animated: js.UndefOr[Boolean | Placeholder] = js.undefined
    
    var arrow: js.UndefOr[Boolean | PointAtCenter] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var current: js.UndefOr[Double] = js.undefined
    
    var defaultCurrent: js.UndefOr[Double] = js.undefined
    
    var gap: js.UndefOr[Gap] = js.undefined
    
    var mask: js.UndefOr[Boolean | Color] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[PlacementType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderPanel: js.UndefOr[js.Function2[/* props */ TourStepProps, /* current */ Double, ReactNode]] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var scrollIntoViewOptions: js.UndefOr[Boolean | ScrollIntoViewOptions] = js.undefined
    
    var steps: js.UndefOr[js.Array[TourStepInfo]] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TourProps {
    
    inline def apply(): TourProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TourProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TourProps] (val x: Self) extends AnyVal {
      
      inline def setAnimated(value: Boolean | Placeholder): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setArrow(value: Boolean | PointAtCenter): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setDefaultCurrent(value: Double): Self = StObject.set(x, "defaultCurrent", value.asInstanceOf[js.Any])
      
      inline def setDefaultCurrentUndefined: Self = StObject.set(x, "defaultCurrent", js.undefined)
      
      inline def setGap(value: Gap): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setMask(value: Boolean | Color): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnChange(value: /* current */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* current */ Double => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFinish(value: () => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction0(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRenderPanel(value: (/* props */ TourStepProps, /* current */ Double) => ReactNode): Self = StObject.set(x, "renderPanel", js.Any.fromFunction2(value))
      
      inline def setRenderPanelUndefined: Self = StObject.set(x, "renderPanel", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setScrollIntoViewOptions(value: Boolean | ScrollIntoViewOptions): Self = StObject.set(x, "scrollIntoViewOptions", value.asInstanceOf[js.Any])
      
      inline def setScrollIntoViewOptionsUndefined: Self = StObject.set(x, "scrollIntoViewOptions", js.undefined)
      
      inline def setSteps(value: js.Array[TourStepInfo]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setStepsVarargs(value: TourStepInfo*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
