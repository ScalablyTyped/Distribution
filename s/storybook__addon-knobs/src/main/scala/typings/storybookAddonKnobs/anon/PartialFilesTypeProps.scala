package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typings.storybookAddonKnobs.filesMod.FileTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
trait PartialFilesTypeProps extends js.Object {
  var knob: js.UndefOr[FileTypeKnob] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]] = js.undefined
}

object PartialFilesTypeProps {
  @scala.inline
  def apply(knob: FileTypeKnob = null, onChange: /* value */ DateTypeKnobValue => DateTypeKnobValue = null): PartialFilesTypeProps = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[PartialFilesTypeProps]
  }
}

