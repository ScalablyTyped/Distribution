package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IEvented
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connection {
  
  trait IAbstract
    extends StObject
       with IEvented {
    
    /** [Property] (String) */
    var CELL_2G: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var CELL_3G: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var CELL_4G: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var ETHERNET: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var NONE: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var UNKNOWN: js.UndefOr[String] = js.undefined
    
    /** [Property] (String) */
    var WIFI: js.UndefOr[String] = js.undefined
    
    /** [Method] Returns the value of online
      * @returns Boolean
      */
    var getOnline: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the current connection type
      * @returns String type
      */
    var getType: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] True if the device is currently online
      * @returns Boolean online
      */
    var isOnline: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Sets the value of online
      * @param online Boolean The new value.
      */
    var setOnline: js.UndefOr[js.Function1[/* online */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of type
      * @param type Object The new value.
      */
    var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setCELL_2G(value: String): Self = StObject.set(x, "CELL_2G", value.asInstanceOf[js.Any])
      
      inline def setCELL_2GUndefined: Self = StObject.set(x, "CELL_2G", js.undefined)
      
      inline def setCELL_3G(value: String): Self = StObject.set(x, "CELL_3G", value.asInstanceOf[js.Any])
      
      inline def setCELL_3GUndefined: Self = StObject.set(x, "CELL_3G", js.undefined)
      
      inline def setCELL_4G(value: String): Self = StObject.set(x, "CELL_4G", value.asInstanceOf[js.Any])
      
      inline def setCELL_4GUndefined: Self = StObject.set(x, "CELL_4G", js.undefined)
      
      inline def setETHERNET(value: String): Self = StObject.set(x, "ETHERNET", value.asInstanceOf[js.Any])
      
      inline def setETHERNETUndefined: Self = StObject.set(x, "ETHERNET", js.undefined)
      
      inline def setGetOnline(value: () => Boolean): Self = StObject.set(x, "getOnline", js.Any.fromFunction0(value))
      
      inline def setGetOnlineUndefined: Self = StObject.set(x, "getOnline", js.undefined)
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
      
      inline def setIsOnline(value: () => Boolean): Self = StObject.set(x, "isOnline", js.Any.fromFunction0(value))
      
      inline def setIsOnlineUndefined: Self = StObject.set(x, "isOnline", js.undefined)
      
      inline def setNONE(value: String): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      inline def setSetOnline(value: /* online */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setOnline", js.Any.fromFunction1(value))
      
      inline def setSetOnlineUndefined: Self = StObject.set(x, "setOnline", js.undefined)
      
      inline def setSetType(value: /* type */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setType", js.Any.fromFunction1(value))
      
      inline def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
      
      inline def setUNKNOWN(value: String): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
      
      inline def setUNKNOWNUndefined: Self = StObject.set(x, "UNKNOWN", js.undefined)
      
      inline def setWIFI(value: String): Self = StObject.set(x, "WIFI", value.asInstanceOf[js.Any])
      
      inline def setWIFIUndefined: Self = StObject.set(x, "WIFI", js.undefined)
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
  
  type ISencha = IAbstract
  
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
