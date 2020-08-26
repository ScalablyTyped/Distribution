package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typings.storybookAddonKnobs.filesMod.FileTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
@js.native
trait PartialFilesTypeProps extends js.Object {
  var knob: js.UndefOr[FileTypeKnob] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]] = js.native
}

object PartialFilesTypeProps {
  @scala.inline
  def apply(): PartialFilesTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilesTypeProps]
  }
  @scala.inline
  implicit class PartialFilesTypePropsOps[Self <: PartialFilesTypeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKnob(value: FileTypeKnob): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ DateTypeKnobValue => DateTypeKnobValue): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

