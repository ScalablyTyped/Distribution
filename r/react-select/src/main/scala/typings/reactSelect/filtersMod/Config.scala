package typings.reactSelect.filtersMod

import typings.reactSelect.reactSelectStrings.any
import typings.reactSelect.reactSelectStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var ignoreAccents: js.UndefOr[Boolean] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var matchFrom: js.UndefOr[any | start] = js.native
  
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setIgnoreAccents(value: Boolean): Self = this.set("ignoreAccents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAccents: Self = this.set("ignoreAccents", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    
    @scala.inline
    def setMatchFrom(value: any | start): Self = this.set("matchFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchFrom: Self = this.set("matchFrom", js.undefined)
    
    @scala.inline
    def setStringify(value: /* obj */ js.Any => String): Self = this.set("stringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
