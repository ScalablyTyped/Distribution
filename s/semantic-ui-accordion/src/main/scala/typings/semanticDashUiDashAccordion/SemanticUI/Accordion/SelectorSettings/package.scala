package typings.semanticDashUiDashAccordion.SemanticUI.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SelectorSettings {
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.accordion
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.content
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.title
  import typings.semanticDashUiDashAccordion.semanticDashUiDashAccordionStrings.trigger
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[_Impl, accordion | title | trigger | content]) with (Partial[Pick[_Impl, accordion | title | trigger | content]])
}
