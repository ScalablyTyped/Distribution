package typings.pullStream

import typings.pullStream.mod.SourceCallback
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMapMod {
  
  /**
    * Like `map` but the signature of `fn` must be `function (data, cb) { cb(null, data) }`.
    */
  @JSImport("pull-stream/throughs/async-map", JSImport.Namespace)
  @js.native
  def apply[In, Out](fn: js.Function2[/* data */ In, /* cb */ SourceCallback[Out], _]): Through_[In, Out] = js.native
}
