package typings.restling.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bluebird.mod.^
import typings.restling.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "allAsync")
@js.native
object allAsync extends js.Object {
  def apply(requests: js.Array[AnonOptions]): ^[js.Array[RestlingResult]] = js.native
  def apply(requests: StringDictionary[AnonOptions]): ^[StringDictionary[RestlingResult]] = js.native
}

