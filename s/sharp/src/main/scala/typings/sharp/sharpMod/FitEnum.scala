package typings.sharp.sharpMod

import typings.sharp.sharpStrings.contain
import typings.sharp.sharpStrings.cover
import typings.sharp.sharpStrings.fill
import typings.sharp.sharpStrings.inside
import typings.sharp.sharpStrings.outside
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FitEnum extends js.Object {
  var contain: typings.sharp.sharpStrings.contain
  var cover: typings.sharp.sharpStrings.cover
  var fill: typings.sharp.sharpStrings.fill
  var inside: typings.sharp.sharpStrings.inside
  var outside: typings.sharp.sharpStrings.outside
}

object FitEnum {
  @scala.inline
  def apply(contain: contain, cover: cover, fill: fill, inside: inside, outside: outside): FitEnum = {
    val __obj = js.Dynamic.literal(contain = contain, cover = cover, fill = fill, inside = inside, outside = outside)
  
    __obj.asInstanceOf[FitEnum]
  }
}

