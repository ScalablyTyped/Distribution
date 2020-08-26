package typings.pulumiAws.inputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScriptDagNodeArg extends js.Object {
  /**
    * The name of the argument or property.
    */
  var name: String = js.native
  /**
    * Boolean if the value is used as a parameter. Defaults to `false`.
    */
  var param: js.UndefOr[Boolean] = js.native
  /**
    * The value of the argument or property.
    */
  var value: String = js.native
}

object GetScriptDagNodeArg {
  @scala.inline
  def apply(name: String, value: String): GetScriptDagNodeArg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptDagNodeArg]
  }
  @scala.inline
  implicit class GetScriptDagNodeArgOps[Self <: GetScriptDagNodeArg] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: Boolean): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

