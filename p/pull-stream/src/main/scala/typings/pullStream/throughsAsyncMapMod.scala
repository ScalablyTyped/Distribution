package typings.pullStream

import typings.pullStream.mod.SourceCallback
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsAsyncMapMod {
  
  /**
    * Like `map` but the signature of `fn` must be `function (data, cb) { cb(null, data) }`.
    */
  inline def apply[In, Out](fn: js.Function2[/* data */ In, /* cb */ SourceCallback[Out], Any]): Through_[In, Out] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Through_[In, Out]]
  
  @JSImport("pull-stream/throughs/async-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
