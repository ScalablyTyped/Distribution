package typings.prettier.mod.doc.builders

import typings.prettier.prettierBooleans.`true`
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Softline_] (val x: Self) extends AnyVal {
    
    inline def setSoft(value: `true`): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
  }
}
