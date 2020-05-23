package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipSelf extends js.Object {
  var skipSelf: Boolean
}

object SkipSelf {
  @scala.inline
  def apply(skipSelf: Boolean): SkipSelf = {
    val __obj = js.Dynamic.literal(skipSelf = skipSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkipSelf]
  }
}

