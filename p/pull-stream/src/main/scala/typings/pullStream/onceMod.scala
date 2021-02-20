package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onceMod {
  
  /**
    * Create a stream with a single value.
    */
  @JSImport("pull-stream/sources/once", JSImport.Namespace)
  @js.native
  def apply[T](): Source[T] = js.native
  @JSImport("pull-stream/sources/once", JSImport.Namespace)
  @js.native
  def apply[T](value: T): Source[T] = js.native
  @JSImport("pull-stream/sources/once", JSImport.Namespace)
  @js.native
  def apply[T](value: T, onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
  @JSImport("pull-stream/sources/once", JSImport.Namespace)
  @js.native
  def apply[T](value: js.UndefOr[scala.Nothing], onAbort: js.Function1[/* err */ js.UndefOr[EndOrError], _]): Source[T] = js.native
}
