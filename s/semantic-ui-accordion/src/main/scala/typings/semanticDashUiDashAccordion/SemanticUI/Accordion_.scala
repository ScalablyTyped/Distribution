package typings.semanticDashUiDashAccordion.SemanticUI

import typings.semanticDashUiDashAccordion.JQuery
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

@JSName("Accordion")
@js.native
trait Accordion_ extends js.Object {
  var settings: AccordionSettings = js.native
  def apply(): JQuery = js.native
  /**
    * Closes accordion content that are not active
    */
  def apply(behavior: `close others`): JQuery = js.native
  /**
    * Closes accordion content at index
    */
  def apply(behavior: close, index: Double): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  /**
    * Opens accordion content at index
    */
  def apply(behavior: open, index: Double): JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: refresh): JQuery = js.native
  def apply(behavior: setting, value: AccordionSettings): JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  def apply(behavior: toggle, index: Double): JQuery = js.native
  def apply(settings: AccordionSettings): JQuery = js.native
  def apply[K /* <: String */](behavior: setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: String */](
    behavior: setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
  ): JQuery = js.native
}

