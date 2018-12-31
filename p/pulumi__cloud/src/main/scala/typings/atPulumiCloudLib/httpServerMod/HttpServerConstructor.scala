package typings
package atPulumiCloudLib.httpServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpServerConstructor
  extends /**
  * @param createRequestListener Function that, when called, will produce the [[requestListener]]
  * function that will be called for each http request to the server.  The function will be
  * called once when the module is loaded.  As such, it is a suitable place for expensive
  * computation (like setting up a set of routes).  The function returned can then utilize the
  * results of that computation.
  */
org.scalablytyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      /* createRequestListener */ RequestListenerFactory, 
      HttpServer
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* createRequestListener */ RequestListenerFactory, 
      /* opts */ atPulumiPulumiLib.resourceMod.ResourceOptions, 
      HttpServer
    ]

