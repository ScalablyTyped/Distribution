package typings.storybookAddonKnobs

import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.storybookAddonKnobs.anon.PartialFilesTypeProps
import typings.storybookAddonKnobs.anon.WeakValidationMapFilesTyp
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filesMod {
  
  /* Inlined react.react.FunctionComponent<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Files.FilesTypeProps> & {  serialize :(): undefined,   deserialize :(): undefined} */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[FilesTypeProps]): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
    @js.native
    def apply(props: PropsWithChildren[FilesTypeProps], context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialFilesTypeProps] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialFilesTypeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.deserialize")
    @js.native
    def deserialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def deserialize_=(x: js.Function0[js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapFilesTyp] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapFilesTyp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Files", "default.serialize")
    @js.native
    def serialize: js.Function0[js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def serialize_=(x: js.Function0[js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
  
  type DateTypeKnobValue = js.Array[String]
  
  @js.native
  trait FileTypeKnob extends KnobControlConfig[DateTypeKnobValue] {
    
    var accept: String = js.native
  }
  object FileTypeKnob {
    
    @scala.inline
    def apply(accept: String, name: String, value: DateTypeKnobValue): FileTypeKnob = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeKnob]
    }
    
    @scala.inline
    implicit class FileTypeKnobMutableBuilder[Self <: FileTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilesTypeProps extends KnobControlProps[DateTypeKnobValue] {
    
    @JSName("knob")
    var knob_FilesTypeProps: FileTypeKnob = js.native
  }
  object FilesTypeProps {
    
    @scala.inline
    def apply(knob: FileTypeKnob, onChange: DateTypeKnobValue => DateTypeKnobValue): FilesTypeProps = {
      val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[FilesTypeProps]
    }
    
    @scala.inline
    implicit class FilesTypePropsMutableBuilder[Self <: FilesTypeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: FileTypeKnob): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
    }
  }
}
