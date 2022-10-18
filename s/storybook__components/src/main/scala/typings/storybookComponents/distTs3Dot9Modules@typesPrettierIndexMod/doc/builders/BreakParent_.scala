package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders

import typings.storybookComponents.storybookComponentsStrings.`break-parent`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakParent_
  extends StObject
     with DocCommand {
  
  var `type`: `break-parent`
}
object BreakParent_ {
  
  inline def apply(): BreakParent_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("break-parent")
    __obj.asInstanceOf[BreakParent_]
  }
  
  extension [Self <: BreakParent_](x: Self) {
    
    inline def setType(value: `break-parent`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
