package typings.puppeteer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsScreenUnlocked extends js.Object {
  
  var isScreenUnlocked: Boolean = js.native
  
  var isUserActive: Boolean = js.native
}
object IsScreenUnlocked {
  
  @scala.inline
  def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): IsScreenUnlocked = {
    val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsScreenUnlocked]
  }
  
  @scala.inline
  implicit class IsScreenUnlockedOps[Self <: IsScreenUnlocked] (val x: Self) extends AnyVal {
    
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
    def setIsScreenUnlocked(value: Boolean): Self = this.set("isScreenUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserActive(value: Boolean): Self = this.set("isUserActive", value.asInstanceOf[js.Any])
  }
}
