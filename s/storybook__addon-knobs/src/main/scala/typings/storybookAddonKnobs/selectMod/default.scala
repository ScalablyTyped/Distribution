package typings.storybookAddonKnobs.selectMod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialSelectTypePropsSel
import typings.storybookAddonKnobs.anon.WeakValidationMapSelectTy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Select", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialSelectTypePropsSel] = js.native
  var deserialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapSelectTy] = js.native
  var serialize: js.Function1[/* value */ SelectTypeKnobValue, SelectTypeKnobValue] = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[SelectTypeProps[SelectTypeKnobValue]], context: js.Any): ReactElement | Null = js.native
}

