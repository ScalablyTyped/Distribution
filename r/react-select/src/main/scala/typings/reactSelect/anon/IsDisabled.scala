package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDisabled extends StObject {
  
  /** Boolean indicating if the selected menu option is disabled */
  var isDisabled: Boolean | Null
  
  /** String derived label from selected or removed option/value */
  var label: String
  
  /** Array of labels derived from multiple selected or cleared options */
  var labels: js.Array[String]
}
object IsDisabled {
  
  inline def apply(label: String, labels: js.Array[String]): IsDisabled = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], isDisabled = null)
    __obj.asInstanceOf[IsDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDisabled] (val x: Self) extends AnyVal {
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledNull: Self = StObject.set(x, "isDisabled", null)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
