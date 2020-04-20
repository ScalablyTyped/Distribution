package typings.rollup

import typings.rollup.mod._SourceMapInput
import typings.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMappings extends _SourceMapInput {
  var mappings: _empty
}

object AnonMappings {
  @scala.inline
  def apply(mappings: _empty): AnonMappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMappings]
  }
}

