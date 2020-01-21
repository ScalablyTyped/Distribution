package typings.semanticUiModal.SemanticUI

import typings.semanticUiModal.JQuery
import typings.semanticUiModal.semanticUiModalStrings.`attach events`
import typings.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typings.semanticUiModal.semanticUiModalStrings.`can fit`
import typings.semanticUiModal.semanticUiModalStrings.`hide all`
import typings.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typings.semanticUiModal.semanticUiModalStrings.`hide others`
import typings.semanticUiModal.semanticUiModalStrings.`is active`
import typings.semanticUiModal.semanticUiModalStrings.`set active`
import typings.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typings.semanticUiModal.semanticUiModalStrings.destroy
import typings.semanticUiModal.semanticUiModalStrings.hide
import typings.semanticUiModal.semanticUiModalStrings.refresh
import typings.semanticUiModal.semanticUiModalStrings.setting
import typings.semanticUiModal.semanticUiModalStrings.show
import typings.semanticUiModal.semanticUiModalStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal_ extends js.Object {
  var settings: ModalSettings = js.native
  def apply(): JQuery = js.native
  def apply(behavior: `attach events`, selector: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
  def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
  /**
    * Caches current modal size
    */
  def apply(behavior: `cache sizes`): JQuery = js.native
  /**
    * Returns whether the modal can fit on the page
    */
  def apply(behavior: `can fit`): Boolean = js.native
  /**
    * Hides all visible modals in the same dimmer
    */
  def apply(behavior: `hide all`): JQuery = js.native
  /**
    * Hides associated page dimmer
    */
  def apply(behavior: `hide dimmer`): JQuery = js.native
  /**
    * Hides all modals not selected modal in a dimmer
    */
  def apply(behavior: `hide others`): JQuery = js.native
  /**
    * Returns whether the modal is active
    */
  def apply(behavior: `is active`): Boolean = js.native
  /**
    * Sets modal to active
    */
  def apply(behavior: `set active`): JQuery = js.native
  /**
    * Shows associated page dimmer
    */
  def apply(behavior: `show dimmer`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Hides the modal
    */
  def apply(behavior: hide): JQuery = js.native
  /**
    * Refreshes centering of modal on page
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, value: ModalSettings): JQuery = js.native
  /**
    * Shows the modal
    */
  def apply(behavior: show): JQuery = js.native
  /**
    * Toggles the modal
    */
  def apply(behavior: toggle): JQuery = js.native
  def apply(settings: ModalSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

