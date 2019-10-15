package typings.ranjs.ranjsMod

import typings.ranjs.Anon_Chi2
import typings.ranjs.Anon_Passed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "test")
@js.native
object test extends js.Object {
  def bartlett(dataSets: js.Array[js.Array[Double]], alpha: Double): Anon_Chi2 = js.native
  def mannWhitney(dataSets: js.Array[js.Array[Double]], alpha: Double): Anon_Passed = js.native
}

