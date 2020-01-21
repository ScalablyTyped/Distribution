package typings.rollup

import typings.rollup.mod._SourceMapInput
import typings.rollup.rollupStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends _SourceMapInput {
  var mappings: _empty
}

object Anon {
  @scala.inline
  def apply(mappings: _empty): Anon = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon]
  }
}

