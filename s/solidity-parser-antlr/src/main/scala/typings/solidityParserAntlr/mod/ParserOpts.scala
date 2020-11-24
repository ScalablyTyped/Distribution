package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOpts extends js.Object {
  
  var loc: js.UndefOr[Boolean] = js.native
  
  var range: js.UndefOr[Boolean] = js.native
  
  var tolerant: js.UndefOr[Boolean] = js.native
}
object ParserOpts {
  
  @scala.inline
  def apply(): ParserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOpts]
  }
  
  @scala.inline
  implicit class ParserOptsOps[Self <: ParserOpts] (val x: Self) extends AnyVal {
    
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
    def setLoc(value: Boolean): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
  }
}
