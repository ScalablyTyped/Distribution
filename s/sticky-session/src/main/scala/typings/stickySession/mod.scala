package typings.stickySession

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.stickySession.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sticky-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def listen(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def listen(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    port: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def listen(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    port: Double,
    options: Env
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def listen(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    port: Unit,
    options: Env
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(server.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
