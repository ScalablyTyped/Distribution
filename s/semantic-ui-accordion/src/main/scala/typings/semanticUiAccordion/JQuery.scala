package typings.semanticUiAccordion

import typings.semanticUiAccordion.SemanticUI.Accordion
import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import typings.semanticUiAccordion.SemanticUI.AccordionSettings
import typings.semanticUiAccordion.semanticUiAccordionStrings.`close others`
import typings.semanticUiAccordion.semanticUiAccordionStrings.animateChildren
import typings.semanticUiAccordion.semanticUiAccordionStrings.className
import typings.semanticUiAccordion.semanticUiAccordionStrings.close
import typings.semanticUiAccordion.semanticUiAccordionStrings.closeNested
import typings.semanticUiAccordion.semanticUiAccordionStrings.collapsible
import typings.semanticUiAccordion.semanticUiAccordionStrings.debug
import typings.semanticUiAccordion.semanticUiAccordionStrings.destroy
import typings.semanticUiAccordion.semanticUiAccordionStrings.duration
import typings.semanticUiAccordion.semanticUiAccordionStrings.easing
import typings.semanticUiAccordion.semanticUiAccordionStrings.error
import typings.semanticUiAccordion.semanticUiAccordionStrings.exclusive
import typings.semanticUiAccordion.semanticUiAccordionStrings.name
import typings.semanticUiAccordion.semanticUiAccordionStrings.namespace
import typings.semanticUiAccordion.semanticUiAccordionStrings.observeChanges
import typings.semanticUiAccordion.semanticUiAccordionStrings.on
import typings.semanticUiAccordion.semanticUiAccordionStrings.onChange
import typings.semanticUiAccordion.semanticUiAccordionStrings.onClose
import typings.semanticUiAccordion.semanticUiAccordionStrings.onClosing
import typings.semanticUiAccordion.semanticUiAccordionStrings.onOpen
import typings.semanticUiAccordion.semanticUiAccordionStrings.onOpening
import typings.semanticUiAccordion.semanticUiAccordionStrings.open
import typings.semanticUiAccordion.semanticUiAccordionStrings.performance
import typings.semanticUiAccordion.semanticUiAccordionStrings.refresh
import typings.semanticUiAccordion.semanticUiAccordionStrings.selector
import typings.semanticUiAccordion.semanticUiAccordionStrings.setting
import typings.semanticUiAccordion.semanticUiAccordionStrings.silent
import typings.semanticUiAccordion.semanticUiAccordionStrings.toggle
import typings.semanticUiAccordion.semanticUiAccordionStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def accordion(): JQuery
  def accordion(behavior: setting, name: animateChildren, value: Boolean): JQuery
  def accordion(behavior: setting, name: animateChildren, value: Unit): Boolean
  def accordion(behavior: setting, name: className, value: Unit): ClassNameSettings
  def accordion(behavior: setting, name: className, value: ClassNameSettings): JQuery
  def accordion(behavior: setting, name: closeNested, value: Boolean): JQuery
  def accordion(behavior: setting, name: closeNested, value: Unit): Boolean
  def accordion(behavior: setting, name: collapsible, value: Boolean): JQuery
  def accordion(behavior: setting, name: collapsible, value: Unit): Boolean
  def accordion(behavior: setting, name: debug, value: Boolean): JQuery
  def accordion(behavior: setting, name: debug, value: Unit): Boolean
  def accordion(behavior: setting, name: duration, value: Double): JQuery
  def accordion(behavior: setting, name: duration, value: Unit): Double
  def accordion(behavior: setting, name: easing, value: String): JQuery
  def accordion(behavior: setting, name: easing, value: Unit): String
  def accordion(behavior: setting, name: error, value: Unit): ErrorSettings
  def accordion(behavior: setting, name: error, value: ErrorSettings): JQuery
  def accordion(behavior: setting, name: exclusive, value: Boolean): JQuery
  def accordion(behavior: setting, name: exclusive, value: Unit): Boolean
  def accordion(behavior: setting, name: namespace, value: String): JQuery
  def accordion(behavior: setting, name: namespace, value: Unit): String
  def accordion(behavior: setting, name: name, value: String): JQuery
  def accordion(behavior: setting, name: name, value: Unit): String
  def accordion(behavior: setting, name: observeChanges, value: Boolean): JQuery
  def accordion(behavior: setting, name: observeChanges, value: Unit): Boolean
  def accordion(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def accordion(behavior: setting, name: onChange, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def accordion(behavior: setting, name: onClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def accordion(behavior: setting, name: onClose, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def accordion(behavior: setting, name: onClosing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def accordion(behavior: setting, name: onClosing, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def accordion(behavior: setting, name: onOpening, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def accordion(behavior: setting, name: onOpening, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def accordion(behavior: setting, name: onOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery
  def accordion(behavior: setting, name: onOpen, value: Unit): js.ThisFunction0[/* this */ JQuery, Unit]
  def accordion(behavior: setting, name: on, value: String): JQuery
  def accordion(behavior: setting, name: on, value: Unit): String
  def accordion(behavior: setting, name: performance, value: Boolean): JQuery
  def accordion(behavior: setting, name: performance, value: Unit): Boolean
  def accordion(behavior: setting, name: selector, value: Unit): SelectorSettings
  def accordion(behavior: setting, name: selector, value: SelectorSettings): JQuery
  def accordion(behavior: setting, name: silent, value: Boolean): JQuery
  def accordion(behavior: setting, name: silent, value: Unit): Boolean
  def accordion(behavior: setting, name: verbose, value: Boolean): JQuery
  def accordion(behavior: setting, name: verbose, value: Unit): Boolean
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
  /**
    * Toggles accordion content at index
    */
  @JSName("accordion")
  def accordion_toggle(behavior: toggle, index: Double): JQuery
}
object JQuery {
  
  @scala.inline
  def apply(accordion: Accordion): JQuery = {
    val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccordion(value: Accordion): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
  }
}
