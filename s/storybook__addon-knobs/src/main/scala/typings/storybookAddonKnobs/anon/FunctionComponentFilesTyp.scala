package typings.storybookAddonKnobs.anon

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.filesMod.FilesTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentFilesTyp extends js.Object {
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
  def apply(props: PropsWithChildren[FilesTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): ReactElement | Null = js.native
  def deserialize(): js.UndefOr[scala.Nothing] = js.native
  def serialize(): js.UndefOr[scala.Nothing] = js.native
}

