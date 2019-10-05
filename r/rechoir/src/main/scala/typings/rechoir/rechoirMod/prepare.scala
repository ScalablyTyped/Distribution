package typings.rechoir.rechoirMod

import typings.interpret.interpretMod.Extensions
import typings.rechoir.rechoirNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rechoir", "prepare")
@js.native
object prepare extends js.Object {
  def apply(config: Extensions, filepath: String): `true` | js.Array[Attempt] = js.native
  def apply(config: Extensions, filepath: String, requireFrom: String): `true` | js.Array[Attempt] = js.native
}

