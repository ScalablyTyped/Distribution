package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativePickerAndroidMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/NativePicker.android", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: Unit, context: js.Any) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/NativePicker.android", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: IItemProps): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  trait IPickerProp extends StObject {
    
    def doScrollingComplete(arg: js.Any*): Unit
    
    def select(arg: js.Any*): Unit
  }
  object IPickerProp {
    
    inline def apply(doScrollingComplete: /* repeated */ js.Any => Unit, select: /* repeated */ js.Any => Unit): IPickerProp = {
      val __obj = js.Dynamic.literal(doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[IPickerProp]
    }
    
    extension [Self <: IPickerProp](x: Self) {
      
      inline def setDoScrollingComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "doScrollingComplete", js.Any.fromFunction1(value))
      
      inline def setSelect(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    }
  }
}
