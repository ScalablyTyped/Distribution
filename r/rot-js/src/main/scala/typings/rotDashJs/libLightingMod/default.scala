package typings.rotDashJs.libLightingMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/lighting", JSImport.Default)
@js.native
class default protected () extends Lighting {
  def this(reflectivityCallback: ReflectivityCallback) = this()
  def this(reflectivityCallback: ReflectivityCallback, options: Partial[Options]) = this()
}

