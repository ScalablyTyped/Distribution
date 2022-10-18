package typings.storybookAddonKnobs

import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialFilesTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapFilesTyp
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.distComponentsTypesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTypesFilesMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> & {  serialize :(): undefined,   deserialize :(): undefined} */
  object default {
    
    inline def apply(props: FilesTypeProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: FilesTypeProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialFilesTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.deserialize")
    @js.native
    def deserialize: js.Function0[Unit] = js.native
    inline def deserialize_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapFilesTyp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.serialize")
    @js.native
    def serialize: js.Function0[Unit] = js.native
    inline def serialize_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type DateTypeKnobValue = js.Array[String]
  
  trait FileTypeKnob
    extends StObject
       with KnobControlConfig[DateTypeKnobValue] {
    
    var accept: String
  }
  object FileTypeKnob {
    
    inline def apply(accept: String, name: String, value: DateTypeKnobValue): FileTypeKnob = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeKnob]
    }
    
    extension [Self <: FileTypeKnob](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilesTypeProps
    extends StObject
       with KnobControlProps[DateTypeKnobValue] {
    
    @JSName("knob")
    var knob_FilesTypeProps: FileTypeKnob
  }
  object FilesTypeProps {
    
    inline def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): FilesTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[FilesTypeProps]
    }
    
    extension [Self <: FilesTypeProps](x: Self) {
      
      inline def setKnob(value: FileTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
