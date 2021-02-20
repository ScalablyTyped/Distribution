package typings.pullStream

import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteMod {
  
  /**
    * Create an unending stream by repeatedly calling a generator function (by default, `Math.random`).
    */
  @JSImport("pull-stream/sources/infinite", JSImport.Namespace)
  @js.native
  def apply[T](): Source[T] = js.native
  @JSImport("pull-stream/sources/infinite", JSImport.Namespace)
  @js.native
  def apply[T](generator: js.Function0[T]): Source[T] = js.native
}
