package typings.standardAsCallback

import typings.standardAsCallback.anon.FnCall
import typings.standardAsCallback.typesMod.CallbackFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("standard-as-callback/built/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryCatch[T](fn: CallbackFunction[T]): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(fn.asInstanceOf[js.Any]).asInstanceOf[FnCall]
}
