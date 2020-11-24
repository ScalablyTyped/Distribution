package typings.reactNativeModal.anon

import typings.reactNativeModal.reactNativeModalStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flex extends js.Object {
  
  var flex: Double = js.native
  
  var justifyContent: center = js.native
}
object Flex {
  
  @scala.inline
  def apply(flex: Double, justifyContent: center): Flex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
  
  @scala.inline
  implicit class FlexOps[Self <: Flex] (val x: Self) extends AnyVal {
    
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
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContent(value: center): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
  }
}
