package typings.pullStream

import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsFilterNotMod {
  
  /**
    * Like `filter`, but remove items where the filter returns true.
    */
  inline def apply[InOut](test: js.Function1[/* data */ InOut, Boolean]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply(test.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @JSImport("pull-stream/throughs/filter-not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
