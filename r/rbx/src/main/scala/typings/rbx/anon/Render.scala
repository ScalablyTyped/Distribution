package typings.rbx.anon

import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Render extends StObject {
  
  var render: Validator[js.Function1[/* repeated */ js.Any, js.Any]]
}
object Render {
  
  inline def apply(render: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Render = {
    val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Render]
  }
  
  extension [Self <: Render](x: Self) {
    
    inline def setRender(value: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
