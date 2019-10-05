package typings.atPulumiCloud.httpServerMod

import org.scalablytyped.runtime.TopLevel
import typings.atPulumiPulumi.outputMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpServer extends js.Object {
  val url: Output[String]
}

@JSImport("@pulumi/cloud/httpServer", "HttpServer")
@js.native
object HttpServer extends TopLevel[HttpServerConstructor]

