package typings.roads

import typings.roads.roadMod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyToContextMod {
  
  @JSImport("roads/types/middleware/applyToContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(key: String, `val`: js.Any): Middleware = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Middleware]
}
