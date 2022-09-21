package typings.reactChartjs2.anon

import typings.chartJs.mod.ChartType
import typings.reactChartjs2.typesMod.ChartJSOrUndefined
import typings.reactChartjs2.typesMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16`[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[TType, TData, TLabel]]] = js.undefined
}
object `16` {
  
  inline def apply[TType /* <: ChartType */, TData, TLabel](): `16`[TType, TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[TType, TData, TLabel]]
  }
  
  extension [Self <: `16`[?, ?, ?], TType /* <: ChartType */, TData, TLabel](x: Self & (`16`[TType, TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[TType, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[TType, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
