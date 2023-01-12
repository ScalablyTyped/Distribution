package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.distComponentsTypesFilesMod.DateTypeKnobValue
import typings.storybookAddonKnobs.distComponentsTypesFilesMod.FileTypeKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> */
trait PartialFilesTypeProps extends StObject {
  
  var knob: js.UndefOr[FileTypeKnob] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ DateTypeKnobValue, DateTypeKnobValue]] = js.undefined
}
object PartialFilesTypeProps {
  
  inline def apply(): PartialFilesTypeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilesTypeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFilesTypeProps] (val x: Self) extends AnyVal {
    
    inline def setKnob(value: FileTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    
    inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
    
    inline def setOnChange(value: /* value */ DateTypeKnobValue => DateTypeKnobValue): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
  }
}
