package typings.reactWidgets.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastValueFromProps extends StObject {
  
  var lastValueFromProps: String
  
  var stringValue: String
}
object LastValueFromProps {
  
  inline def apply(lastValueFromProps: String, stringValue: String): LastValueFromProps = {
    val __obj = js.Dynamic.literal(lastValueFromProps = lastValueFromProps.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastValueFromProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastValueFromProps] (val x: Self) extends AnyVal {
    
    inline def setLastValueFromProps(value: String): Self = StObject.set(x, "lastValueFromProps", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
  }
}
