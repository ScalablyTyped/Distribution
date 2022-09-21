package typings.storybookComponents.typesPrettierIndexMod.doc.builders

import typings.storybookComponents.storybookComponentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Softline_
  extends StObject
     with Line_ {
  
  @JSName("soft")
  var soft_Softline_ : `true`
}
object Softline_ {
  
  inline def apply(): Softline_ = {
    val __obj = js.Dynamic.literal(soft = true)
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[Softline_]
  }
  
  extension [Self <: Softline_](x: Self) {
    
    inline def setSoft(value: `true`): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
  }
}
