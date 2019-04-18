package typings
package reactstrapLib.libInputGroupButtonDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupButtonDropdownProps
  extends reactstrapLib.libDropdownMod.DropdownProps {
  @JSName("addonType")
  var addonType_InputGroupButtonDropdownProps: reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append
}

object InputGroupButtonDropdownProps {
  @scala.inline
  def apply(
    addonType: reactstrapLib.reactstrapLibStrings.prepend | reactstrapLib.reactstrapLibStrings.append,
    DropdownProps: reactstrapLib.libDropdownMod.DropdownProps = null
  ): InputGroupButtonDropdownProps = {
    val __obj = js.Dynamic.literal(addonType = addonType.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, DropdownProps)
    __obj.asInstanceOf[InputGroupButtonDropdownProps]
  }
}

