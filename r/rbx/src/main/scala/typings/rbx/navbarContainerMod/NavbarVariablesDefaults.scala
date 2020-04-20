package typings.rbx.navbarContainerMod

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarVariablesDefaults extends js.Object {
  var fixedAlignments: top | bottom
}

object NavbarVariablesDefaults {
  @scala.inline
  def apply(fixedAlignments: top | bottom): NavbarVariablesDefaults = {
    val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarVariablesDefaults]
  }
}

