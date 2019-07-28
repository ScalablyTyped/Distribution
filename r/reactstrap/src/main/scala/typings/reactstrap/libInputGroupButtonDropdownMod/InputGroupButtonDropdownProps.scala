package typings.reactstrap.libInputGroupButtonDropdownMod

import typings.reactstrap.libDropdownMod.DropdownProps
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupButtonDropdownProps extends DropdownProps {
  @JSName("addonType")
  var addonType_InputGroupButtonDropdownProps: prepend | append
}

object InputGroupButtonDropdownProps {
  @scala.inline
  def apply(addonType: prepend | append, DropdownProps: DropdownProps = null): InputGroupButtonDropdownProps = {
    val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DropdownProps)
    __obj.asInstanceOf[InputGroupButtonDropdownProps]
  }
}

