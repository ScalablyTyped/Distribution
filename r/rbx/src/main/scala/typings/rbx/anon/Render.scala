package typings.rbx.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Render extends StObject {
  
  var render: Validator[js.Function1[/* repeated */ _, _]] = js.native
}
object Render {
  
  @scala.inline
  def apply(render: Validator[js.Function1[/* repeated */ _, _]]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  @scala.inline
  implicit class RenderMutableBuilder[Self <: Render] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRender(value: Validator[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
