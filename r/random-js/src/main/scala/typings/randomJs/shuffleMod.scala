package typings.randomJs

import typings.randomJs.typesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shuffleMod {
  
  @JSImport("random-js/dist/distribution/shuffle", "shuffle")
  @js.native
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  @JSImport("random-js/dist/distribution/shuffle", "shuffle")
  @js.native
  def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = js.native
}
