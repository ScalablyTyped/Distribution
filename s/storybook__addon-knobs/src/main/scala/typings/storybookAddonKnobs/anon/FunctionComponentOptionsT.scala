package typings.storybookAddonKnobs.anon

import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.optionsMod.OptionsTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Options.OptionsTypeProps<any>> & {serialize <T>(value : T): T, deserialize <T_1>(value : T_1): T_1} */
@js.native
trait FunctionComponentOptionsT extends StObject {
  
  def apply(props: OptionsTypeProps[Any]): ReactElement | Null = js.native
  def apply(props: OptionsTypeProps[Any], context: Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
  
  def deserialize[T_1](value: T_1): T_1 = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
  
  def serialize[T](value: T): T = js.native
}
