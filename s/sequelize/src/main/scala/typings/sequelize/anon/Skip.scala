package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skip extends StObject {
  
  var skip: js.UndefOr[js.Array[String]] = js.native
}
object Skip {
  
  @scala.inline
  def apply(): Skip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skip]
  }
  
  @scala.inline
  implicit class SkipMutableBuilder[Self <: Skip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkip(value: js.Array[String]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value :_*))
  }
}
