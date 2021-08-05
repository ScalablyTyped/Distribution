package typings.reactElemental.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelProps extends StObject {
  
  val label: js.UndefOr[String] = js.undefined
  
  val sublabel: js.UndefOr[String] = js.undefined
}
object LabelProps {
  
  inline def apply(): LabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelProps]
  }
  
  extension [Self <: LabelProps](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSublabel(value: String): Self = StObject.set(x, "sublabel", value.asInstanceOf[js.Any])
    
    inline def setSublabelUndefined: Self = StObject.set(x, "sublabel", js.undefined)
  }
}
