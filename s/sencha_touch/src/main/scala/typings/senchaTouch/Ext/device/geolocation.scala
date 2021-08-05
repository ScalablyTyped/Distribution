package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geolocation {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Config Option] (Boolean) */
    var allowHighAccuracy: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] If you are currently watching for the current position this will stop that task  */
    var clearWatch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of allowHighAccuracy
      * @returns Boolean
      */
    var getAllowHighAccuracy: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Attempts to get the current position of this device
      * @param config Object An object which contains the following config options:
      */
    var getCurrentPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Returns the value of frequency
      * @returns Number
      */
    var getFrequency: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of maximumAge
      * @returns Number
      */
    var getMaximumAge: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of timeout
      * @returns Number
      */
    var getTimeout: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var maximumAge: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of allowHighAccuracy
      * @param allowHighAccuracy Boolean The new value.
      */
    var setAllowHighAccuracy: js.UndefOr[js.Function1[/* allowHighAccuracy */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of frequency
      * @param frequency Number The new value.
      */
    var setFrequency: js.UndefOr[js.Function1[/* frequency */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of maximumAge
      * @param maximumAge Number The new value.
      */
    var setMaximumAge: js.UndefOr[js.Function1[/* maximumAge */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of timeout
      * @param timeout Number The new value.
      */
    var setTimeout: js.UndefOr[js.Function1[/* timeout */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** [Method] Watches for the current position and calls the callback when successful depending on the specified frequency
      * @param config Object An object which contains the following config options:
      */
    var watchPosition: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setAllowHighAccuracy(value: Boolean): Self = StObject.set(x, "allowHighAccuracy", value.asInstanceOf[js.Any])
      
      inline def setAllowHighAccuracyUndefined: Self = StObject.set(x, "allowHighAccuracy", js.undefined)
      
      inline def setClearWatch(value: () => Unit): Self = StObject.set(x, "clearWatch", js.Any.fromFunction0(value))
      
      inline def setClearWatchUndefined: Self = StObject.set(x, "clearWatch", js.undefined)
      
      inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      inline def setGetAllowHighAccuracy(value: () => Boolean): Self = StObject.set(x, "getAllowHighAccuracy", js.Any.fromFunction0(value))
      
      inline def setGetAllowHighAccuracyUndefined: Self = StObject.set(x, "getAllowHighAccuracy", js.undefined)
      
      inline def setGetCurrentPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getCurrentPosition", js.Any.fromFunction1(value))
      
      inline def setGetCurrentPositionUndefined: Self = StObject.set(x, "getCurrentPosition", js.undefined)
      
      inline def setGetFrequency(value: () => Double): Self = StObject.set(x, "getFrequency", js.Any.fromFunction0(value))
      
      inline def setGetFrequencyUndefined: Self = StObject.set(x, "getFrequency", js.undefined)
      
      inline def setGetMaximumAge(value: () => Double): Self = StObject.set(x, "getMaximumAge", js.Any.fromFunction0(value))
      
      inline def setGetMaximumAgeUndefined: Self = StObject.set(x, "getMaximumAge", js.undefined)
      
      inline def setGetTimeout(value: () => Double): Self = StObject.set(x, "getTimeout", js.Any.fromFunction0(value))
      
      inline def setGetTimeoutUndefined: Self = StObject.set(x, "getTimeout", js.undefined)
      
      inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
      
      inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
      
      inline def setSetAllowHighAccuracy(value: /* allowHighAccuracy */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowHighAccuracy", js.Any.fromFunction1(value))
      
      inline def setSetAllowHighAccuracyUndefined: Self = StObject.set(x, "setAllowHighAccuracy", js.undefined)
      
      inline def setSetFrequency(value: /* frequency */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFrequency", js.Any.fromFunction1(value))
      
      inline def setSetFrequencyUndefined: Self = StObject.set(x, "setFrequency", js.undefined)
      
      inline def setSetMaximumAge(value: /* maximumAge */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setMaximumAge", js.Any.fromFunction1(value))
      
      inline def setSetMaximumAgeUndefined: Self = StObject.set(x, "setMaximumAge", js.undefined)
      
      inline def setSetTimeout(value: /* timeout */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeoutUndefined: Self = StObject.set(x, "setTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWatchPosition(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "watchPosition", js.Any.fromFunction1(value))
      
      inline def setWatchPositionUndefined: Self = StObject.set(x, "watchPosition", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract
  object IPhoneGap {
    
    inline def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
  }
  
  trait ISimulator
    extends StObject
       with IAbstract
  object ISimulator {
    
    inline def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
  }
}
