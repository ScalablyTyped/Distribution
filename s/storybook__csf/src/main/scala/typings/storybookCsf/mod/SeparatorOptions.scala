package typings.storybookCsf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparatorOptions extends StObject {
  
  var groupSeparator: String | js.RegExp
  
  var rootSeparator: String | js.RegExp
}
object SeparatorOptions {
  
  inline def apply(groupSeparator: String | js.RegExp, rootSeparator: String | js.RegExp): SeparatorOptions = {
    val __obj = js.Dynamic.literal(groupSeparator = groupSeparator.asInstanceOf[js.Any], rootSeparator = rootSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeparatorOptions] (val x: Self) extends AnyVal {
    
    inline def setGroupSeparator(value: String | js.RegExp): Self = StObject.set(x, "groupSeparator", value.asInstanceOf[js.Any])
    
    inline def setRootSeparator(value: String | js.RegExp): Self = StObject.set(x, "rootSeparator", value.asInstanceOf[js.Any])
  }
}
