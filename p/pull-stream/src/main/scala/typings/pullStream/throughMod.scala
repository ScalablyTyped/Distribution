package typings.pullStream

import typings.pullStream.mod.EndOrError
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughMod {
  
  /**
    * Returns a pass through stream that doesn't change the value.
    */
  @scala.inline
  def apply[InOut](): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def apply[InOut](op: js.Function1[/* data */ InOut, js.Any]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def apply[InOut](op: js.Function1[/* data */ InOut, js.Any], onEnd: js.Function1[/* err */ EndOrError, js.Any]): Through_[InOut, InOut] = (^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[Through_[InOut, InOut]]
  @scala.inline
  def apply[InOut](op: Unit, onEnd: js.Function1[/* err */ EndOrError, js.Any]): Through_[InOut, InOut] = (^.asInstanceOf[js.Dynamic].apply(op.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[Through_[InOut, InOut]]
  
  @JSImport("pull-stream/throughs/through", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
