package typings.rbx.navbarSegmentMod

import typings.rbx.rbxStrings.end
import typings.rbx.rbxStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-segment.NavbarSegmentVariablesOverrides, rbx.rbx/components/navbar/navbar-segment.NavbarSegmentVariablesDefaults> */
trait NavbarSegmentVariables extends js.Object {
  var alignments: start | end
}

object NavbarSegmentVariables {
  @scala.inline
  def apply(alignments: start | end): NavbarSegmentVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarSegmentVariables]
  }
}

