package typings.semanticUiReact.selectSelectMod

import org.scalablytyped.runtime.StringDictionary
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps
  extends StrictSelectProps
     with /* key */ StringDictionary[js.Any]
object SelectProps {
  
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): SelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}
