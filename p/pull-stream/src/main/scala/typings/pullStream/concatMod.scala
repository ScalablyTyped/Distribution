package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatMod {
  
  /**
    * Concat stream of strings into single string, then call `cb`.
    */
  @JSImport("pull-stream/sinks/concat", JSImport.Namespace)
  @js.native
  def apply(): Sink[String] = js.native
  @JSImport("pull-stream/sinks/concat", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function2[/* err */ EndOrError, /* result */ String, _]): Sink[String] = js.native
}
