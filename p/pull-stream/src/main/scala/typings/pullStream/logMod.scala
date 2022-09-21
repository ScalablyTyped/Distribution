package typings.pullStream

import typings.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  /**
    * Output the stream to `console.log`.
    */
  inline def apply(): Sink[Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[Any]]
  
  @JSImport("pull-stream/sinks/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
