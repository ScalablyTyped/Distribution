package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BDelayInit extends StObject {
  
  var bDelayInit: Boolean
  
  var separatorChar: String
  
  var singleValuePropTypeID: String
}
object BDelayInit {
  
  inline def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): BDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDelayInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BDelayInit] (val x: Self) extends AnyVal {
    
    inline def setBDelayInit(value: Boolean): Self = StObject.set(x, "bDelayInit", value.asInstanceOf[js.Any])
    
    inline def setSeparatorChar(value: String): Self = StObject.set(x, "separatorChar", value.asInstanceOf[js.Any])
    
    inline def setSingleValuePropTypeID(value: String): Self = StObject.set(x, "singleValuePropTypeID", value.asInstanceOf[js.Any])
  }
}
