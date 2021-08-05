package typings.reactNativeAppsflyer

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.Organic
import typings.reactNativeAppsflyer.reactNativeAppsflyerStrings.`Non-organic`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var af_referrer_customer_id: js.UndefOr[String] = js.undefined
    
    var af_referrer_uid: js.UndefOr[String] = js.undefined
    
    var af_status: Organic | `Non-organic`
    
    var is_first_launch: Boolean
    
    var media_source: String
  }
  object Dictkey {
    
    inline def apply(af_status: Organic | `Non-organic`, is_first_launch: Boolean, media_source: String): Dictkey = {
      val __obj = js.Dynamic.literal(af_status = af_status.asInstanceOf[js.Any], is_first_launch = is_first_launch.asInstanceOf[js.Any], media_source = media_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setAf_referrer_customer_id(value: String): Self = StObject.set(x, "af_referrer_customer_id", value.asInstanceOf[js.Any])
      
      inline def setAf_referrer_customer_idUndefined: Self = StObject.set(x, "af_referrer_customer_id", js.undefined)
      
      inline def setAf_referrer_uid(value: String): Self = StObject.set(x, "af_referrer_uid", value.asInstanceOf[js.Any])
      
      inline def setAf_referrer_uidUndefined: Self = StObject.set(x, "af_referrer_uid", js.undefined)
      
      inline def setAf_status(value: Organic | `Non-organic`): Self = StObject.set(x, "af_status", value.asInstanceOf[js.Any])
      
      inline def setIs_first_launch(value: Boolean): Self = StObject.set(x, "is_first_launch", value.asInstanceOf[js.Any])
      
      inline def setMedia_source(value: String): Self = StObject.set(x, "media_source", value.asInstanceOf[js.Any])
    }
  }
}
