package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/organization_object.htm
trait Organization extends StObject {
  
  val currencyIsoCode: String
  
  val multicurrencyEnabled: Boolean
  
  val name: String
  
  val namespacePrefix: String
  
  val organizationId: String
}
object Organization {
  
  inline def apply(
    currencyIsoCode: String,
    multicurrencyEnabled: Boolean,
    name: String,
    namespacePrefix: String,
    organizationId: String
  ): Organization = {
    val __obj = js.Dynamic.literal(currencyIsoCode = currencyIsoCode.asInstanceOf[js.Any], multicurrencyEnabled = multicurrencyEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespacePrefix = namespacePrefix.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    inline def setCurrencyIsoCode(value: String): Self = StObject.set(x, "currencyIsoCode", value.asInstanceOf[js.Any])
    
    inline def setMulticurrencyEnabled(value: Boolean): Self = StObject.set(x, "multicurrencyEnabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespacePrefix(value: String): Self = StObject.set(x, "namespacePrefix", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
  }
}
