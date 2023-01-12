package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object push {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Property] (Number) */
    var ALERT: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var BADGE: js.UndefOr[Double] = js.undefined
    
    /** [Property] (Number) */
    var SOUND: js.UndefOr[Double] = js.undefined
    
    /** [Method] Registers a push notification
      * @param config Object The configuration for to pass when registering this push notification service.
      */
    var register: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      inline def setALERT(value: Double): Self = StObject.set(x, "ALERT", value.asInstanceOf[js.Any])
      
      inline def setALERTUndefined: Self = StObject.set(x, "ALERT", js.undefined)
      
      inline def setBADGE(value: Double): Self = StObject.set(x, "BADGE", value.asInstanceOf[js.Any])
      
      inline def setBADGEUndefined: Self = StObject.set(x, "BADGE", js.undefined)
      
      inline def setRegister(value: /* config */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setSOUND(value: Double): Self = StObject.set(x, "SOUND", value.asInstanceOf[js.Any])
      
      inline def setSOUNDUndefined: Self = StObject.set(x, "SOUND", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Method] Registers a push notification  */
    @JSName("register")
    var register_ICordova: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
      
      inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Registers a push notification  */
    @JSName("register")
    var register_ISencha: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      inline def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
    }
  }
}
