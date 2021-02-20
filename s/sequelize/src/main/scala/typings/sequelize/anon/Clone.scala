package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clone extends StObject {
  
  @JSName("clone")
  var clone_FClone: js.UndefOr[Boolean] = js.native
  
  var plain: js.UndefOr[Boolean] = js.native
}
object Clone {
  
  @scala.inline
  def apply(): Clone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clone]
  }
  
  @scala.inline
  implicit class CloneMutableBuilder[Self <: Clone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
  }
}
