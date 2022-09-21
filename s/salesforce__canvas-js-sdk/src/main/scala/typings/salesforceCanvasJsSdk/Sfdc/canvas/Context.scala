package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// see https://developer.salesforce.com/docs/atlas.en-us.platform_connect.meta/platform_connect/context_object.htm
trait Context extends StObject {
  
  val application: js.UndefOr[Application] = js.undefined
  
  val environment: Environment
  
  val links: Links
  
  val organization: js.UndefOr[Organization] = js.undefined
  
  val user: js.UndefOr[User] = js.undefined
}
object Context {
  
  inline def apply(environment: Environment, links: Links): Context = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: Organization): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
