package typings.storybookAddonKnobs.anon

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.filesMod.FilesTypeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> & {serialize (): undefined, deserialize (): undefined} */
@js.native
trait FunctionComponentFilesTyp extends StObject {
  
  def apply(props: PropsWithChildren[FilesTypeProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  
  var defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
  
  def deserialize(): Unit = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
  
  def serialize(): Unit = js.native
}
