package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compass {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Config Option] (Number) */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setGetFrequency(value: () => Double): Self = StObject.set(x, "getFrequency", js.Any.fromFunction0(value))
      
      inline def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
      
      inline def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1(value))
      
      inline def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
    }
  }
  
  type ICordova = IAbstract
  
  type IPhoneGap = IAbstract
  
  type ISimulator = IAbstract
}
