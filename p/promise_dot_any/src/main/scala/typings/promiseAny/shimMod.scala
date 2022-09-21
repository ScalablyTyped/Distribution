package typings.promiseAny

import typings.promiseAny.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  inline def apply(): FnCall = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FnCall]
  
  @JSImport("promise.any/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
