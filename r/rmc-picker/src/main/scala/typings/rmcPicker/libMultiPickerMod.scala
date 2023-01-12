package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidMount
import typings.rmcPicker.anon.OnValueChange
import typings.rmcPicker.libMultiPickerPropsMod.IMultiPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultiPickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ComponentDidMount {
    def this(props: IMultiPickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IMultiPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/MultiPicker", "default.defaultProps")
    @js.native
    def defaultProps: OnValueChange = js.native
    inline def defaultProps_=(x: OnValueChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMultiPickerProp extends StObject {
    
    def getValue(): Any
  }
  object IMultiPickerProp {
    
    inline def apply(getValue: () => Any): IMultiPickerProp = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
      __obj.asInstanceOf[IMultiPickerProp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMultiPickerProp] (val x: Self) extends AnyVal {
      
      inline def setGetValue(value: () => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    }
  }
}
