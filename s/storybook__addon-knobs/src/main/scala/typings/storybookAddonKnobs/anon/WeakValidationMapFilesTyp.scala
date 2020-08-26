package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typings.storybookAddonKnobs.filesMod.FileTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
@js.native
trait WeakValidationMapFilesTyp extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[FileTypeKnob | Null]]] = js.native
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
    ]
  ] = js.native
}

object WeakValidationMapFilesTyp {
  @scala.inline
  def apply(): WeakValidationMapFilesTyp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapFilesTyp]
  }
  @scala.inline
  implicit class WeakValidationMapFilesTypOps[Self <: WeakValidationMapFilesTyp] (val x: Self) extends AnyVal {
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
    def setKnob(value: Validator[js.UndefOr[FileTypeKnob | Null]]): Self = this.set("knob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnob: Self = this.set("knob", js.undefined)
    @scala.inline
    def setOnChange(
      value: Validator[
          js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
        ]
    ): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

