package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`.doc.builders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trim_
  extends StObject
     with DocCommand {
  
  var `type`: typings.storybookComponents.storybookComponentsStrings.trim
}
object Trim_ {
  
  inline def apply(): Trim_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[Trim_]
  }
  
  extension [Self <: Trim_](x: Self) {
    
    inline def setType(value: typings.storybookComponents.storybookComponentsStrings.trim): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
