package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSelectorComponent extends ISelectorComponent
object BaseSelectorComponent {
  
  @scala.inline
  def apply(
    get_callback: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit],
    get_componentType: () => SelectorType,
    get_scopeKey: () => String,
    get_selectedEntities: () => js.Any,
    removeEntity: ResolveEntity => Unit,
    revertTo: ResolveEntity => Unit,
    setEntity: ResolveEntity => Unit,
    set_callback: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
    set_selectedEntities: js.Any => Unit
  ): BaseSelectorComponent = {
    val __obj = js.Dynamic.literal(get_callback = js.Any.fromFunction0(get_callback), get_componentType = js.Any.fromFunction0(get_componentType), get_scopeKey = js.Any.fromFunction0(get_scopeKey), get_selectedEntities = js.Any.fromFunction0(get_selectedEntities), removeEntity = js.Any.fromFunction1(removeEntity), revertTo = js.Any.fromFunction1(revertTo), setEntity = js.Any.fromFunction1(setEntity), set_callback = js.Any.fromFunction1(set_callback), set_selectedEntities = js.Any.fromFunction1(set_selectedEntities))
    __obj.asInstanceOf[BaseSelectorComponent]
  }
}
