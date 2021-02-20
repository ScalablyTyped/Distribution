package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object device {
  
  @js.native
  trait IAbstract extends IObservable {
    
    /** [Property] (String) */
    var name: js.UndefOr[String] = js.native
    
    /** [Method] Opens a specified URL
      * @param url String The URL to open
      */
    var openURL: js.UndefOr[js.Function1[/* url */ js.UndefOr[String], Unit]] = js.native
    
    /** [Property] (String) */
    var platform: js.UndefOr[String] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Property] (Object/Boolean) */
    var scheme: js.UndefOr[js.Any] = js.native
    
    /** [Property] (String) */
    var uuid: js.UndefOr[String] = js.native
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
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpenURL(value: /* url */ js.UndefOr[String] => Unit): Self = StObject.set(x, "openURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenURLUndefined: Self = StObject.set(x, "openURL", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setScheme(value: js.Any): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  @js.native
  trait ICordova extends IAbstract {
    
    /** [Property] (String) */
    var cordova: js.UndefOr[String] = js.native
    
    /** [Property] (String) */
    var model: js.UndefOr[String] = js.native
    
    /** [Property] (String) */
    var version: js.UndefOr[String] = js.native
  }
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    @scala.inline
    implicit class ICordovaMutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCordova(value: String): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait IPhoneGap extends IAbstract {
    
    /** [Property] (String) */
    var cordova: js.UndefOr[String] = js.native
    
    /** [Property] (String) */
    var model: js.UndefOr[String] = js.native
    
    /** [Property] (String) */
    var version: js.UndefOr[String] = js.native
  }
  object IPhoneGap {
    
    @scala.inline
    def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    @scala.inline
    implicit class IPhoneGapMutableBuilder[Self <: IPhoneGap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCordova(value: String): Self = StObject.set(x, "cordova", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCordovaUndefined: Self = StObject.set(x, "cordova", js.undefined)
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ISencha extends IAbstract {
    
    /** [Method] Opens a specified URL
      * @param url Object
      */
    @JSName("openURL")
    var openURL_ISencha: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit class ISenchaMutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenURL(value: /* url */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "openURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenURLUndefined: Self = StObject.set(x, "openURL", js.undefined)
    }
  }
  
  type ISimulator = IAbstract
}
