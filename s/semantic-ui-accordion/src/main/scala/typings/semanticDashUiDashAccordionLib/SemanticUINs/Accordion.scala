package typings
package semanticDashUiDashAccordionLib.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion extends js.Object {
  var settings: AccordionSettings = js.native
  def apply(): semanticDashUiDashAccordionLib.JQuery = js.native
  /**
    * Closes accordion content that are not active
    */
  def apply(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.`close others`): semanticDashUiDashAccordionLib.JQuery = js.native
  /**
    * Closes accordion content at index
    */
  def apply(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.close,
    index: scala.Double
  ): semanticDashUiDashAccordionLib.JQuery = js.native
  def apply(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.destroy): semanticDashUiDashAccordionLib.JQuery = js.native
  /**
    * Opens accordion content at index
    */
  def apply(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.open,
    index: scala.Double
  ): semanticDashUiDashAccordionLib.JQuery = js.native
  /**
    * Refreshes all cached selectors and data
    */
  def apply(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.refresh): semanticDashUiDashAccordionLib.JQuery = js.native
  def apply(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting,
    value: AccordionSettings
  ): semanticDashUiDashAccordionLib.JQuery = js.native
  /**
    * Toggles accordion content at index
    */
  def apply(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.toggle,
    index: scala.Double
  ): semanticDashUiDashAccordionLib.JQuery = js.native
  def apply(settings: AccordionSettings): semanticDashUiDashAccordionLib.JQuery = js.native
  def apply[K /* <: java.lang.String */](behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting, name: K): /* import warning: ImportType.apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any = js.native
  def apply[K /* <: java.lang.String */](
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting,
    name: K,
    value: /* import warning: ImportType.apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
  ): semanticDashUiDashAccordionLib.JQuery = js.native
}

