package typings.reactIntl.componentsPluralMod

import typings.react.mod.ComponentType
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.reactIntl.componentsInjectIntlMod.WithIntlProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-intl/src/components/plural", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(props: PropsWithChildren[WithIntlProps[Props]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[WithIntlProps[Props]], context: js.Any): ReactElement | Null = js.native
  
  var WrappedComponent: ComponentType[Props] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[Partial[WithIntlProps[Props]]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[Props]]] = js.native
}
