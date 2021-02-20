package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsUIVisible extends StObject {
  
  var isUIVisible: Boolean = js.native
}
object IsUIVisible {
  
  @scala.inline
  def apply(isUIVisible: Boolean): IsUIVisible = {
    val __obj = js.Dynamic.literal(isUIVisible = isUIVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUIVisible]
  }
  
  @scala.inline
  implicit class IsUIVisibleMutableBuilder[Self <: IsUIVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsUIVisible(value: Boolean): Self = StObject.set(x, "isUIVisible", value.asInstanceOf[js.Any])
  }
}
