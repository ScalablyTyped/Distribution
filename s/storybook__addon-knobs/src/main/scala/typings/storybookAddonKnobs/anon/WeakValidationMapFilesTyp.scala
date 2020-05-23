package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import typings.storybookAddonKnobs.filesMod.DateTypeKnobValue
import typings.storybookAddonKnobs.filesMod.FileTypeKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
trait WeakValidationMapFilesTyp extends js.Object {
  var knob: js.UndefOr[Validator[js.UndefOr[FileTypeKnob | Null]]] = js.undefined
  var onChange: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
    ]
  ] = js.undefined
}

object WeakValidationMapFilesTyp {
  @scala.inline
  def apply(
    knob: Validator[js.UndefOr[FileTypeKnob | Null]] = null,
    onChange: Validator[
      js.UndefOr[(js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]) | Null]
    ] = null
  ): WeakValidationMapFilesTyp = {
    val __obj = js.Dynamic.literal()
    if (knob != null) __obj.updateDynamic("knob")(knob.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapFilesTyp]
  }
}

