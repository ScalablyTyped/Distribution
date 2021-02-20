package typings.sequelize.anon

import typings.sequelize.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait As extends StObject {
  
  var as: js.UndefOr[String] = js.native
  
  var model: Model[_, _, _] = js.native
}
object As {
  
  @scala.inline
  def apply(model: Model[_, _, _]): As = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  @scala.inline
  implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setModel(value: Model[_, _, _]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
