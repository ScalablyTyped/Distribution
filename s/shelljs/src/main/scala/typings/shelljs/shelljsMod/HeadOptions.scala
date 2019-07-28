package typings.shelljs.shelljsMod

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
    __obj.updateDynamic("-n")(`-n`)
    __obj.asInstanceOf[HeadOptions]
  }
}

