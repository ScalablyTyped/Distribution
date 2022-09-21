package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contacts {
  
  trait IAbstract
    extends StObject
       with IObservable {
    
    /** [Method] Returns an Array of contact objects
      * @param config Object
      * @returns Object[] An array of contact objects.
      */
    var getContacts: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Array]] = js.undefined
    
    /** [Method] Returns the value of includeImages
      * @returns Boolean
      */
    var getIncludeImages: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns localized user readable label for a contact field i e
      * @param config Object
      * @returns String user readable string
      */
    var getLocalizedLabel: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], String]] = js.undefined
    
    /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
      * @param config Object
      * @returns String base64 string
      */
    var getThumbnail: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], String]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var includeImages: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any], IObservable]
      ] = js.undefined
    
    /** [Method] Sets the value of includeImages
      * @param includeImages Boolean The new value.
      */
    var setIncludeImages: js.UndefOr[js.Function1[/* includeImages */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetContacts(value: /* config */ js.UndefOr[Any] => Array): Self = StObject.set(x, "getContacts", js.Any.fromFunction1(value))
      
      inline def setGetContactsUndefined: Self = StObject.set(x, "getContacts", js.undefined)
      
      inline def setGetIncludeImages(value: () => Boolean): Self = StObject.set(x, "getIncludeImages", js.Any.fromFunction0(value))
      
      inline def setGetIncludeImagesUndefined: Self = StObject.set(x, "getIncludeImages", js.undefined)
      
      inline def setGetLocalizedLabel(value: /* config */ js.UndefOr[Any] => String): Self = StObject.set(x, "getLocalizedLabel", js.Any.fromFunction1(value))
      
      inline def setGetLocalizedLabelUndefined: Self = StObject.set(x, "getLocalizedLabel", js.undefined)
      
      inline def setGetThumbnail(value: /* config */ js.UndefOr[Any] => String): Self = StObject.set(x, "getThumbnail", js.Any.fromFunction1(value))
      
      inline def setGetThumbnailUndefined: Self = StObject.set(x, "getThumbnail", js.undefined)
      
      inline def setIncludeImages(value: Boolean): Self = StObject.set(x, "includeImages", value.asInstanceOf[js.Any])
      
      inline def setIncludeImagesUndefined: Self = StObject.set(x, "includeImages", js.undefined)
      
      inline def setRelayEvents(value: (/* object */ js.UndefOr[Any], /* events */ js.UndefOr[Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setSetIncludeImages(value: /* includeImages */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIncludeImages", js.Any.fromFunction1(value))
      
      inline def setSetIncludeImagesUndefined: Self = StObject.set(x, "setIncludeImages", js.undefined)
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
}
