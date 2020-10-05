package typings.semanticUiReact.formSelectMod

import org.scalablytyped.runtime.StringDictionary
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSelectProps
  extends StrictFormSelectProps
     with /* key */ StringDictionary[js.Any]

object FormSelectProps {
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): FormSelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelectProps]
  }
}

