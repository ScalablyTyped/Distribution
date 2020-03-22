package typings.rotJs.pathPathMod

import typings.rotJs.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/path/path", JSImport.Default)
@js.native
abstract class default protected () extends Path {
  def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
  def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
}

