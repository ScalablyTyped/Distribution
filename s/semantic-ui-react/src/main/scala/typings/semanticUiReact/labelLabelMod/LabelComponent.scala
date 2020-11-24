package typings.semanticUiReact.labelLabelMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.labelDetailMod.LabelDetailProps
import typings.semanticUiReact.labelGroupMod.LabelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelComponent extends ComponentClass[LabelProps, ComponentState] {
  
  var Detail: StatelessComponent[LabelDetailProps] = js.native
  
  var Group: StatelessComponent[LabelGroupProps] = js.native
}
