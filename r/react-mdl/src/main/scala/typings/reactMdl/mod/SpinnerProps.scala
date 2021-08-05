package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var singleColor: js.UndefOr[Boolean] = js.undefined
}
object SpinnerProps {
  
  inline def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  
  extension [Self <: SpinnerProps](x: Self) {
    
    inline def setSingleColor(value: Boolean): Self = StObject.set(x, "singleColor", value.asInstanceOf[js.Any])
    
    inline def setSingleColorUndefined: Self = StObject.set(x, "singleColor", js.undefined)
  }
}
