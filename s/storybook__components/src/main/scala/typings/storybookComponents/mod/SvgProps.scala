package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgProps extends StObject {
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
}
object SvgProps {
  
  inline def apply(): SvgProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvgProps]
  }
  
  extension [Self <: SvgProps](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
