package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.raygun.anon.hoststringCommonRequestPa
  - typings.raygun.anon.hostnamestringCommonReque
*/
trait RequestParams extends StObject
object RequestParams {
  
  inline def hostnamestringCommonReque(
    body: js.Object,
    headers: js.Object,
    hostname: String,
    ip: String,
    method: String,
    path: String,
    query: js.Object
  ): typings.raygun.anon.hostnamestringCommonReque = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raygun.anon.hostnamestringCommonReque]
  }
  
  inline def hoststringCommonRequestPa(
    body: js.Object,
    headers: js.Object,
    host: String,
    ip: String,
    method: String,
    path: String,
    query: js.Object
  ): typings.raygun.anon.hoststringCommonRequestPa = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.raygun.anon.hoststringCommonRequestPa]
  }
}
