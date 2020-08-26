package typings.remarkStringify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarkCompiler extends js.Object {
  var visitors: StringDictionary[Visitor] = js.native
  def compile(): String = js.native
}

object RemarkCompiler {
  @scala.inline
  def apply(compile: () => String, visitors: StringDictionary[Visitor]): RemarkCompiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), visitors = visitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarkCompiler]
  }
  @scala.inline
  implicit class RemarkCompilerOps[Self <: RemarkCompiler] (val x: Self) extends AnyVal {
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
    def setCompile(value: () => String): Self = this.set("compile", js.Any.fromFunction0(value))
    @scala.inline
    def setVisitors(value: StringDictionary[Visitor]): Self = this.set("visitors", value.asInstanceOf[js.Any])
  }
  
}

