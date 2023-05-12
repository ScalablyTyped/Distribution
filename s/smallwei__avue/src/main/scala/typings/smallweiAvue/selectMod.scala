package typings.smallweiAvue

import org.scalablytyped.runtime.Instantiable0
import typings.smallweiAvue.anon.Item
import typings.smallweiAvue.anon.PropsAvueSelectProps
import typings.smallweiAvue.anon.ValueT
import typings.smallweiAvue.dicMod.DicItem
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue/select", "AvueSelect")
  @js.native
  open class AvueSelect ()
    extends StObject
       with PropsAvueSelectProps {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueSelectProps[Any] = js.native
  }
  @JSImport("@smallwei/avue/select", "AvueSelect")
  @js.native
  val AvueSelect: Instantiable0[PropsAvueSelectProps] = js.native
  
  type AvueSelectInstance = InstanceType[Instantiable0[PropsAvueSelectProps]]
  
  trait AvueSelectProps[T] extends StObject {
    
    /** 是否显示全选 */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /** 字典 */
    var dic: js.UndefOr[js.Array[DicItem]] = js.undefined
    
    var modelValue: js.UndefOr[T] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* data */ ValueT[T], Unit]] = js.undefined
    
    @JSName("onUpdate:modelValue")
    var onUpdateColonmodelValue: js.UndefOr[js.Function1[/* val */ T, Any]] = js.undefined
    
    /** 是否使用虚拟列表 */
    var virtualize: js.UndefOr[Boolean] = js.undefined
  }
  object AvueSelectProps {
    
    inline def apply[T](): AvueSelectProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueSelectProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueSelectProps[?], T] (val x: Self & AvueSelectProps[T]) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setDic(value: js.Array[DicItem]): Self = StObject.set(x, "dic", value.asInstanceOf[js.Any])
      
      inline def setDicUndefined: Self = StObject.set(x, "dic", js.undefined)
      
      inline def setDicVarargs(value: DicItem*): Self = StObject.set(x, "dic", js.Array(value*))
      
      inline def setModelValue(value: T): Self = StObject.set(x, "modelValue", value.asInstanceOf[js.Any])
      
      inline def setModelValueUndefined: Self = StObject.set(x, "modelValue", js.undefined)
      
      inline def setOnChange(value: /* data */ ValueT[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnUpdateColonmodelValue(value: /* val */ T => Any): Self = StObject.set(x, "onUpdate:modelValue", js.Any.fromFunction1(value))
      
      inline def setOnUpdateColonmodelValueUndefined: Self = StObject.set(x, "onUpdate:modelValue", js.undefined)
      
      inline def setVirtualize(value: Boolean): Self = StObject.set(x, "virtualize", value.asInstanceOf[js.Any])
      
      inline def setVirtualizeUndefined: Self = StObject.set(x, "virtualize", js.undefined)
    }
  }
  
  trait AvueSelectSlots extends StObject {
    
    def default(scoped: Item): js.Array[VNode]
  }
  object AvueSelectSlots {
    
    inline def apply(default: Item => js.Array[VNode]): AvueSelectSlots = {
      val __obj = js.Dynamic.literal(default = js.Any.fromFunction1(default))
      __obj.asInstanceOf[AvueSelectSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueSelectSlots] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Item => js.Array[VNode]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
    }
  }
}
