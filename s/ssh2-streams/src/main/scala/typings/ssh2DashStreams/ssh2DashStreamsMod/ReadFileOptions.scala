package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object ReadFileOptions {
  @scala.inline
  def apply(encoding: String = null, flag: String = null): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[ReadFileOptions]
  }
}

