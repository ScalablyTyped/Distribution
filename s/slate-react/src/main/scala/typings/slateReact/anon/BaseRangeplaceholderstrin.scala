package typings.slateReact.anon

import typings.slate.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined slate.slate.BaseRange & {  placeholder :string | undefined} */
trait BaseRangeplaceholderstrin extends StObject {
  
  var anchor: Point
  
  var focus: Point
  
  var placeholder: js.UndefOr[String] = js.undefined
}
object BaseRangeplaceholderstrin {
  
  inline def apply(anchor: Point, focus: Point): BaseRangeplaceholderstrin = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRangeplaceholderstrin]
  }
  
  extension [Self <: BaseRangeplaceholderstrin](x: Self) {
    
    inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: Point): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
  }
}
