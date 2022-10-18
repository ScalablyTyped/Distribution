package typings.roads

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTestsResourcesMockServerMod {
  
  @JSImport("roads/types/tests/resources/mockServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ]]
  
  @JSImport("roads/types/tests/resources/mockServer", "port")
  @js.native
  val port: /* 8081 */ Double = js.native
}
