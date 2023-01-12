package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/links_object.htm
trait Links extends StObject {
  
  val chatterFeedItemsUrl: String
  
  val chatterFeedsUrl: String
  
  val chatterGroupsUrl: String
  
  val chatterUsersUrl: String
  
  val enterpriseUrl: String
  
  val loginUrl: String
  
  val metadataUrl: String
  
  val partnerUrl: String
  
  val queryUrl: String
  
  val recentItemsUrl: String
  
  val restUrl: String
  
  val searchUrl: String
  
  val sobjectUrl: String
  
  val userUrl: String
}
object Links {
  
  inline def apply(
    chatterFeedItemsUrl: String,
    chatterFeedsUrl: String,
    chatterGroupsUrl: String,
    chatterUsersUrl: String,
    enterpriseUrl: String,
    loginUrl: String,
    metadataUrl: String,
    partnerUrl: String,
    queryUrl: String,
    recentItemsUrl: String,
    restUrl: String,
    searchUrl: String,
    sobjectUrl: String,
    userUrl: String
  ): Links = {
    val __obj = js.Dynamic.literal(chatterFeedItemsUrl = chatterFeedItemsUrl.asInstanceOf[js.Any], chatterFeedsUrl = chatterFeedsUrl.asInstanceOf[js.Any], chatterGroupsUrl = chatterGroupsUrl.asInstanceOf[js.Any], chatterUsersUrl = chatterUsersUrl.asInstanceOf[js.Any], enterpriseUrl = enterpriseUrl.asInstanceOf[js.Any], loginUrl = loginUrl.asInstanceOf[js.Any], metadataUrl = metadataUrl.asInstanceOf[js.Any], partnerUrl = partnerUrl.asInstanceOf[js.Any], queryUrl = queryUrl.asInstanceOf[js.Any], recentItemsUrl = recentItemsUrl.asInstanceOf[js.Any], restUrl = restUrl.asInstanceOf[js.Any], searchUrl = searchUrl.asInstanceOf[js.Any], sobjectUrl = sobjectUrl.asInstanceOf[js.Any], userUrl = userUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Links] (val x: Self) extends AnyVal {
    
    inline def setChatterFeedItemsUrl(value: String): Self = StObject.set(x, "chatterFeedItemsUrl", value.asInstanceOf[js.Any])
    
    inline def setChatterFeedsUrl(value: String): Self = StObject.set(x, "chatterFeedsUrl", value.asInstanceOf[js.Any])
    
    inline def setChatterGroupsUrl(value: String): Self = StObject.set(x, "chatterGroupsUrl", value.asInstanceOf[js.Any])
    
    inline def setChatterUsersUrl(value: String): Self = StObject.set(x, "chatterUsersUrl", value.asInstanceOf[js.Any])
    
    inline def setEnterpriseUrl(value: String): Self = StObject.set(x, "enterpriseUrl", value.asInstanceOf[js.Any])
    
    inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
    
    inline def setMetadataUrl(value: String): Self = StObject.set(x, "metadataUrl", value.asInstanceOf[js.Any])
    
    inline def setPartnerUrl(value: String): Self = StObject.set(x, "partnerUrl", value.asInstanceOf[js.Any])
    
    inline def setQueryUrl(value: String): Self = StObject.set(x, "queryUrl", value.asInstanceOf[js.Any])
    
    inline def setRecentItemsUrl(value: String): Self = StObject.set(x, "recentItemsUrl", value.asInstanceOf[js.Any])
    
    inline def setRestUrl(value: String): Self = StObject.set(x, "restUrl", value.asInstanceOf[js.Any])
    
    inline def setSearchUrl(value: String): Self = StObject.set(x, "searchUrl", value.asInstanceOf[js.Any])
    
    inline def setSobjectUrl(value: String): Self = StObject.set(x, "sobjectUrl", value.asInstanceOf[js.Any])
    
    inline def setUserUrl(value: String): Self = StObject.set(x, "userUrl", value.asInstanceOf[js.Any])
  }
}
