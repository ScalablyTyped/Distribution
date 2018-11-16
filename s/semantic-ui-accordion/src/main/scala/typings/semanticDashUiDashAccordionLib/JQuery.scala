package typings
package semanticDashUiDashAccordionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("accordion")
  var accordion_Original: semanticDashUiDashAccordionLib.SemanticUINs.Accordion = js.native
  def accordion(): JQuery = js.native
  def accordion(settings: semanticDashUiDashAccordionLib.SemanticUINs.AccordionSettings): JQuery = js.native
  /**
           * Closes accordion content at index
           */
  @JSName("accordion")
  def accordion_close(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.close,
    index: scala.Double
  ): JQuery = js.native
  /**
           * Closes accordion content that are not active
           */
  @JSName("accordion")
  def `accordion_close others`(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.`close others`): JQuery = js.native
  @JSName("accordion")
  def accordion_destroy(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.destroy): JQuery = js.native
  /**
           * Opens accordion content at index
           */
  @JSName("accordion")
  def accordion_open(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.open,
    index: scala.Double
  ): JQuery = js.native
  /**
           * Refreshes all cached selectors and data
           */
  @JSName("accordion")
  def accordion_refresh(behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.refresh): JQuery = js.native
  @JSName("accordion")
  def accordion_setting(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting,
    value: semanticDashUiDashAccordionLib.SemanticUINs.AccordionSettings
  ): JQuery = js.native
  @JSName("accordion")
  def accordion_setting[K /* <: java.lang.String */](behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting, name: K): js.Any = js.native
  @JSName("accordion")
  def accordion_setting[K /* <: java.lang.String */](
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.setting,
    name: K,
    value: js.Any
  ): JQuery = js.native
  /**
           * Toggles accordion content at index
           */
  @JSName("accordion")
  def accordion_toggle(
    behavior: semanticDashUiDashAccordionLib.semanticDashUiDashAccordionLibStrings.toggle,
    index: scala.Double
  ): JQuery = js.native
}

