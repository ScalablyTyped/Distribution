package typings.remarkStringify.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarkCompiler extends js.Object {
  var visitors: StringDictionary[Visitor]
  def compile(): String
}

object RemarkCompiler {
  @scala.inline
  def apply(compile: () => String, visitors: StringDictionary[Visitor]): RemarkCompiler = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), visitors = visitors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarkCompiler]
  }
}

