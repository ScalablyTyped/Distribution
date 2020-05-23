package typings.storybookAddonKnobs.filesMod

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialFilesTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapFilesTyp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
  var deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
  var serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
  def apply(props: PropsWithChildren[FilesTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): ReactElement | Null = js.native
}

