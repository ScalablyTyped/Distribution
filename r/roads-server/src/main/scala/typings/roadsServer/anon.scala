package typings.roadsServer

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpsMod.ServerOptions
import typings.node.nodeHttpMod.IncomingMessage
import typings.node.nodeHttpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enabled extends StObject {
    
    var enabled: Boolean
    
    var options: ServerOptions[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[typings.node.httpMod.IncomingMessage]
        ]
      ]
  }
  object Enabled {
    
    inline def apply(
      enabled: Boolean,
      options: ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): Enabled = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enabled]
    }
    
    extension [Self <: Enabled](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setOptions(
        value: ServerOptions[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[typings.node.httpMod.IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
