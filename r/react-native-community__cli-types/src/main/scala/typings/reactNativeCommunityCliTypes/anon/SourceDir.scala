package typings.reactNativeCommunityCliTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceDir extends js.Object {
  
  var sourceDir: String = js.native
}
object SourceDir {
  
  @scala.inline
  def apply(sourceDir: String): SourceDir = {
    val __obj = js.Dynamic.literal(sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceDir]
  }
  
  @scala.inline
  implicit class SourceDirOps[Self <: SourceDir] (val x: Self) extends AnyVal {
    
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
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
}
