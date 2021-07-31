package typings.reactNativeMaterialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  var icon: String
  
  var labels: js.Array[String]
}
object Labels {
  
  @scala.inline
  def apply(icon: String, labels: js.Array[String]): Labels = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  @scala.inline
  implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
  }
}
