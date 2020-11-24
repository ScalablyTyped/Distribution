package typings.stringReplaceLoader.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceEntry extends Options {
  
  var flags: js.UndefOr[String] = js.native
  
  var replace: String | ReplaceCallback = js.native
  
  var search: String | RegExp = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object ReplaceEntry {
  
  @scala.inline
  def apply(replace: String | ReplaceCallback, search: String | RegExp): ReplaceEntry = {
    val __obj = js.Dynamic.literal(replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceEntry]
  }
  
  @scala.inline
  implicit class ReplaceEntryOps[Self <: ReplaceEntry] (val x: Self) extends AnyVal {
    
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
    def setReplaceFunction2(value: (/* substring */ String, /* repeated */ js.Any) => String): Self = this.set("replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplace(value: String | ReplaceCallback): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String | RegExp): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
