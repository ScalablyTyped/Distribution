package typings.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumStandalone.anon.Dictx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsPaths
  extends /* x */ StringDictionary[js.Any] {
  
  var chrome: js.UndefOr[Dictx] = js.native
  
  var edge: js.UndefOr[Dictx] = js.native
  
  var firefox: js.UndefOr[Dictx] = js.native
  
  var ie: js.UndefOr[Dictx] = js.native
  
  var selenium: js.UndefOr[Dictx] = js.native
}
object FsPaths {
  
  @scala.inline
  def apply(): FsPaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsPaths]
  }
  
  @scala.inline
  implicit class FsPathsOps[Self <: FsPaths] (val x: Self) extends AnyVal {
    
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
    def setChrome(value: Dictx): Self = this.set("chrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome: Self = this.set("chrome", js.undefined)
    
    @scala.inline
    def setEdge(value: Dictx): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setFirefox(value: Dictx): Self = this.set("firefox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirefox: Self = this.set("firefox", js.undefined)
    
    @scala.inline
    def setIe(value: Dictx): Self = this.set("ie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIe: Self = this.set("ie", js.undefined)
    
    @scala.inline
    def setSelenium(value: Dictx): Self = this.set("selenium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium: Self = this.set("selenium", js.undefined)
  }
}
