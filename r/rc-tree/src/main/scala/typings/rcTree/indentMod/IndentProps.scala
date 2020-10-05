package typings.rcTree.indentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndentProps extends js.Object {
  var isEnd: js.Array[Boolean] = js.native
  var isStart: js.Array[Boolean] = js.native
  var level: Double = js.native
  var prefixCls: String = js.native
}

object IndentProps {
  @scala.inline
  def apply(isEnd: js.Array[Boolean], isStart: js.Array[Boolean], level: Double, prefixCls: String): IndentProps = {
    val __obj = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndentProps]
  }
  @scala.inline
  implicit class IndentPropsOps[Self <: IndentProps] (val x: Self) extends AnyVal {
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
    def setIsEndVarargs(value: Boolean*): Self = this.set("isEnd", js.Array(value :_*))
    @scala.inline
    def setIsEnd(value: js.Array[Boolean]): Self = this.set("isEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStartVarargs(value: Boolean*): Self = this.set("isStart", js.Array(value :_*))
    @scala.inline
    def setIsStart(value: js.Array[Boolean]): Self = this.set("isStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

