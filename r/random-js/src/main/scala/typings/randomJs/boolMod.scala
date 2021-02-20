package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boolMod {
  
  @JSImport("random-js/dist/distribution/bool", "bool")
  @js.native
  def bool(): Distribution[Boolean] = js.native
  @JSImport("random-js/dist/distribution/bool", "bool")
  @js.native
  def bool(numerator: Double, denominator: Double): Distribution[Boolean] = js.native
  @JSImport("random-js/dist/distribution/bool", "bool")
  @js.native
  def bool(percentage: Double): Distribution[Boolean] = js.native
}
