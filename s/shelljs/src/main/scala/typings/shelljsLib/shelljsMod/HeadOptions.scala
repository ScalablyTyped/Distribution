package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadOptions extends js.Object {
  /** Show the first <num> lines of the files. */
  var `-n`: scala.Double
}

object HeadOptions {
  @scala.inline
  def apply(`-n`: scala.Double): HeadOptions = {
    val __obj = js.Dynamic.literal(`-n` = `-n`)
  
    __obj.asInstanceOf[HeadOptions]
  }
}

