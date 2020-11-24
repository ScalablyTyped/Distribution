package typings.reactNativeCommunityCameraroll.mod

import typings.reactNativeCommunityCameraroll.anon.Groupname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoIdentifier extends js.Object {
  
  var node: Groupname = js.native
}
object PhotoIdentifier {
  
  @scala.inline
  def apply(node: Groupname): PhotoIdentifier = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoIdentifier]
  }
  
  @scala.inline
  implicit class PhotoIdentifierOps[Self <: PhotoIdentifier] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Groupname): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}
