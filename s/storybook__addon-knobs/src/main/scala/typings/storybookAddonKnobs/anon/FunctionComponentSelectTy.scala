package typings.storybookAddonKnobs.anon

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue
import typings.storybookAddonKnobs.selectMod.SelectTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeProps<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue>> & {serialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue, deserialize (value : @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue): @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Select.SelectTypeKnobValue} */
@js.native
trait FunctionComponentSelectTy extends js.Object {
  
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
  
  def deserialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
  
  def serialize(value: SelectTypeKnobValue): SelectTypeKnobValue = js.native
}
