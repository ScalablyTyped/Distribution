package typings.rcVirtualList

import typings.node.timersMod.global.NodeJS.Timeout
import typings.rcVirtualList.esListMod.ListRef
import typings.rcVirtualList.esListMod.ScrollAlign
import typings.rcVirtualList.esListMod.ScrollConfig
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align
    extends StObject
       with ScrollConfig {
    
    var align: js.UndefOr[ScrollAlign] = js.undefined
    
    var index: Double
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Align {
    
    inline def apply(index: Double): Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[typings.react.mod.Ref[ListRef]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRef(value: typings.react.mod.Ref[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var multiple: Boolean
  }
  object Index {
    
    inline def apply(index: Double, multiple: Boolean): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key
    extends StObject
       with ScrollConfig {
    
    var align: js.UndefOr[ScrollAlign] = js.undefined
    
    var key: typings.react.mod.Key
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Key {
    
    inline def apply(key: typings.react.mod.Key): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait Ref extends StObject {
    
    var ref: js.UndefOr[typings.react.mod.Ref[ListRef]] = js.undefined
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
      
      inline def setRef(value: typings.react.mod.Ref[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TypeofsetTimeout extends StObject {
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    def apply(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.native
    def apply(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = js.native
    /**
      * Schedules execution of a one-time `callback` after `delay` milliseconds.
      *
      * The `callback` will likely not be invoked in precisely `delay` milliseconds.
      * Node.js makes no guarantees about the exact timing of when callbacks will fire,
      * nor of their ordering. The callback will be called as close as possible to the
      * time specified.
      *
      * When `delay` is larger than `2147483647` or less than `1`, the `delay`will be set to `1`. Non-integer delays are truncated to an integer.
      *
      * If `callback` is not a function, a `TypeError` will be thrown.
      *
      * This method has a custom variant for promises that is available using `timersPromises.setTimeout()`.
      * @since v0.0.1
      * @param callback The function to call when the timer elapses.
      * @param [delay=1] The number of milliseconds to wait before calling the `callback`.
      * @param args Optional arguments to pass when the `callback` is called.
      * @return for use with {@link clearTimeout}
      */
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
    def apply[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = js.native
  }
}
