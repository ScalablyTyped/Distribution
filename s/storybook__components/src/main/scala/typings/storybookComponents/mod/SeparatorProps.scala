package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparatorProps extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object SeparatorProps {
  
  inline def apply(): SeparatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorProps]
  }
  
  extension [Self <: SeparatorProps](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
