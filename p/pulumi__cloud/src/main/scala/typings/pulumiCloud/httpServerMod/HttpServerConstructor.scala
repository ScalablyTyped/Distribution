package typings.pulumiCloud.httpServerMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.pulumiPulumi.resourceMod.ResourceOptions
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
Instantiable2[/* name */ String, /* createRequestListener */ RequestListenerFactory, HttpServer]
     with Instantiable3[
      /* name */ String, 
      /* createRequestListener */ RequestListenerFactory, 
      /* opts */ ResourceOptions, 
      HttpServer
    ]

