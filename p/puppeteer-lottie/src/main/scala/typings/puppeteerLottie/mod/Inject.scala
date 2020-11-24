package typings.puppeteerLottie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inject extends js.Object {
  
  /**
    * Optionally injected into the document <body>
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    *  Optionally injected into the document <head>
    */
  var head: js.UndefOr[String] = js.native
  
  /**
    * Optionally injected into a <style> tag within the document <head>
    */
  var style: js.UndefOr[String] = js.native
}
object Inject {
  
  @scala.inline
  def apply(): Inject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inject]
  }
  
  @scala.inline
  implicit class InjectOps[Self <: Inject] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
