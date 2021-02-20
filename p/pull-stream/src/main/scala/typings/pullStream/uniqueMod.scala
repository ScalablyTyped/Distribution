package typings.pullStream

import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueMod {
  
  /**
    * Filter items that have a repeated value for `prop()`, by default, `prop = function (it) {return it }`, if `prop` is a string, it will filter nodes which have repeated values for that property.
    */
  @JSImport("pull-stream/throughs/unique", JSImport.Namespace)
  @js.native
  def apply[InOut](): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/unique", JSImport.Namespace)
  @js.native
  def apply[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = js.native
  @JSImport("pull-stream/throughs/unique", JSImport.Namespace)
  @js.native
  def apply[InOut](prop: js.Function1[/* data */ InOut, _]): Through_[InOut, InOut] = js.native
}
