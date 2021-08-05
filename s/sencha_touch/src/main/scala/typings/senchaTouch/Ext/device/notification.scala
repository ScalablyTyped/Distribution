package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notification {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] A simple way to show a notification
      * @param config Object An object which contains the following config options:
      */
    var show: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Vibrates the device  */
    var vibrate: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setShow(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setVibrate(value: () => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction0(value))
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Method] Vibrates the device
      * @param time Object
      */
    @JSName("vibrate")
    var vibrate_ICordova: js.UndefOr[js.Function1[/* time */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    extension [Self <: ICordova](x: Self) {
      
      inline def setVibrate(value: /* time */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction1(value))
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract {
    
    /** [Method] Vibrates the device
      * @param time Object
      */
    @JSName("vibrate")
    var vibrate_IPhoneGap: js.UndefOr[js.Function1[/* time */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object IPhoneGap {
    
    inline def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    extension [Self <: IPhoneGap](x: Self) {
      
      inline def setVibrate(value: /* time */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction1(value))
      
      inline def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] A simple way to show a notification  */
    @JSName("show")
    var show_ISencha: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    extension [Self <: ISencha](x: Self) {
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  trait ISimulator
    extends StObject
       with IAbstract {
    
    /** [Method] A simple way to show a notification  */
    @JSName("show")
    var show_ISimulator: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISimulator {
    
    inline def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
    
    extension [Self <: ISimulator](x: Self) {
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
