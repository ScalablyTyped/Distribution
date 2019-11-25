package typings.prettier.prettierMod.doc.builders

import org.scalablytyped.runtime.TopLevel
import typings.prettier.prettierStrings.`line-suffix-boundary`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSuffixBoundary extends _Doc {
  var `type`: `line-suffix-boundary`
}

object LineSuffixBoundary {
  @scala.inline
  def apply(`type`: `line-suffix-boundary`): LineSuffixBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSuffixBoundary]
  }
}

@JSImport("prettier", "doc.builders.lineSuffixBoundary")
@js.native
object lineSuffixBoundary extends TopLevel[LineSuffixBoundary]

