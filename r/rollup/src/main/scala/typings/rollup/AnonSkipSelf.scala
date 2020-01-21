package typings.rollup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkipSelf extends js.Object {
  var skipSelf: Boolean
}

object AnonSkipSelf {
  @scala.inline
  def apply(skipSelf: Boolean): AnonSkipSelf = {
    val __obj = js.Dynamic.literal(skipSelf = skipSelf.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSkipSelf]
  }
}

