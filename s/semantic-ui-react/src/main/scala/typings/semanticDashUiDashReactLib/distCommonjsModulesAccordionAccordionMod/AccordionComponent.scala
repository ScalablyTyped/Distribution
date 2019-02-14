package typings
package semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionComponent
  extends reactLib.reactMod.ReactNs.ComponentClass[AccordionProps, reactLib.reactMod.ReactNs.ComponentState] {
  var Accordion: reactLib.reactMod.ReactNs.ComponentClass[
    semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionAccordionMod.AccordionAccordionProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  @JSName("Content")
  var Content_Original: reactLib.reactMod.ReactNs.StatelessComponent[
    semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps
  ] = js.native
  var Title: reactLib.reactMod.ReactNs.ComponentClass[
    semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionTitleMod.AccordionTitleProps, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def Content(
    props: semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps with reactLib.Anon_Children
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
  def Content(
    props: semanticDashUiDashReactLib.distCommonjsModulesAccordionAccordionContentMod.AccordionContentProps with reactLib.Anon_Children,
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement | scala.Null = js.native
}

