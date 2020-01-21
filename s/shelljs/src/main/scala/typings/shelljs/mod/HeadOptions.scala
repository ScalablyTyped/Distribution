package typings.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadOptions extends js.Object {
  /** Show the first <num> lines of the files. */
  var `-n`: Double
}

object HeadOptions {
  @scala.inline
  def apply(`-n`: Double): HeadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadOptions]
  }
}

