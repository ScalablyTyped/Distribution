package typings
package semanticDashUiDashModalLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal extends js.Object {
  var settings: ModalSettings = js.native
  def apply(): semanticDashUiDashModalLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: java.lang.String
  ): semanticDashUiDashModalLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: java.lang.String,
    event: java.lang.String
  ): semanticDashUiDashModalLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: semanticDashUiDashModalLib.JQuery
  ): semanticDashUiDashModalLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`attach events`,
    selector: semanticDashUiDashModalLib.JQuery,
    event: java.lang.String
  ): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Caches current modal size
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`cache sizes`): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Returns whether the modal can fit on the page
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`can fit`): scala.Boolean = js.native
  /**
           * Hides all visible modals in the same dimmer
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide all`): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Hides associated page dimmer
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide dimmer`): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Hides all modals not selected modal in a dimmer
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`hide others`): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Returns whether the modal is active
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`is active`): scala.Boolean = js.native
  /**
           * Sets modal to active
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`set active`): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Shows associated page dimmer
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.`show dimmer`): semanticDashUiDashModalLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.destroy): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Hides the modal
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.hide): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Refreshes centering of modal on page
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.refresh): semanticDashUiDashModalLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting,
    value: ModalSettings
  ): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Shows the modal
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.show): semanticDashUiDashModalLib.JQuery = js.native
  /**
           * Toggles the modal
           */
  def apply(behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.toggle): semanticDashUiDashModalLib.JQuery = js.native
  def apply(settings: ModalSettings): semanticDashUiDashModalLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting, name: K): js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashModalLib.semanticDashUiDashModalLibStrings.setting,
    name: K,
    value: js.Any
  ): semanticDashUiDashModalLib.JQuery = js.native
}

