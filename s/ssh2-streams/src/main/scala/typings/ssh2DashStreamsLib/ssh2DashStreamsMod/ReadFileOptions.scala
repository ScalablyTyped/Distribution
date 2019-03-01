package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileOptions extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object ReadFileOptions {
  @scala.inline
  def apply(encoding: java.lang.String = null, flag: java.lang.String = null): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[ReadFileOptions]
  }
}

