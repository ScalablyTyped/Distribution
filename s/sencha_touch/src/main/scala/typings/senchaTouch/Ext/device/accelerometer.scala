package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accelerometer {
  
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
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setGetFrequency(value: () => Double): Self = StObject.set(x, "getFrequency", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
      
      @scala.inline
      def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
    }
  }
  
  type ICordova = IAbstract
  
  type IPhoneGap = IAbstract
  
  type ISimulator = IAbstract
}
