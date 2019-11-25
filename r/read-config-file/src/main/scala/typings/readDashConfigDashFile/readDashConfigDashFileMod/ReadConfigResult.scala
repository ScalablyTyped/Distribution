package typings.readDashConfigDashFile.readDashConfigDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfigResult[T] extends js.Object {
  val configFile: String | Null
  val result: T
}

object ReadConfigResult {
  @scala.inline
  def apply[T](result: T, configFile: String = null): ReadConfigResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigResult[T]]
  }
}

