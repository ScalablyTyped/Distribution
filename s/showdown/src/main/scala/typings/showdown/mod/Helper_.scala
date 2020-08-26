package typings.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Helper Interface 
  */
@js.native
trait Helper_
  extends /* key */ StringDictionary[js.Function1[/* repeated */ js.Any, _]] {
  def replaceRecursiveRegExp(args: js.Any*): String = js.native
}

object Helper_ {
  @scala.inline
  def apply(replaceRecursiveRegExp: /* repeated */ js.Any => String): Helper_ = {
    val __obj = js.Dynamic.literal(replaceRecursiveRegExp = js.Any.fromFunction1(replaceRecursiveRegExp))
    __obj.asInstanceOf[Helper_]
  }
  @scala.inline
  implicit class Helper_Ops[Self <: Helper_] (val x: Self) extends AnyVal {
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
    def setReplaceRecursiveRegExp(value: /* repeated */ js.Any => String): Self = this.set("replaceRecursiveRegExp", js.Any.fromFunction1(value))
  }
  
}

