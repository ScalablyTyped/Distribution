package typings.reactChartjs2.anon

import typings.reactChartjs2.distTypesMod.ChartJSOrUndefined
import typings.reactChartjs2.distTypesMod.ForwardedRef
import typings.reactChartjs2.reactChartjs2Strings.scatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14`[TData, TLabel] extends StObject {
  
  var ref: js.UndefOr[ForwardedRef[ChartJSOrUndefined[scatter, TData, TLabel]]] = js.undefined
}
object `14` {
  
  inline def apply[TData, TLabel](): `14`[TData, TLabel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`[TData, TLabel]]
  }
  
  extension [Self <: `14`[?, ?], TData, TLabel](x: Self & (`14`[TData, TLabel])) {
    
    inline def setRef(value: ForwardedRef[ChartJSOrUndefined[scatter, TData, TLabel]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ (ChartJSOrUndefined[scatter, TData, TLabel]) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
