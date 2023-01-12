package typings.reactBulmaComponents

import typings.react.mod.ChangeEvent
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.reactBulmaComponents.anon.Body
import typings.reactBulmaComponents.reactBulmaComponentsStrings.addons
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.focus
import typings.reactBulmaComponents.reactBulmaComponentsStrings.group
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hover
import typings.reactBulmaComponents.reactBulmaComponentsStrings.input
import typings.reactBulmaComponents.reactBulmaComponentsStrings.label
import typings.reactBulmaComponents.reactBulmaComponentsStrings.onChange
import typings.reactBulmaComponents.reactBulmaComponentsStrings.p
import typings.reactBulmaComponents.reactBulmaComponentsStrings.readonly
import typings.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.select
import typings.reactBulmaComponents.reactBulmaComponentsStrings.textarea
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.srcComponentsMod.Color
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsMod.OmitKeys
import typings.reactBulmaComponents.srcComponentsMod.Size
import typings.std.FileList
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsFormMod {
  
  object default {
    
    @JSImport("react-bulma-components/src/components/form", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Checkbox(props: OmitKeys[CheckboxProps & (ElementProps[CheckboxProps, input]), renderAs]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Checkbox")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("react-bulma-components/src/components/form", "default.Control")
    @js.native
    def Control: BulmaComponent[ControlProps, div] = js.native
    inline def Control_=(x: BulmaComponent[ControlProps, div]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components/src/components/form", "default.Field")
    @js.native
    def Field: (BulmaComponent[FieldProps, div]) & Body = js.native
    inline def Field_=(x: (BulmaComponent[FieldProps, div]) & Body): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Field")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components/src/components/form", "default.Help")
    @js.native
    def Help: BulmaComponent[HelpProps, p] = js.native
    inline def Help_=(x: BulmaComponent[HelpProps, p]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Help")(x.asInstanceOf[js.Any])
    
    inline def Input[TValue](
      props: OmitKeys[
          InputProps[TValue] & (ElementProps[InputProps[TValue], input]), 
          renderAs | readonly
        ]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Input")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("react-bulma-components/src/components/form", "default.InputFile")
    @js.native
    def InputFile: BulmaComponent[InputFileProps, div] = js.native
    inline def InputFile_=(x: BulmaComponent[InputFileProps, div]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputFile")(x.asInstanceOf[js.Any])
    
    @JSImport("react-bulma-components/src/components/form", "default.Label")
    @js.native
    def Label: BulmaComponentWithoutRenderAs[LabelProps, label] = js.native
    inline def Label_=(x: BulmaComponentWithoutRenderAs[LabelProps, label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    inline def Radio(props: OmitKeys[RadioProps & (ElementProps[RadioProps, input]), renderAs]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Radio")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Select[TValue](
      props: OmitKeys[
          SelectProps[TValue] & (ElementProps[SelectProps[TValue], select]), 
          renderAs | readonly
        ]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Select")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    inline def Textarea(props: OmitKeys[TextareaProps & (ElementProps[TextareaProps, textarea]), renderAs | readonly]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Textarea")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  }
  
  trait CheckboxProps extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ControlProps extends StObject {
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var iconType: js.UndefOr[ElementType[Any]] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
  }
  object ControlProps {
    
    inline def apply(): ControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlProps] (val x: Self) extends AnyVal {
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setIconType(value: ElementType[Any]): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
      
      inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    }
  }
  
  trait FieldLabelProps extends StObject {
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object FieldLabelProps {
    
    inline def apply(): FieldLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldLabelProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait FieldProps extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[addons | group] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
  }
  object FieldProps {
    
    inline def apply(): FieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setKind(value: addons | group): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    }
  }
  
  trait HelpProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
  }
  object HelpProps {
    
    inline def apply(): HelpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait InputFileProps extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var boxed: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[ReactElement] = js.undefined
    
    var inputProps: js.UndefOr[OmitKeys[onChange, HTMLAttributes[input]]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var value: js.UndefOr[FileList] = js.undefined
  }
  object InputFileProps {
    
    inline def apply(): InputFileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputFileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputFileProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBoxed(value: Boolean): Self = StObject.set(x, "boxed", value.asInstanceOf[js.Any])
      
      inline def setBoxedUndefined: Self = StObject.set(x, "boxed", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInputProps(value: OmitKeys[onChange, HTMLAttributes[input]]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: FileList): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait InputProps[T] extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var isStatic: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var status: js.UndefOr[focus | hover] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object InputProps {
    
    inline def apply[T](): InputProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputProps[?], T] (val x: Self & InputProps[T]) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setIsStaticUndefined: Self = StObject.set(x, "isStatic", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: focus | hover): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait LabelProps extends StObject {
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait RadioProps extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object RadioProps {
    
    inline def apply(): RadioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectProps[T] extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var status: js.UndefOr[focus | hover] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object SelectProps {
    
    inline def apply[T](): SelectProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectProps[?], T] (val x: Self & SelectProps[T]) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: focus | hover): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TextareaProps extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var fixedSize: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object TextareaProps {
    
    inline def apply(): TextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextareaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextareaProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFixedSize(value: Boolean): Self = StObject.set(x, "fixedSize", value.asInstanceOf[js.Any])
      
      inline def setFixedSizeUndefined: Self = StObject.set(x, "fixedSize", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
