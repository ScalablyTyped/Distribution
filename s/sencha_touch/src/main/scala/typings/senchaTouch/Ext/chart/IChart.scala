package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChart extends IAbstractChart {
  
  /** [Config Option] (Boolean) */
  var flipXY: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of flipXY
    * @returns Boolean
    */
  var getFlipXY: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of innerRegion
    * @returns Array
    */
  var getInnerRegion: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Layout the axes and series  */
  var performLayout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of flipXY
    * @param flipXY Boolean The new value.
    */
  var setFlipXY: js.UndefOr[js.Function1[/* flipXY */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of innerRegion
    * @param innerRegion Array The new value.
    */
  var setInnerRegion: js.UndefOr[js.Function1[/* innerRegion */ js.UndefOr[Array], Unit]] = js.native
}
object IChart {
  
  @scala.inline
  def apply(): IChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChart]
  }
  
  @scala.inline
  implicit class IChartMutableBuilder[Self <: IChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlipXY(value: Boolean): Self = StObject.set(x, "flipXY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipXYUndefined: Self = StObject.set(x, "flipXY", js.undefined)
    
    @scala.inline
    def setGetFlipXY(value: () => Boolean): Self = StObject.set(x, "getFlipXY", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFlipXYUndefined: Self = StObject.set(x, "getFlipXY", js.undefined)
    
    @scala.inline
    def setGetInnerRegion(value: () => Array): Self = StObject.set(x, "getInnerRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInnerRegionUndefined: Self = StObject.set(x, "getInnerRegion", js.undefined)
    
    @scala.inline
    def setPerformLayout(value: () => Unit): Self = StObject.set(x, "performLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPerformLayoutUndefined: Self = StObject.set(x, "performLayout", js.undefined)
    
    @scala.inline
    def setSetFlipXY(value: /* flipXY */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFlipXY", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFlipXYUndefined: Self = StObject.set(x, "setFlipXY", js.undefined)
    
    @scala.inline
    def setSetInnerRegion(value: /* innerRegion */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setInnerRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInnerRegionUndefined: Self = StObject.set(x, "setInnerRegion", js.undefined)
  }
}
