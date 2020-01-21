package typings.rotJs.mod

import typings.rotJs.lightingMod.Options
import typings.rotJs.lightingMod.ReflectivityCallback
import typings.rotJs.lightingMod.default
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Lighting")
@js.native
class Lighting protected () extends default {
  def this(reflectivityCallback: ReflectivityCallback) = this()
  def this(reflectivityCallback: ReflectivityCallback, options: Partial[Options]) = this()
}

