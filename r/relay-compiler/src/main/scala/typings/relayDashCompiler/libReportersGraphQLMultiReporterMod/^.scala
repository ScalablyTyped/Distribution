package typings.relayDashCompiler.libReportersGraphQLMultiReporterMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/reporters/GraphQLMultiReporter", JSImport.Namespace)
@js.native
class ^ () extends GraphQLMultiReporter {
  /* CompleteClass */
  override def reportError(caughtLocation: String, error: Error): Unit = js.native
  /* CompleteClass */
  override def reportMessage(message: String): Unit = js.native
  /* CompleteClass */
  override def reportTime(name: String, ms: Double): Unit = js.native
}

