package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsScreenUnlocked extends StObject {
  
  var isScreenUnlocked: Boolean
  
  var isUserActive: Boolean
}
object IsScreenUnlocked {
  
  @scala.inline
  def apply(isScreenUnlocked: Boolean, isUserActive: Boolean): IsScreenUnlocked = {
    val __obj = js.Dynamic.literal(isScreenUnlocked = isScreenUnlocked.asInstanceOf[js.Any], isUserActive = isUserActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsScreenUnlocked]
  }
  
  @scala.inline
  implicit class IsScreenUnlockedMutableBuilder[Self <: IsScreenUnlocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsScreenUnlocked(value: Boolean): Self = StObject.set(x, "isScreenUnlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUserActive(value: Boolean): Self = StObject.set(x, "isUserActive", value.asInstanceOf[js.Any])
  }
}
