package typings.reactNativeWindows

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactNativeWindows.anon.Children
import typings.reactNativeWindows.appThemeMod.AppThemeModule
import typings.reactNativeWindows.appThemeMod.MissingNativeAppThemeShim
import typings.reactNativeWindows.datePickerPropsMod.IDatePickerProps
import typings.reactNativeWindows.flyoutMod.IFlyoutTargetState
import typings.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import typings.reactNativeWindows.pickerPropsMod.IPickerProps
import typings.reactNativeWindows.pickerWindowsMod.PickerItem
import typings.reactNativeWindows.pickerWindowsMod.PickerPropsWithChildren
import typings.reactNativeWindows.pickerWindowsMod.State
import typings.reactNativeWindows.popupMod.IPopupTargetState
import typings.reactNativeWindows.popupPropsMod.IPopupProps
import typings.reactNativeWindows.viewWindowsMod.ViewWindowsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-windows", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AppTheme: AppThemeModule | MissingNativeAppThemeShim = js.native
  
  val ViewWindows: ViewWindowsType = js.native
  
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
  
  @js.native
  class DatePicker protected ()
    extends typings.reactNativeWindows.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
  }
  /* static members */
  @js.native
  object DatePicker extends js.Object {
    
    var defaultProps: IDatePickerProps = js.native
  }
  
  @js.native
  object EventPhase extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeWindows.keyboardExtPropsMod.EventPhase with Double] = js.native
    
    /* 2 */ val AtTarget: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.AtTarget with Double = js.native
    
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Capturing with Double = js.native
    
    /* 0 */ val None: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.None with Double = js.native
  }
  
  @js.native
  class Flyout protected ()
    extends typings.reactNativeWindows.flyoutMod.Flyout {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  @js.native
  object Flyout extends js.Object {
    
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
  }
  
  @js.native
  class Glyph ()
    extends typings.reactNativeWindows.glyphMod.Glyph
  
  @js.native
  object HandledEventPhase extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase with Double] = js.native
    
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Capturing with Double = js.native
  }
  
  @js.native
  class Picker protected ()
    extends typings.reactNativeWindows.pickerWindowsMod.Picker {
    def this(props: IPickerProps) = this()
  }
  /* static members */
  @js.native
  object Picker extends js.Object {
    
    var Item: Instantiable0[PickerItem] = js.native
    
    def getDerivedStateFromProps(props: PickerPropsWithChildren): State = js.native
  }
  
  @js.native
  class Popup protected ()
    extends typings.reactNativeWindows.popupMod.Popup {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  @js.native
  object Popup extends js.Object {
    
    def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = js.native
  }
}
