package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BDelayInit extends StObject {
  
  var bDelayInit: Boolean = js.native
  
  var separatorChar: String = js.native
  
  var singleValuePropTypeID: String = js.native
}
object BDelayInit {
  
  @scala.inline
  def apply(bDelayInit: Boolean, separatorChar: String, singleValuePropTypeID: String): BDelayInit = {
    val __obj = js.Dynamic.literal(bDelayInit = bDelayInit.asInstanceOf[js.Any], separatorChar = separatorChar.asInstanceOf[js.Any], singleValuePropTypeID = singleValuePropTypeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDelayInit]
  }
  
  @scala.inline
  implicit class BDelayInitMutableBuilder[Self <: BDelayInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBDelayInit(value: Boolean): Self = StObject.set(x, "bDelayInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorChar(value: String): Self = StObject.set(x, "separatorChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValuePropTypeID(value: String): Self = StObject.set(x, "singleValuePropTypeID", value.asInstanceOf[js.Any])
  }
}
