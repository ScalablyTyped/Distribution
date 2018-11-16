package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpex extends ISpexBase {
  // API: http://vitaly-t.github.io/spex/errors.html
  var errors: IErrors = js.native
  // API: http://vitaly-t.github.io/spex/stream.html
  var stream: IStream = js.native
}

