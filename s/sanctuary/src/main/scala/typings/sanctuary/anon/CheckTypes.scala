package typings.sanctuary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckTypes extends js.Object {
  var checkTypes: Boolean = js.native
  var env: js.Array[_] = js.native
}

object CheckTypes {
  @scala.inline
  def apply(checkTypes: Boolean, env: js.Array[_]): CheckTypes = {
    val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckTypes]
  }
  @scala.inline
  implicit class CheckTypesOps[Self <: CheckTypes] (val x: Self) extends AnyVal {
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
    def setCheckTypes(value: Boolean): Self = this.set("checkTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvVarargs(value: js.Any*): Self = this.set("env", js.Array(value :_*))
    @scala.inline
    def setEnv(value: js.Array[_]): Self = this.set("env", value.asInstanceOf[js.Any])
  }
  
}

