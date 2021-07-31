package typings.pullStream

import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @scala.inline
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @JSImport("pull-stream/throughs/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
