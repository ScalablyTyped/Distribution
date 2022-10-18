package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinksConcatMod {
  
  /**
    * Concat stream of strings into single string, then call `cb`.
    */
  inline def apply(): Sink[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[String]]
  inline def apply(cb: js.Function2[/* err */ EndOrError, /* result */ String, Any]): Sink[String] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[String]]
  
  @JSImport("pull-stream/sinks/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
