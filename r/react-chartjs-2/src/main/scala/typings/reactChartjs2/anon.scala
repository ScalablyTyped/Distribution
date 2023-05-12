package typings.reactChartjs2

import typings.chartJs.distTypesIndexMod.ChartType
import typings.reactChartjs2.distTypesMod.ChartJSOrUndefined
import typings.reactChartjs2.distTypesMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[TDefaultType /* <: ChartType */, TData, TLabel] extends StObject {
    
    var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[TDefaultType, TData, TLabel]]] = js.undefined
  }
  object `0` {
    
    inline def apply[TDefaultType /* <: ChartType */, TData, TLabel](): `0`[TDefaultType, TData, TLabel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[TDefaultType, TData, TLabel]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?, ?, ?], TDefaultType /* <: ChartType */, TData, TLabel] (val x: Self & (`0`[TDefaultType, TData, TLabel])) extends AnyVal {
      
      inline def setRef(value: ForwardedRef[ChartJSOrUndefined[TDefaultType, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[TDefaultType, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Ref[TType /* <: ChartType */, TData, TLabel] extends StObject {
    
    var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[TType, TData, TLabel]]] = js.undefined
  }
  object Ref {
    
    inline def apply[TType /* <: ChartType */, TData, TLabel](): Ref[TType, TData, TLabel] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref[TType, TData, TLabel]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ref[?, ?, ?], TType /* <: ChartType */, TData, TLabel] (val x: Self & (Ref[TType, TData, TLabel])) extends AnyVal {
      
      inline def setRef(value: ForwardedRef[ChartJSOrUndefined[TType, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[TType, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
