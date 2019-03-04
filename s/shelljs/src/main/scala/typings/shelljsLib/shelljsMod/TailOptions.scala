package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TailOptions extends js.Object {
  /** Show the last <num> lines of files. */
  var `-n`: scala.Double
}

object TailOptions {
  @scala.inline
  def apply(`-n`: scala.Double): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`)
    __obj.asInstanceOf[TailOptions]
  }
}

