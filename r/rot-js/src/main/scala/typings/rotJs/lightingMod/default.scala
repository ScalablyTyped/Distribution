package typings.rotJs.lightingMod

import typings.rotJs.PartialOptionsEmissionThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/lighting", JSImport.Default)
@js.native
class default protected () extends Lighting {
  def this(reflectivityCallback: ReflectivityCallback) = this()
  def this(reflectivityCallback: ReflectivityCallback, options: PartialOptionsEmissionThreshold) = this()
}

