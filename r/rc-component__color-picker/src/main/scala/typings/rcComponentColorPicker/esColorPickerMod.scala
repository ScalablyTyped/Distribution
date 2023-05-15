package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.anon.Popup
import typings.rcComponentColorPicker.anon.`0`
import typings.rcComponentColorPicker.esColorPickerPanelMod.ColorPickerPanelProps
import typings.rcComponentColorPicker.esInterfaceMod.TriggerPlacement
import typings.rcComponentColorPicker.esInterfaceMod.TriggerType
import typings.rcComponentTrigger.esInterfaceMod.BuildInPlacements
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esColorPickerMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/ColorPicker", JSImport.Default)
  @js.native
  val default: FC[ColorPickerProps] = js.native
  
  trait ColorPickerProps
    extends StObject
       with ColorPickerPanelProps {
    
    var arrow: js.UndefOr[Boolean] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var children: ReactElement
    
    var classNames: js.UndefOr[Popup] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Popup placement */
    var placement: js.UndefOr[TriggerPlacement] = js.undefined
    
    var styles: js.UndefOr[`0`] = js.undefined
    
    var trigger: js.UndefOr[TriggerType] = js.undefined
  }
  object ColorPickerProps {
    
    inline def apply(children: ReactElement): ColorPickerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPickerProps] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassNames(value: Popup): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: TriggerPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyles(value: `0`): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTrigger(value: TriggerType): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  type _To = FC[ColorPickerProps]
  
  /* This means you don't have to write `default`, but can instead just say `esColorPickerMod.foo` */
  override def _to: FC[ColorPickerProps] = default
}
