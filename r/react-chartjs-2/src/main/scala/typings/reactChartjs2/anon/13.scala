package typings.reactChartjs2.anon

import typings.reactChartjs2.reactChartjs2Strings.pie
import typings.reactChartjs2.typesMod.ChartJSOrUndefined
import typings.reactChartjs2.typesMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[pie, TData, TLabel]]] = js.undefined
}
object `13` {
  
  inline def apply[TData, TLabel](): `13`[TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`13`[TData, TLabel]]
  }
  
  extension [Self <: `13`[?, ?], TData, TLabel](x: Self & (`13`[TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[pie, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[pie, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
