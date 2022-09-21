package typings.reactChartjs2.anon

import typings.reactChartjs2.reactChartjs2Strings.bar
import typings.reactChartjs2.typesMod.ChartJSOrUndefined
import typings.reactChartjs2.typesMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[bar, TData, TLabel]]] = js.undefined
}
object Ref {
  
  inline def apply[TData, TLabel](): Ref[TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[TData, TLabel]]
  }
  
  extension [Self <: Ref[?, ?], TData, TLabel](x: Self & (Ref[TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[bar, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[bar, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
