package typings.senchaTouch.Ext.chart.series

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICandleStick extends ICartesian {
  
  /** [Config Option] (String) */
  var closeField: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of closeField
    * @returns String
    */
  var getCloseField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of highField
    * @returns String
    */
  var getHighField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of lowField
    * @returns String
    */
  var getLowField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of openField
    * @returns String
    */
  var getOpenField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (String) */
  var highField: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var lowField: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var openField: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of closeField
    * @param closeField String The new value.
    */
  var setCloseField: js.UndefOr[js.Function1[/* closeField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of highField
    * @param highField String The new value.
    */
  var setHighField: js.UndefOr[js.Function1[/* highField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of lowField
    * @param lowField String The new value.
    */
  var setLowField: js.UndefOr[js.Function1[/* lowField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of openField
    * @param openField String The new value.
    */
  var setOpenField: js.UndefOr[js.Function1[/* openField */ js.UndefOr[String], Unit]] = js.native
}
object ICandleStick {
  
  @scala.inline
  def apply(): ICandleStick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleStick]
  }
  
  @scala.inline
  implicit class ICandleStickMutableBuilder[Self <: ICandleStick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseField(value: String): Self = StObject.set(x, "closeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseFieldUndefined: Self = StObject.set(x, "closeField", js.undefined)
    
    @scala.inline
    def setGetCloseField(value: () => String): Self = StObject.set(x, "getCloseField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCloseFieldUndefined: Self = StObject.set(x, "getCloseField", js.undefined)
    
    @scala.inline
    def setGetHighField(value: () => String): Self = StObject.set(x, "getHighField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHighFieldUndefined: Self = StObject.set(x, "getHighField", js.undefined)
    
    @scala.inline
    def setGetLowField(value: () => String): Self = StObject.set(x, "getLowField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLowFieldUndefined: Self = StObject.set(x, "getLowField", js.undefined)
    
    @scala.inline
    def setGetOpenField(value: () => String): Self = StObject.set(x, "getOpenField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenFieldUndefined: Self = StObject.set(x, "getOpenField", js.undefined)
    
    @scala.inline
    def setHighField(value: String): Self = StObject.set(x, "highField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighFieldUndefined: Self = StObject.set(x, "highField", js.undefined)
    
    @scala.inline
    def setLowField(value: String): Self = StObject.set(x, "lowField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowFieldUndefined: Self = StObject.set(x, "lowField", js.undefined)
    
    @scala.inline
    def setOpenField(value: String): Self = StObject.set(x, "openField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFieldUndefined: Self = StObject.set(x, "openField", js.undefined)
    
    @scala.inline
    def setSetCloseField(value: /* closeField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setCloseField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCloseFieldUndefined: Self = StObject.set(x, "setCloseField", js.undefined)
    
    @scala.inline
    def setSetHighField(value: /* highField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setHighField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHighFieldUndefined: Self = StObject.set(x, "setHighField", js.undefined)
    
    @scala.inline
    def setSetLowField(value: /* lowField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLowField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLowFieldUndefined: Self = StObject.set(x, "setLowField", js.undefined)
    
    @scala.inline
    def setSetOpenField(value: /* openField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setOpenField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenFieldUndefined: Self = StObject.set(x, "setOpenField", js.undefined)
  }
}
