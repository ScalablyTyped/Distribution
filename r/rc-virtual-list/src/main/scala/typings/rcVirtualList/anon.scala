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
    
    extension [Self <: Align](x: Self) {
      
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
    
    extension [Self <: Children](x: Self) {
      
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
    
    extension [Self <: Index](x: Self) {
      
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
    
    extension [Self <: Key](x: Self) {
      
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
    
    extension [Self <: Ref](x: Self) {
      
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
    
    extension [Self <: Style](x: Self) {
      
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
