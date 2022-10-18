package typings.pullStream

import typings.pullStream.mod.Source
import typings.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsFlattenMod {
  
  /**
    * Turn a stream of streams or a stream of arrays into a stream of their items, (undoes group).
    */
  inline def apply[Out](): Through_[js.Array[Out | Source[Out] | (Through_[Any, Out])], Out] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Through_[js.Array[Out | Source[Out] | (Through_[Any, Out])], Out]]
  
  @JSImport("pull-stream/throughs/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
