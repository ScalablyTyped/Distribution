package typings.rsocketCore.rsocketframeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-core/RSocketFrame", "RSocketError")
@js.native
class RSocketError () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /** Metadata about the error for use in introspecting at runtime. */
  var source: ErrorSource = js.native
}

