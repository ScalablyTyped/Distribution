package typings.rollup.anon

import typings.rollup.mod._SourceMapInput
import typings.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mappings extends _SourceMapInput {
  var mappings: _empty
}

object Mappings {
  @scala.inline
  def apply(mappings: _empty): Mappings = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
}

