package typings.storybookCoreServer

import org.scalablytyped.runtime.Instantiable1
import typings.express.mod.Express
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.storybookCoreServer.anon.SslCa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsServerInitMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/server-init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getServer(app: Express, options: SslCa): js.Promise[
    (Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServer")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]) | (typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ])
  ]]
}
