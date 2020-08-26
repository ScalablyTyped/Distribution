package typings.readConfigFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadConfigResult[T] extends js.Object {
  val configFile: String | Null = js.native
  val result: T = js.native
}

object ReadConfigResult {
  @scala.inline
  def apply[T](result: T): ReadConfigResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigResult[T]]
  }
  @scala.inline
  implicit class ReadConfigResultOps[Self <: ReadConfigResult[_], T] (val x: Self with ReadConfigResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFileNull: Self = this.set("configFile", null)
  }
  
}

