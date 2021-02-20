package typings.pullStream

import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterNotMod {
  
  /**
    * Like `filter`, but remove items where the filter returns true.
    */
  @JSImport("pull-stream/throughs/filter-not", JSImport.Namespace)
  @js.native
  def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = js.native
}
