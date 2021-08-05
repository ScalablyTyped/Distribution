package typings.pullStream

import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteMod {
  
  /**
    * Create an unending stream by repeatedly calling a generator function (by default, `Math.random`).
    */
  inline def apply[T](): Source[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[T]]
  inline def apply[T](generator: js.Function0[T]): Source[T] = ^.asInstanceOf[js.Dynamic].apply(generator.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  @JSImport("pull-stream/sources/infinite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
