package typings.semanticUiReact.popupPopupMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.popupContentMod.PopupContentProps
import typings.semanticUiReact.popupHeaderMod.PopupHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupComponent extends ComponentClass[PopupProps, ComponentState] {
  
  var Content: StatelessComponent[PopupContentProps] = js.native
  
  var Header: StatelessComponent[PopupHeaderProps] = js.native
}
