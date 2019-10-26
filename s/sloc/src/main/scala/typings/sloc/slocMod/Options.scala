package typings.sloc.slocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: Boolean
}

object Options {
  @scala.inline
  def apply(debug: Boolean): Options = {
    val __obj = js.Dynamic.literal(debug = debug)
  
    __obj.asInstanceOf[Options]
  }
}

