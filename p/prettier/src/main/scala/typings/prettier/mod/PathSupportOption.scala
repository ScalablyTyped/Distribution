package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathSupportOption
  extends BaseSupportOption[path]
     with _SupportOption {
  
  var default: String = js.native
  
  var array: js.UndefOr[`false`] = js.native
}
object PathSupportOption {
  
  @scala.inline
  def apply(category: String, default: String, since: String, `type`: path): PathSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSupportOption]
  }
  
  @scala.inline
  implicit class PathSupportOptionMutableBuilder[Self <: PathSupportOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
