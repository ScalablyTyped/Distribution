package typings.recast.babelOptionsMod

import typings.recast.recastStrings.module
import typings.recast.recastStrings.script
import typings.recast.recastStrings.unambiguous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  sourceType :@babel/parser.@babel/parser.ParserOptions['sourceType'],   strictMode :@babel/parser.@babel/parser.ParserOptions['strictMode']}> */
@js.native
trait Overrides extends js.Object {
  
  var sourceType: js.UndefOr[script | module | unambiguous] = js.native
  
  var strictMode: js.UndefOr[Boolean] = js.native
}
object Overrides {
  
  @scala.inline
  def apply(): Overrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overrides]
  }
  
  @scala.inline
  implicit class OverridesOps[Self <: Overrides] (val x: Self) extends AnyVal {
    
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
    def setSourceType(value: script | module | unambiguous): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    
    @scala.inline
    def setStrictMode(value: Boolean): Self = this.set("strictMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictMode: Self = this.set("strictMode", js.undefined)
  }
}
