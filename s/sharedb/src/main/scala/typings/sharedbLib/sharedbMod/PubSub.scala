package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharedb", "PubSub")
@js.native
abstract class PubSub protected ()
  extends sharedbLib.sharedbMod.sharedbNs.PubSub {
  protected def this(options: PubSubOptions) = this()
}

/* static members */
@JSImport("sharedb", "PubSub")
@js.native
object PubSub extends js.Object {
  /* private */ def shallowCopy(obj: js.Any): js.Any = js.native
}

