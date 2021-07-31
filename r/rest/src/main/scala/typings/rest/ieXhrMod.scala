package typings.rest

import org.scalablytyped.runtime.Shortcut
import typings.rest.mod.Interceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ieXhrMod extends Shortcut {
  
  @JSImport("rest/interceptor/ie/xhr", JSImport.Namespace)
  @js.native
  val ^ : Interceptor[js.Object] = js.native
  
  type _To = Interceptor[js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `ieXhrMod.foo` */
  override def _to: Interceptor[js.Object] = ^
}
