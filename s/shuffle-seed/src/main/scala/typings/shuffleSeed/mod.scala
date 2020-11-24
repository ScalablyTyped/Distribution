package typings.shuffleSeed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("shuffle-seed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def shuffle[T](arr: js.Array[T], seed: js.Any): js.Array[T] = js.native
  
  def unshuffle[T](arr: js.Array[T], seed: js.Any): js.Array[T] = js.native
}
