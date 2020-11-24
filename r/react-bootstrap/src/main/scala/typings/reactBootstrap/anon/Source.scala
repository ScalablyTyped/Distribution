package typings.reactBootstrap.anon

import typings.reactBootstrap.reactBootstrapStrings.click
import typings.reactBootstrap.reactBootstrapStrings.keydown
import typings.reactBootstrap.reactBootstrapStrings.rootClose
import typings.reactBootstrap.reactBootstrapStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  var source: select | click | rootClose | keydown = js.native
}
object Source {
  
  @scala.inline
  def apply(source: select | click | rootClose | keydown): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
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
    def setSource(value: select | click | rootClose | keydown): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
