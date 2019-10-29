package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.libLightingMod.Options
import typings.rotDashJs.libLightingMod.ReflectivityCallback
import typings.rotDashJs.libLightingMod.default
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

