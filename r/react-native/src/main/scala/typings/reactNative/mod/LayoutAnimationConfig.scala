package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutAnimationConfig extends StObject {
  
  var create: js.UndefOr[LayoutAnimationAnim] = js.native
  
  var delete: js.UndefOr[LayoutAnimationAnim] = js.native
  
  var duration: Double = js.native
  
  var update: js.UndefOr[LayoutAnimationAnim] = js.native
}
object LayoutAnimationConfig {
  
  @scala.inline
  def apply(duration: Double): LayoutAnimationConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationConfig]
  }
  
  @scala.inline
  implicit class LayoutAnimationConfigMutableBuilder[Self <: LayoutAnimationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: LayoutAnimationAnim): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setDelete(value: LayoutAnimationAnim): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: LayoutAnimationAnim): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
