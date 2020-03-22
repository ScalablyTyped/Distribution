package typings.storybookAddonKnobs

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.booleanMod.BooleanTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Boolean.BooleanTypeProps> & {serialize (value : boolean): string | null, deserialize (value : string | null): boolean} */
@js.native
trait FunctionComponentBooleanT extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialBooleanTypeProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapBooleanT] = js.native
  def apply(props: PropsWithChildren[BooleanTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[BooleanTypeProps], context: js.Any): ReactElement | Null = js.native
  def deserialize(): Boolean = js.native
  def deserialize(value: String): Boolean = js.native
  def serialize(value: Boolean): String | Null = js.native
}

