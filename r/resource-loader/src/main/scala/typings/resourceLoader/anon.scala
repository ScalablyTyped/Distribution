package typings.resourceLoader

import typings.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typings.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typings.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CrossOrigin extends StObject {
    
    var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
    
    var loadType: js.UndefOr[LOAD_TYPE] = js.undefined
    
    var metadata: js.UndefOr[IMetadata] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var xhrType: js.UndefOr[XHR_RESPONSE_TYPE] = js.undefined
  }
  object CrossOrigin {
    
    @scala.inline
    def apply(): CrossOrigin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOrigin]
    }
    
    @scala.inline
    implicit class CrossOriginMutableBuilder[Self <: CrossOrigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setLoadType(value: LOAD_TYPE): Self = StObject.set(x, "loadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTypeUndefined: Self = StObject.set(x, "loadType", js.undefined)
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setXhrType(value: XHR_RESPONSE_TYPE): Self = StObject.set(x, "xhrType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrTypeUndefined: Self = StObject.set(x, "xhrType", js.undefined)
    }
  }
}
