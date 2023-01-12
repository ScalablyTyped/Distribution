package typings.storybookComponents.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsConfig
  extends StObject
     with _Control {
  
  var labels: Record[Any, String]
  
  var options: Options
  
  var `type`: OptionsControlType
}
object OptionsConfig {
  
  inline def apply(labels: Record[Any, String], options: Options, `type`: OptionsControlType): OptionsConfig = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsConfig] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: Record[Any, String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: OptionsControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
