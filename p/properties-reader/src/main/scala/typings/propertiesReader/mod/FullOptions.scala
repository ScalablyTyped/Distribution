package typings.propertiesReader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullOptions extends js.Object {
  
  var appender: js.UndefOr[AppenderOptions] = js.native
  
  var writer: js.UndefOr[WriterOptions] = js.native
}
object FullOptions {
  
  @scala.inline
  def apply(): FullOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullOptions]
  }
  
  @scala.inline
  implicit class FullOptionsOps[Self <: FullOptions] (val x: Self) extends AnyVal {
    
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
    def setAppender(value: AppenderOptions): Self = this.set("appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppender: Self = this.set("appender", js.undefined)
    
    @scala.inline
    def setWriter(value: WriterOptions): Self = this.set("writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
}
