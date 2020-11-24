package typings.readlineTransform.mod

import typings.node.streamMod.TransformOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadlineTransformOptions extends TransformOptions {
  
  /** line break matcher for str.split() (default: /\r?\n/) */
  var breakMatcher: js.UndefOr[RegExp] = js.native
  
  /** if content ends with line break, ignore last empty line (default: true) */
  var ignoreEndOfBreak: js.UndefOr[Boolean] = js.native
  
  /** if line is empty string, skip it (default: false) */
  var skipEmpty: js.UndefOr[Boolean] = js.native
}
object ReadlineTransformOptions {
  
  @scala.inline
  def apply(): ReadlineTransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadlineTransformOptions]
  }
  
  @scala.inline
  implicit class ReadlineTransformOptionsOps[Self <: ReadlineTransformOptions] (val x: Self) extends AnyVal {
    
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
    def setBreakMatcher(value: RegExp): Self = this.set("breakMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakMatcher: Self = this.set("breakMatcher", js.undefined)
    
    @scala.inline
    def setIgnoreEndOfBreak(value: Boolean): Self = this.set("ignoreEndOfBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEndOfBreak: Self = this.set("ignoreEndOfBreak", js.undefined)
    
    @scala.inline
    def setSkipEmpty(value: Boolean): Self = this.set("skipEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmpty: Self = this.set("skipEmpty", js.undefined)
  }
}
