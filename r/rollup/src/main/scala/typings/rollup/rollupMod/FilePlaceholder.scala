package typings.rollup.rollupMod

import typings.rollup.rollupStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePlaceholder extends js.Object {
  var `type`: placeholder
}

object FilePlaceholder {
  @scala.inline
  def apply(`type`: placeholder): FilePlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FilePlaceholder]
  }
}

