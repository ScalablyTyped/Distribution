package typings.prettier.mod.doc.builders

import typings.prettier.prettierBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HardlineWithoutBreakParent_
  extends StObject
     with Line_ {
  
  @JSName("hard")
  var hard_HardlineWithoutBreakParent_ : `true`
}
object HardlineWithoutBreakParent_ {
  
  inline def apply(): HardlineWithoutBreakParent_ = {
    val __obj = js.Dynamic.literal(hard = true)
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[HardlineWithoutBreakParent_]
  }
  
  extension [Self <: HardlineWithoutBreakParent_](x: Self) {
    
    inline def setHard(value: `true`): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
  }
}
