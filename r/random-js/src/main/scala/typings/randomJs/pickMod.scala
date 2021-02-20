package typings.randomJs

import typings.randomJs.typesMod.Engine
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickMod {
  
  @JSImport("random-js/dist/distribution/pick", "pick")
  @js.native
  def pick[T](engine: Engine, source: ArrayLike[T]): T = js.native
  @JSImport("random-js/dist/distribution/pick", "pick")
  @js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: js.UndefOr[scala.Nothing], end: Double): T = js.native
  @JSImport("random-js/dist/distribution/pick", "pick")
  @js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double): T = js.native
  @JSImport("random-js/dist/distribution/pick", "pick")
  @js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double, end: Double): T = js.native
}
