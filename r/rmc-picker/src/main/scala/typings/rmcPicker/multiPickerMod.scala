package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidMount
import typings.rmcPicker.anon.OnValueChange
import typings.rmcPicker.multiPickerPropsMod.IMultiPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiPickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
  @js.native
  class default () extends ComponentDidMount {
    def this(props: IMultiPickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IMultiPickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/MultiPicker", "default.defaultProps")
    @js.native
    def defaultProps: OnValueChange = js.native
    @scala.inline
    def defaultProps_=(x: OnValueChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IMultiPickerProp extends StObject {
    
    def getValue(): js.Any = js.native
  }
  object IMultiPickerProp {
    
    @scala.inline
    def apply(getValue: () => js.Any): IMultiPickerProp = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[IMultiPickerProp]
    }
    
    @scala.inline
    implicit class IMultiPickerPropMutableBuilder[Self <: IMultiPickerProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
}
