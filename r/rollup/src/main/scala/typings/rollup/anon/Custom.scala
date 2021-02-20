package typings.rollup.anon

import typings.rollup.mod.CustomPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Custom extends StObject {
  
  var custom: js.UndefOr[CustomPluginOptions] = js.native
  
  var skipSelf: js.UndefOr[Boolean] = js.native
}
object Custom {
  
  @scala.inline
  def apply(): Custom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Custom]
  }
  
  @scala.inline
  implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setSkipSelf(value: Boolean): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSelfUndefined: Self = StObject.set(x, "skipSelf", js.undefined)
  }
}
