package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMain extends StObject {
  
  var isMain: Boolean
}
object IsMain {
  
  inline def apply(isMain: Boolean): IsMain = {
    val __obj = js.Dynamic.literal(isMain = isMain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMain]
  }
  
  extension [Self <: IsMain](x: Self) {
    
    inline def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
