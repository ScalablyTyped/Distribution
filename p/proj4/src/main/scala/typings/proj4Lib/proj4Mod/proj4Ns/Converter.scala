package typings
package proj4Lib.proj4Mod.proj4Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Converter extends js.Object {
  def forward[T /* <: TemplateCoordinates */](coordinates: T): T
  def inverse[T /* <: TemplateCoordinates */](coordinates: T): T
}

