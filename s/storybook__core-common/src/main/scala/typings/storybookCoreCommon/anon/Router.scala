package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.processMod.global.NodeJS.HRTime
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router extends StObject {
  
  var options: typings.storybookCoreCommon.distTs3Dot9TypesMod.Options
  
  var router: typings.express.mod.Router
  
  var server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  var startTime: ReturnType[HRTime]
}
object Router {
  
  inline def apply(
    options: typings.storybookCoreCommon.distTs3Dot9TypesMod.Options,
    router: typings.express.mod.Router,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    startTime: ReturnType[HRTime]
  ): Router = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: typings.storybookCoreCommon.distTs3Dot9TypesMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRouter(value: typings.express.mod.Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: ReturnType[HRTime]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
