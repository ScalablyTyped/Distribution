package typings.semanticUiReact.breadcrumbBreadcrumbMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.breadcrumbDividerMod.BreadcrumbDividerProps
import typings.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbComponent extends ComponentClass[BreadcrumbProps, ComponentState] {
  var Divider: StatelessComponent[BreadcrumbDividerProps] = js.native
  var Section: ComponentClass[BreadcrumbSectionProps, ComponentState] = js.native
}

