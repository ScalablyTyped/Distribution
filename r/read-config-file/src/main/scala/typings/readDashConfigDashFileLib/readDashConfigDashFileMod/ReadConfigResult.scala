package typings
package readDashConfigDashFileLib.readDashConfigDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfigResult[T] extends js.Object {
  val configFile: java.lang.String | scala.Null
  val result: T
}

object ReadConfigResult {
  @scala.inline
  def apply[T](result: T, configFile: java.lang.String = null): ReadConfigResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile)
    __obj.asInstanceOf[ReadConfigResult[T]]
  }
}

