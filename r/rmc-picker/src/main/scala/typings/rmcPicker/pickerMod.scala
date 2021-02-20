package typings.rmcPicker

import typings.rmcPicker.anon.ComponentDidUpdate
import typings.rmcPicker.pickerMixinMod.IItemProps
import typings.rmcPicker.pickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/Picker", JSImport.Default)
  @js.native
  class default () extends ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
    def this(props: IPickerProps, context: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/Picker", "default.Item")
    @js.native
    def Item(_props: IItemProps): js.Any = js.native
  }
  
  @js.native
  trait IPickerProp extends StObject {
    
    def computeChildIndex(arg: js.Any*): Double = js.native
    
    def doScrollingComplete(arg: js.Any*): Unit = js.native
    
    def select(arg: js.Any*): Unit = js.native
  }
  object IPickerProp {
    
    @scala.inline
    def apply(
      computeChildIndex: /* repeated */ js.Any => Double,
      doScrollingComplete: /* repeated */ js.Any => Unit,
      select: /* repeated */ js.Any => Unit
    ): IPickerProp = {
      val __obj = js.Dynamic.literal(computeChildIndex = js.Any.fromFunction1(computeChildIndex), doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[IPickerProp]
    }
    
    @scala.inline
    implicit class IPickerPropMutableBuilder[Self <: IPickerProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeChildIndex(value: /* repeated */ js.Any => Double): Self = StObject.set(x, "computeChildIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoScrollingComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "doScrollingComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelect(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    }
  }
}
