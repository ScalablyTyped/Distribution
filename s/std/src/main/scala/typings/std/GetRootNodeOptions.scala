package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRootNodeOptions extends StObject {
  
  var composed: js.UndefOr[scala.Boolean] = js.native
}
object GetRootNodeOptions {
  
  @scala.inline
  def apply(): GetRootNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRootNodeOptions]
  }
  
  @scala.inline
  implicit class GetRootNodeOptionsMutableBuilder[Self <: GetRootNodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComposed(value: scala.Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
