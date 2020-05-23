package typings.storybookAddonKnobs.optionsMod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.FnCall
import typings.storybookAddonKnobs.anon.PartialOptionsTypePropsan
import typings.storybookAddonKnobs.anon.WeakValidationMapOptionsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Options", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialOptionsTypePropsan] = js.native
  var deserialize: FnCall = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapOptionsT] = js.native
  var serialize: FnCall = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[OptionsTypeProps[_]], context: js.Any): ReactElement | Null = js.native
}

