package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChart
  extends StObject
     with IAbstractChart {
  
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the value of flipXY
    * @returns Boolean
    */
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of innerRegion
    * @returns Array
    */
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of flipXY
    * @param flipXY Boolean The new value.
    */
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of innerRegion
    * @param innerRegion Array The new value.
    */
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.undefined
}
object IChart {
  
  inline def apply(): IChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IChart] (val x: Self) extends AnyVal {
    
    inline def setFlipXY(value: Boolean): Self = StObject.set(x, "flipXY", value.asInstanceOf[js.Any])
    
    inline def setFlipXYUndefined: Self = StObject.set(x, "flipXY", js.undefined)
    
    inline def setGetFlipXY(value: () => Boolean): Self = StObject.set(x, "getFlipXY", js.Any.fromFunction0(value))
    
    inline def setGetFlipXYUndefined: Self = StObject.set(x, "getFlipXY", js.undefined)
    
    inline def setGetInnerRegion(value: () => Array): Self = StObject.set(x, "getInnerRegion", js.Any.fromFunction0(value))
    
    inline def setGetInnerRegionUndefined: Self = StObject.set(x, "getInnerRegion", js.undefined)
    
    inline def setPerformLayout(value: () => Unit): Self = StObject.set(x, "performLayout", js.Any.fromFunction0(value))
    
    inline def setPerformLayoutUndefined: Self = StObject.set(x, "performLayout", js.undefined)
    
    inline def setSetFlipXY(value: /* flipXY */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFlipXY", js.Any.fromFunction1(value))
    
    inline def setSetFlipXYUndefined: Self = StObject.set(x, "setFlipXY", js.undefined)
    
    inline def setSetInnerRegion(value: /* innerRegion */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setInnerRegion", js.Any.fromFunction1(value))
    
    inline def setSetInnerRegionUndefined: Self = StObject.set(x, "setInnerRegion", js.undefined)
  }
}
