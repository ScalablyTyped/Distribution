package typings.sentryInternalTracing.anon

import typings.sentryInternalTracing.typesNodeIntegrationsPostgresMod.PgClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPgClient extends StObject {
  
  var Client: PgClient
}
object ClientPgClient {
  
  inline def apply(Client: PgClient): ClientPgClient = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPgClient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientPgClient] (val x: Self) extends AnyVal {
    
    inline def setClient(value: PgClient): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
  }
}
