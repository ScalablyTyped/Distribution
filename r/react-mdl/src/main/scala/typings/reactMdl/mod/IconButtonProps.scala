package typings.reactMdl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonProps
  extends StObject
     with ButtonProps {
  
  var raised: js.UndefOr[Boolean] = js.undefined
}
object IconButtonProps {
  
  inline def apply(): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
    
    inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
  }
}
