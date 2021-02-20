package typings.reactGtmModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-gtm-module", "default.dataLayer")
    @js.native
    def dataLayer(dataLayerArgs: DataLayerArgs): Unit = js.native
    
    @JSImport("react-gtm-module", "default.initialize")
    @js.native
    def initialize(tagManagerArgs: TagManagerArgs): Unit = js.native
  }
  
  @js.native
  trait DataLayerArgs extends StObject {
    
    /**
      * Object that contains all of the information that you want to pass to Google Tag Manager.
      */
    var dataLayer: js.UndefOr[js.Object] = js.native
    
    /**
      * Custom name for dataLayer object.
      */
    var dataLayerName: js.UndefOr[String] = js.native
  }
  object DataLayerArgs {
    
    @scala.inline
    def apply(): DataLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLayerArgs]
    }
    
    @scala.inline
    implicit class DataLayerArgsMutableBuilder[Self <: DataLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataLayer(value: js.Object): Self = StObject.set(x, "dataLayer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLayerName(value: String): Self = StObject.set(x, "dataLayerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLayerNameUndefined: Self = StObject.set(x, "dataLayerName", js.undefined)
      
      @scala.inline
      def setDataLayerUndefined: Self = StObject.set(x, "dataLayer", js.undefined)
    }
  }
  
  @js.native
  trait TagManagerArgs extends DataLayerArgs {
    
    /**
      * Used to set environments.
      */
    var auth: js.UndefOr[String] = js.native
    
    /**
      * Additional events such as 'gtm.start': new Date().getTime(),event:'gtm.js'.
      */
    var events: js.UndefOr[js.Object] = js.native
    
    /**
      * GTM id, must be something like GTM-000000.
      */
    var gtmId: String = js.native
    
    /**
      * Used to set environments, something like env-00.
      */
    var preview: js.UndefOr[String] = js.native
  }
  object TagManagerArgs {
    
    @scala.inline
    def apply(gtmId: String): TagManagerArgs = {
      val __obj = js.Dynamic.literal(gtmId = gtmId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagManagerArgs]
    }
    
    @scala.inline
    implicit class TagManagerArgsMutableBuilder[Self <: TagManagerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setGtmId(value: String): Self = StObject.set(x, "gtmId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: String): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    }
  }
}
