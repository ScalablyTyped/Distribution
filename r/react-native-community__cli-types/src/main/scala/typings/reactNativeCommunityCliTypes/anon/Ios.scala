package typings.reactNativeCommunityCliTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ios extends js.Object {
  
  var ios: js.UndefOr[SourceDir] = js.native
}
object Ios {
  
  @scala.inline
  def apply(): Ios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ios]
  }
  
  @scala.inline
  implicit class IosOps[Self <: Ios] (val x: Self) extends AnyVal {
    
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
    def setIos(value: SourceDir): Self = this.set("ios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIos: Self = this.set("ios", js.undefined)
  }
}
