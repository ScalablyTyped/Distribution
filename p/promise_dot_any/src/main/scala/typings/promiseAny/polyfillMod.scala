package typings.promiseAny

import typings.promiseAny.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfillMod {
  
  inline def apply(): FnCall = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FnCall]
  
  @JSImport("promise.any/polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
