package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMain extends StObject {
  
  var isMain: Boolean
}
object IsMain {
  
  @scala.inline
  def apply(isMain: Boolean): IsMain = {
    val __obj = js.Dynamic.literal(isMain = isMain.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMain]
  }
  
  @scala.inline
  implicit class IsMainMutableBuilder[Self <: IsMain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMain(value: Boolean): Self = StObject.set(x, "isMain", value.asInstanceOf[js.Any])
  }
}
