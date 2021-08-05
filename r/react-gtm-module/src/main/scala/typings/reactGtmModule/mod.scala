package typings.reactGtmModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-gtm-module", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dataLayer(dataLayerArgs: DataLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dataLayer")(dataLayerArgs.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def initialize(tagManagerArgs: TagManagerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(tagManagerArgs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait DataLayerArgs extends StObject {
    
    /**
      * Object that contains all of the information that you want to pass to Google Tag Manager.
      */
    var dataLayer: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Custom name for dataLayer object.
      */
    var dataLayerName: js.UndefOr[String] = js.undefined
  }
  object DataLayerArgs {
    
    inline def apply(): DataLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLayerArgs]
    }
    
    extension [Self <: DataLayerArgs](x: Self) {
      
      inline def setDataLayer(value: js.Object): Self = StObject.set(x, "dataLayer", value.asInstanceOf[js.Any])
      
      inline def setDataLayerName(value: String): Self = StObject.set(x, "dataLayerName", value.asInstanceOf[js.Any])
      
      inline def setDataLayerNameUndefined: Self = StObject.set(x, "dataLayerName", js.undefined)
      
      inline def setDataLayerUndefined: Self = StObject.set(x, "dataLayer", js.undefined)
    }
  }
  
  trait TagManagerArgs
    extends StObject
       with DataLayerArgs {
    
    /**
      * Used to set environments.
      */
    var auth: js.UndefOr[String] = js.undefined
    
    /**
      * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
      */
    var events: js.UndefOr[js.Object] = js.undefined
    
    /**
      * GTM id, must be something like GTM-000000.
      */
    var gtmId: String
    
    /**
      * Used to set environments, something like env-00.
      */
    var preview: js.UndefOr[String] = js.undefined
  }
  object TagManagerArgs {
    
    inline def apply(gtmId: String): TagManagerArgs = {
      val __obj = js.Dynamic.literal(gtmId = gtmId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagManagerArgs]
    }
    
    extension [Self <: TagManagerArgs](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGtmId(value: String): Self = StObject.set(x, "gtmId", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
}
