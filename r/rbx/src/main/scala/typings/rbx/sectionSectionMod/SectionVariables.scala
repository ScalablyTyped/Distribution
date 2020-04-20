package typings.rbx.sectionSectionMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/layout/section/section.SectionVariablesOverrides, rbx.rbx/layout/section/section.SectionVariablesDefaults> */
trait SectionVariables extends js.Object {
  var sizes: medium | large
}

object SectionVariables {
  @scala.inline
  def apply(sizes: medium | large): SectionVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionVariables]
  }
}

