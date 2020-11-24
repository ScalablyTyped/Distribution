package typings.stripComments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * if `false` strip only line comments
    * @default true
    */
  var block: js.UndefOr[Boolean] = js.native
  
  /**
    * Keep ignored comments (e.g. `/ *!` and `//!`)
    */
  var keepProtected: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 'javascript'
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * if `false` strip only block comments
    * @default true
    */
  var line: js.UndefOr[Boolean] = js.native
  
  /**
    * Preserve newlines after comments are stripped
    */
  var preserveNewlines: js.UndefOr[Boolean] = js.native
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    
    @scala.inline
    def setKeepProtected(value: Boolean): Self = this.set("keepProtected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepProtected: Self = this.set("keepProtected", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLine(value: Boolean): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setPreserveNewlines(value: Boolean): Self = this.set("preserveNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNewlines: Self = this.set("preserveNewlines", js.undefined)
  }
}
