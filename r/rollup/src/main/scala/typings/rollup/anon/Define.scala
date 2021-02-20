package typings.rollup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Define extends StObject {
  
  var define: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object Define {
  
  @scala.inline
  def apply(): Define = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Define]
  }
  
  @scala.inline
  implicit class DefineMutableBuilder[Self <: Define] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefine(value: String): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
