package typings.randomatic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chars extends js.Object {
  
  var chars: js.UndefOr[String] = js.native
  
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
}
object Chars {
  
  @scala.inline
  def apply(): Chars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chars]
  }
  
  @scala.inline
  implicit class CharsOps[Self <: Chars] (val x: Self) extends AnyVal {
    
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
    def setChars(value: String): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
  }
}
