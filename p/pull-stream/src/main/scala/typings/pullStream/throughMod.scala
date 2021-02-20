package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughMod {
  
  /**
    * Returns a pass through stream that doesn't change the value.
    */
  @JSImport("pull-stream/throughs/through", JSImport.Namespace)
  @js.native
  def apply[InOut](): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/through", JSImport.Namespace)
  @js.native
  def apply[InOut](op: js.UndefOr[scala.Nothing], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/through", JSImport.Namespace)
  @js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/through", JSImport.Namespace)
  @js.native
  def apply[InOut](op: js.Function1[/* data */ InOut, _], onEnd: js.Function1[/* err */ EndOrError, _]): Through_[InOut, InOut] = js.native
}
