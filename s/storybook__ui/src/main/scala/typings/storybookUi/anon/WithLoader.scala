package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithLoader extends StObject {
  
  var id: String = js.native
  
  var withLoader: Boolean = js.native
}
object WithLoader {
  
  @scala.inline
  def apply(id: String, withLoader: Boolean): WithLoader = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], withLoader = withLoader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithLoader]
  }
  
  @scala.inline
  implicit class WithLoaderMutableBuilder[Self <: WithLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithLoader(value: Boolean): Self = StObject.set(x, "withLoader", value.asInstanceOf[js.Any])
  }
}
