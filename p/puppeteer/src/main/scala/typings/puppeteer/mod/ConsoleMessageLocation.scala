package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleMessageLocation extends js.Object {
  
  /**
    * Column number in the resource if known.
    */
  var columnNumber: js.UndefOr[Double] = js.native
  
  /**
    * Line number in the resource if known
    */
  var lineNumber: js.UndefOr[Double] = js.native
  
  /**
    * URL of the resource if known.
    */
  var url: js.UndefOr[String] = js.native
}
object ConsoleMessageLocation {
  
  @scala.inline
  def apply(): ConsoleMessageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleMessageLocation]
  }
  
  @scala.inline
  implicit class ConsoleMessageLocationOps[Self <: ConsoleMessageLocation] (val x: Self) extends AnyVal {
    
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
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
