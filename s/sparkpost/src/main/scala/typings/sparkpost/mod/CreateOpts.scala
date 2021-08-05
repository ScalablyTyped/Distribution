package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpts extends StObject {
  
  /**
    * Domain (or subdomain) name for which SparkPost will receive inbound emails
    *
    */
  var domain: String
}
object CreateOpts {
  
  inline def apply(domain: String): CreateOpts = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpts]
  }
  
  extension [Self <: CreateOpts](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
