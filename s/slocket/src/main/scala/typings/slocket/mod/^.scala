package typings.slocket.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slocket", JSImport.Namespace)
@js.native
class ^ protected () extends Slocket {
  def this(lockFile: String) = this()
  def this(lockFile: String, cb: js.Function2[/* error */ Error | Null, /* lock */ Lock, Unit]) = this()
}

@JSImport("slocket", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Slocket]

