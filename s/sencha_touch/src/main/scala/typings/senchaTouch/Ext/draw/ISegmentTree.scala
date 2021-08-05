package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISegmentTree
  extends StObject
     with IBase {
  
  /** [Method] Returns the minimum range of data that fits the given range and step size
    * @param min Number
    * @param max Number
    * @param estStep Number
    * @returns Object The aggregation information.
    */
  var getAggregation: js.UndefOr[
    js.Function3[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* estStep */ js.UndefOr[Double], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Returns the value of strategy
    * @returns String
    */
  var getStrategy: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Sets the data of the segment tree
    * @param dataX Number
    * @param dataOpen Number
    * @param dataHigh Number
    * @param dataLow Number
    * @param dataClose Number
    */
  var setData: js.UndefOr[
    js.Function5[
      /* dataX */ js.UndefOr[Double], 
      /* dataOpen */ js.UndefOr[Double], 
      /* dataHigh */ js.UndefOr[Double], 
      /* dataLow */ js.UndefOr[Double], 
      /* dataClose */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Sets the value of strategy
    * @param strategy String The new value.
    */
  var setStrategy: js.UndefOr[js.Function1[/* strategy */ js.UndefOr[String], Unit]] = js.undefined
}
object ISegmentTree {
  
  inline def apply(): ISegmentTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISegmentTree]
  }
  
  extension [Self <: ISegmentTree](x: Self) {
    
    inline def setGetAggregation(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* estStep */ js.UndefOr[Double]) => js.Any
    ): Self = StObject.set(x, "getAggregation", js.Any.fromFunction3(value))
    
    inline def setGetAggregationUndefined: Self = StObject.set(x, "getAggregation", js.undefined)
    
    inline def setGetStrategy(value: () => String): Self = StObject.set(x, "getStrategy", js.Any.fromFunction0(value))
    
    inline def setGetStrategyUndefined: Self = StObject.set(x, "getStrategy", js.undefined)
    
    inline def setSetData(
      value: (/* dataX */ js.UndefOr[Double], /* dataOpen */ js.UndefOr[Double], /* dataHigh */ js.UndefOr[Double], /* dataLow */ js.UndefOr[Double], /* dataClose */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "setData", js.Any.fromFunction5(value))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetStrategy(value: /* strategy */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setStrategy", js.Any.fromFunction1(value))
    
    inline def setSetStrategyUndefined: Self = StObject.set(x, "setStrategy", js.undefined)
  }
}
