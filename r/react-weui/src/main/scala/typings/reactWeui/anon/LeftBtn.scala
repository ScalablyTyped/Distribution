package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftBtn extends StObject {
  
  var leftBtn: String
  
  var rightBtn: String
}
object LeftBtn {
  
  inline def apply(leftBtn: String, rightBtn: String): LeftBtn = {
    val __obj = js.Dynamic.literal(leftBtn = leftBtn.asInstanceOf[js.Any], rightBtn = rightBtn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftBtn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeftBtn] (val x: Self) extends AnyVal {
    
    inline def setLeftBtn(value: String): Self = StObject.set(x, "leftBtn", value.asInstanceOf[js.Any])
    
    inline def setRightBtn(value: String): Self = StObject.set(x, "rightBtn", value.asInstanceOf[js.Any])
  }
}
