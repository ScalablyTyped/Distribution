package typings.semanticUiAccordion

import typings.semanticUiAccordion.SemanticUI.Accordion
import typings.semanticUiAccordion.SemanticUI.AccordionSettings
import typings.semanticUiAccordion.semanticUiAccordionStrings.`close others`
import typings.semanticUiAccordion.semanticUiAccordionStrings.close
import typings.semanticUiAccordion.semanticUiAccordionStrings.destroy
import typings.semanticUiAccordion.semanticUiAccordionStrings.open
import typings.semanticUiAccordion.semanticUiAccordionStrings.refresh
import typings.semanticUiAccordion.semanticUiAccordionStrings.setting
import typings.semanticUiAccordion.semanticUiAccordionStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def accordion(): JQuery
  def accordion(settings: AccordionSettings): JQuery
  @JSName("accordion")
  var accordion_Original: Accordion
  /**
    * Closes accordion content at index
    */
  @JSName("accordion")
  def accordion_close(behavior: close, index: Double): JQuery
  /**
    * Closes accordion content that are not active
    */
  @JSName("accordion")
  def accordion_closeothers(behavior: `close others`): JQuery
  @JSName("accordion")
  def accordion_destroy(behavior: destroy): JQuery
  /**
    * Opens accordion content at index
    */
  @JSName("accordion")
  def accordion_open(behavior: open, index: Double): JQuery
  /**
    * Refreshes all cached selectors and data
    */
  @JSName("accordion")
  def accordion_refresh(behavior: refresh): JQuery
  @JSName("accordion")
  def accordion_setting(behavior: setting, value: AccordionSettings): JQuery
  @JSName("accordion")
  def accordion_setting[K /* <: /* keyof semantic-ui-accordion.SemanticUI.AccordionSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("accordion")
  def accordion_setting[K /* <: /* keyof semantic-ui-accordion.SemanticUI.AccordionSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
  /**
    * Toggles accordion content at index
    */
  @JSName("accordion")
  def accordion_toggle(behavior: toggle, index: Double): JQuery
}
object JQuery {
  
  inline def apply(accordion: Accordion): JQuery = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setAccordion(value: Accordion): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
  }
}
