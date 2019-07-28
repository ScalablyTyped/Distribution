package typings.semanticDashUiDashAccordion.SemanticUINs

import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.animateChildren
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.className
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.closeNested
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.collapsible
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.debug
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.duration
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.easing
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.error
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.exclusive
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.name
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.namespace
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.observeChanges
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.on
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onChange
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onClose
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onClosing
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onOpen
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.onOpening
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.performance
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.selector
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.silent
import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.verbose
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AccordionSettingsNs {
  type Param = (Pick[
    _Impl, 
    exclusive | on | animateChildren | closeNested | collapsible | duration | easing | observeChanges | onOpening | onOpen | onClosing | onClose | onChange | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      exclusive | on | animateChildren | closeNested | collapsible | duration | easing | observeChanges | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}
