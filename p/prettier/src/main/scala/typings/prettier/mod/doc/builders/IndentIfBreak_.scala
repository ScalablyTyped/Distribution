package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`indent-if-break`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentIfBreak_
  extends StObject
     with DocCommand {
  
  var `type`: `indent-if-break`
}
object IndentIfBreak_ {
  
  inline def apply(): IndentIfBreak_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("indent-if-break")
    __obj.asInstanceOf[IndentIfBreak_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndentIfBreak_] (val x: Self) extends AnyVal {
    
    inline def setType(value: `indent-if-break`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
