package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SlateError")
@js.native
class SlateError ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  var code: ErrorCode = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

