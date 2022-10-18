package typings.stoppable

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Decorates a server instance with a `stop` method.
    *
    * @param server Any HTTP or HTTPS Server instance.
    * @param grace Milliseconds to wait before force-closing connections. Defaults to
    *              `Infinity` (don't force-close). If you want to immediately kill all sockets
    *              you can use a grace of `0`.
    * @returns The server instance, so can be chained, or can be run as a standalone statement.
    *
    * @example
    * import * as http from 'http';
    * import stoppable = require('stoppable');
    *
    * const server = stoppable(http.createServer((req, res) => {}));
    * server.stop();
    */
  inline def apply(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): (Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) & WithStop = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[(Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) & WithStop]
  inline def apply(
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    grace: Double
  ): (Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) & WithStop = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], grace.asInstanceOf[js.Any])).asInstanceOf[(Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]) & WithStop]
  inline def apply(
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ]
  ): (typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) & WithStop = ^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any]).asInstanceOf[(typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) & WithStop]
  inline def apply(
    server: typings.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ],
    grace: Double
  ): (typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) & WithStop = (^.asInstanceOf[js.Dynamic].apply(server.asInstanceOf[js.Any], grace.asInstanceOf[js.Any])).asInstanceOf[(typings.node.httpsMod.Server[
    Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
    ]
  ]) & WithStop]
  
  @JSImport("stoppable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Left for backwards compatibility
  @js.native
  trait StoppableServer
    extends Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
       with WithStop
  
  @js.native
  trait WithStop extends StObject {
    
    /**
      * Closes the server.
      *
      * @param callback Passed along to the existing `server.close` function to
      * auto-register a `'close'` event. The first agrument is an error, and
      * the second argument indicates whether it stopped gracefully.
      */
    def stop(): Unit = js.native
    def stop(callback: js.Function2[/* e */ js.UndefOr[js.Error], /* gracefully */ Boolean, Any]): Unit = js.native
  }
}
