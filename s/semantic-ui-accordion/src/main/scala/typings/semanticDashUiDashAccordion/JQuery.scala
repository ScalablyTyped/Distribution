package typings.semanticDashUiDashAccordion

import typings.semanticDashUiDashAccordion.SemanticUI.Accordion
import typings.semanticDashUiDashAccordion.SemanticUI.AccordionSettings
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.`close others`
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.close
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.destroy
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.open
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.refresh
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.setting
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("accordion")
  var accordion_Original: Accordion = js.native
  def accordion(): JQuery = js.native
  def accordion(settings: AccordionSettings): JQuery = js.native
  /**
    * Closes accordion content at index
    */
  @JSName("accordion")
  def accordion_close(behavior: close, index: Double): JQuery = js.native
  /**
    * Closes accordion content that are not active
    */
  @JSName("accordion")
  def accordion_closeothers(behavior: `close others`): JQuery = js.native
  @JSName("accordion")
  def accordion_destroy(behavior: destroy): JQuery = js.native
  /**
    * Opens accordion content at index
    */
  @JSName("accordion")
  def accordion_open(behavior: open, index: Double): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("accordion")
  def accordion_refresh(behavior: refresh): JQuery = js.native
  @JSName("accordion")
  def accordion_setting(behavior: setting, value: AccordionSettings): JQuery = js.native
  @JSName("accordion")
  def accordion_setting[K /* <: String */](behavior: setting, name: K): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any = js.native
  @JSName("accordion")
  def accordion_setting[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  @JSName("accordion")
  def accordion_toggle(behavior: toggle, index: Double): JQuery = js.native
}

