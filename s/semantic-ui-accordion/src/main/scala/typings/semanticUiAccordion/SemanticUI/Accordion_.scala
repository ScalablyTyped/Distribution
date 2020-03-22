package typings.semanticUiAccordion.SemanticUI

import typings.semanticUiAccordion.JQuery
import typings.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typings.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(behavior: setting, name: animateChildren): Boolean = js.native
  def apply(behavior: setting, name: animateChildren, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: closeNested): Boolean = js.native
  def apply(behavior: setting, name: closeNested, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: collapsible): Boolean = js.native
  def apply(behavior: setting, name: collapsible, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: duration): Double = js.native
  def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
  def apply(behavior: setting, name: easing): String = js.native
  def apply(behavior: setting, name: easing, value: String): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: exclusive): Boolean = js.native
  def apply(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: observeChanges): Boolean = js.native
  def apply(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: on): String = js.native
  def apply(behavior: setting, name: onChange): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onChange, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onClose): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onClosing): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onClosing, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOpen): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOpening): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
  def apply(behavior: setting, name: onOpening, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: onOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
  def apply(behavior: setting, name: on, value: String): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: AccordionSettings): JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  def apply(behavior: toggle, index: Double): JQuery = js.native
  def apply(settings: AccordionSettings): JQuery = js.native
}

