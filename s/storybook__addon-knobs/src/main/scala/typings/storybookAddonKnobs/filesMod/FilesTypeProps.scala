package typings.storybookAddonKnobs.filesMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesTypeProps extends KnobControlProps[DateTypeKnobValue] {
  @JSName("knob")
  var knob_FilesTypeProps: FileTypeKnob
}

object FilesTypeProps {
  @scala.inline
  def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): FilesTypeProps = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[FilesTypeProps]
  }
}

