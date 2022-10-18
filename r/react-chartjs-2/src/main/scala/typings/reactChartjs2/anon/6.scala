package typings.reactChartjs2.anon

import typings.reactChartjs2.distTypesMod.ChartJSOrUndefined
import typings.reactChartjs2.distTypesMod.ForwardedRef
import typings.reactChartjs2.reactChartjs2Strings.radar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[radar, TData, TLabel]]] = js.undefined
}
object `6` {
  
  inline def apply[TData, TLabel](): `6`[TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[TData, TLabel]]
  }
  
  extension [Self <: `6`[?, ?], TData, TLabel](x: Self & (`6`[TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[radar, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[radar, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
