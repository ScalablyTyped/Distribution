package typings.sentryUtils.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictownProps
  extends StObject
     with /* ownProps */ StringDictionary[Any] {
  
  var currentTarget: String
  
  var detail: js.UndefOr[Any] = js.undefined
  
  var target: String
  
  var `type`: String
}
object DictownProps {
  
  inline def apply(currentTarget: String, target: String, `type`: String): DictownProps = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictownProps]
  }
  
  extension [Self <: DictownProps](x: Self) {
    
    inline def setCurrentTarget(value: String): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
