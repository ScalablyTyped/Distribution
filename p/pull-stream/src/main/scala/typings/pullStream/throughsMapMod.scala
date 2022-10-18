package typings.pullStream

import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsMapMod {
  
  /**
    * Returns a through stream that calls the given `fn` for each chunk of incoming data and outputs the return value, in the same order as before.
    */
  inline def apply[In, Out](fn: js.Function1[/* data */ In, Out]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  
  @JSImport("pull-stream/throughs/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
