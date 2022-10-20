package typings.realmNetworkTransport

import typings.realmNetworkTransport.mod.FetchRequestCredentials
import typings.realmNetworkTransport.mod.FetchRequestMode
import typings.realmNetworkTransport.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realmNetworkTransportStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with Method
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with Method
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait cors
    extends StObject
       with FetchRequestMode
  inline def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait include
    extends StObject
       with FetchRequestCredentials
  inline def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait navigate
    extends StObject
       with FetchRequestMode
  inline def navigate: navigate = "navigate".asInstanceOf[navigate]
  
  @js.native
  sealed trait `no-cors`
    extends StObject
       with FetchRequestMode
  inline def `no-cors`: `no-cors` = "no-cors".asInstanceOf[`no-cors`]
  
  @js.native
  sealed trait omit
    extends StObject
       with FetchRequestCredentials
  inline def omit: omit = "omit".asInstanceOf[omit]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with FetchRequestCredentials
       with FetchRequestMode
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
}
