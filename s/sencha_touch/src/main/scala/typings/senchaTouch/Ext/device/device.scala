package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Property] (String) */
    var name: js.UndefOr[String] = js.undefined
    
    /** [Method] Opens a specified URL
      * @param url String The URL to open
      */
    var openURL: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Property] (String) */
    var platform: js.UndefOr[String] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.undefined
    
    /** [Property] (Object/Boolean) */
    var scheme: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (String) */
    var uuid: js.UndefOr[String] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpenURL(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "openURL", js.Any.fromFunction1(value))
      
      inline def setOpenURLUndefined: Self = StObject.set(x, "openURL", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait ICordova
    extends StObject
       with IAbstract {
    
    /** [Property] (String) */
    var cordova: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var model: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var version: js.UndefOr[String] = js.undefined
  }
  object ICordova {
    
    inline def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    extension [Self <: ICordova](x: Self) {
      
      inline def setCordova(value: String): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      inline def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IPhoneGap
    extends StObject
       with IAbstract {
    
    /** [Property] (String) */
    var cordova: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var model: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var version: js.UndefOr[String] = js.undefined
  }
  object IPhoneGap {
    
    inline def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    extension [Self <: IPhoneGap](x: Self) {
      
      inline def setCordova(value: String): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      inline def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ISencha
    extends StObject
       with IAbstract {
    
    /** [Method] Opens a specified URL
      * @param url Object
      */
    @JSName("openURL")
    var openURL_ISencha: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.undefined
  }
  object ISencha {
    
    inline def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    extension [Self <: ISencha](x: Self) {
      
      inline def setOpenURL(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "openURL", js.Any.fromFunction1(value))
      
      inline def setOpenURLUndefined: Self = StObject.set(x, "openURL", js.undefined)
    }
  }
  
  type ISimulator = IAbstract
}
