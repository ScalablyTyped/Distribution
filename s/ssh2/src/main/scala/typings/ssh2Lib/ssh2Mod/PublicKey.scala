package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  /** The name of the key algorithm. */
  var algo: java.lang.String
  /** The actual key data. */
  var data: nodeLib.Buffer
}

object PublicKey {
  @scala.inline
  def apply(algo: java.lang.String, data: nodeLib.Buffer): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algo")(algo)
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[PublicKey]
  }
}

