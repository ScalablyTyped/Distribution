package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diceMod {
  
  @JSImport("random-js/dist/distribution/dice", "dice")
  @js.native
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = js.native
}
