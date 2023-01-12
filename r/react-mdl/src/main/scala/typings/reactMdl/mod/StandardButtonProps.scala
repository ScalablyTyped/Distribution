package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardButtonProps
  extends StObject
     with ButtonProps {
  
  var raised: js.UndefOr[Boolean] = js.undefined
}
object StandardButtonProps {
  
  inline def apply(): StandardButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardButtonProps] (val x: Self) extends AnyVal {
    
    inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
  }
}
