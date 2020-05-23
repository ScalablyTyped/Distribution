package typings.reactMdl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recursive extends js.Object {
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object Recursive {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined): Recursive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recursive]
  }
}

