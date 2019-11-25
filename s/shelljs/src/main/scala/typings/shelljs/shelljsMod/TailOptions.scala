package typings.shelljs.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TailOptions extends js.Object {
  /** Show the last <num> lines of files. */
  var `-n`: Double
}

object TailOptions {
  @scala.inline
  def apply(`-n`: Double): TailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TailOptions]
  }
}

