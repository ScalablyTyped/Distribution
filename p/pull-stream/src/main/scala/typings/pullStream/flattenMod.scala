package typings.pullStream

import typings.pullStream.mod.Source
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenMod {
  
  /**
    * Turn a stream of streams or a stream of arrays into a stream of their items, (undoes group).
    */
  @JSImport("pull-stream/throughs/flatten", JSImport.Namespace)
  @js.native
  def apply[Out](): Through_[js.Array[Out | Source[Out] | (Through_[_, Out])], Out] = js.native
}
