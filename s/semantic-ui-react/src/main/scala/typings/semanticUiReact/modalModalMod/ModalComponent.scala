package typings.semanticUiReact.modalModalMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.modalActionsMod.ModalActionsProps
import typings.semanticUiReact.modalContentMod.ModalContentProps
import typings.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import typings.semanticUiReact.modalDimmerMod.ModalDimmerProps
import typings.semanticUiReact.modalHeaderMod.ModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalComponent extends ComponentClass[ModalProps, ComponentState] {
  
  var Actions: ComponentClass[ModalActionsProps, ComponentState] = js.native
  
  var Content: StatelessComponent[ModalContentProps] = js.native
  
  var Description: StatelessComponent[ModalDescriptionProps] = js.native
  
  var Dimmer: StatelessComponent[ModalDimmerProps] = js.native
  
  var Header: StatelessComponent[ModalHeaderProps] = js.native
}
