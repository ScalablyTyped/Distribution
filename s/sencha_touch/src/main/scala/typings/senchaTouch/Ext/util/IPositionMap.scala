package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPositionMap extends IBase {
  
  /** [Method] Returns the value of minimumHeight
    * @returns Number
    */
  var getMinimumHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of minimumHeight
    * @param minimumHeight Number The new value.
    */
  var setMinimumHeight: js.UndefOr[js.Function1[/* minimumHeight */ js.UndefOr[Double], Unit]] = js.native
}
object IPositionMap {
  
  @scala.inline
  def apply(): IPositionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionMap]
  }
  
  @scala.inline
  implicit class IPositionMapMutableBuilder[Self <: IPositionMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMinimumHeight(value: () => Double): Self = StObject.set(x, "getMinimumHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinimumHeightUndefined: Self = StObject.set(x, "getMinimumHeight", js.undefined)
    
    @scala.inline
    def setSetMinimumHeight(value: /* minimumHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMinimumHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinimumHeightUndefined: Self = StObject.set(x, "setMinimumHeight", js.undefined)
  }
}
