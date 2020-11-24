package typings.squirrelly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  @JSName("$cache")
  var $cache: js.UndefOr[Boolean] = js.native
  
  @JSName("$file")
  var $file: js.UndefOr[String] = js.native
  
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def set$cache(value: Boolean): Self = this.set("$cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$cache: Self = this.set("$cache", js.undefined)
    
    @scala.inline
    def set$file(value: String): Self = this.set("$file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$file: Self = this.set("$file", js.undefined)
    
    @scala.inline
    def set$name(value: String): Self = this.set("$name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$name: Self = this.set("$name", js.undefined)
  }
}
