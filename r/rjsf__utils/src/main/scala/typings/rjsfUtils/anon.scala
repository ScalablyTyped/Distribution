package typings.rjsfUtils

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.rjsfUtils.mod.EnumOptionsType
import typings.rjsfUtils.mod.FormContextType
import typings.rjsfUtils.mod.IconButtonProps
import typings.rjsfUtils.mod.StrictRJSFSchema
import typings.rjsfUtils.mod.SubmitButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddButton[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
    
    /** The template to use for the Add button used for AdditionalProperties and Array items */
    var AddButton: ComponentType[IconButtonProps[T, S, F]]
    
    /** The template to use for the Copy button used for Array items */
    var CopyButton: ComponentType[IconButtonProps[T, S, F]]
    
    /** The template to use for the Move Down button used for Array items */
    var MoveDownButton: ComponentType[IconButtonProps[T, S, F]]
    
    /** The template to use for the Move Up button used for Array items */
    var MoveUpButton: ComponentType[IconButtonProps[T, S, F]]
    
    /** The template to use for the Remove button used for AdditionalProperties and Array items */
    var RemoveButton: ComponentType[IconButtonProps[T, S, F]]
    
    /** The template to use for the main `Submit` button  */
    var SubmitButton: ComponentType[SubmitButtonProps[T, S, F]]
  }
  object AddButton {
    
    inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](
      AddButton: ComponentType[IconButtonProps[T, S, F]],
      CopyButton: ComponentType[IconButtonProps[T, S, F]],
      MoveDownButton: ComponentType[IconButtonProps[T, S, F]],
      MoveUpButton: ComponentType[IconButtonProps[T, S, F]],
      RemoveButton: ComponentType[IconButtonProps[T, S, F]],
      SubmitButton: ComponentType[SubmitButtonProps[T, S, F]]
    ): AddButton[T, S, F] = {
      val __obj = js.Dynamic.literal(AddButton = AddButton.asInstanceOf[js.Any], CopyButton = CopyButton.asInstanceOf[js.Any], MoveDownButton = MoveDownButton.asInstanceOf[js.Any], MoveUpButton = MoveUpButton.asInstanceOf[js.Any], RemoveButton = RemoveButton.asInstanceOf[js.Any], SubmitButton = SubmitButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddButton[T, S, F]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddButton[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (AddButton[T, S, F])) extends AnyVal {
      
      inline def setAddButton(value: ComponentType[IconButtonProps[T, S, F]]): Self = StObject.set(x, "AddButton", value.asInstanceOf[js.Any])
      
      inline def setCopyButton(value: ComponentType[IconButtonProps[T, S, F]]): Self = StObject.set(x, "CopyButton", value.asInstanceOf[js.Any])
      
      inline def setMoveDownButton(value: ComponentType[IconButtonProps[T, S, F]]): Self = StObject.set(x, "MoveDownButton", value.asInstanceOf[js.Any])
      
      inline def setMoveUpButton(value: ComponentType[IconButtonProps[T, S, F]]): Self = StObject.set(x, "MoveUpButton", value.asInstanceOf[js.Any])
      
      inline def setRemoveButton(value: ComponentType[IconButtonProps[T, S, F]]): Self = StObject.set(x, "RemoveButton", value.asInstanceOf[js.Any])
      
      inline def setSubmitButton(value: ComponentType[SubmitButtonProps[T, S, F]]): Self = StObject.set(x, "SubmitButton", value.asInstanceOf[js.Any])
    }
  }
  
  trait Blob extends StObject {
    
    var blob: typings.std.Blob
    
    var name: String
  }
  object Blob {
    
    inline def apply(blob: typings.std.Blob, name: String): Blob = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
      
      inline def setBlob(value: typings.std.Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumOptions[S /* <: StrictRJSFSchema */] extends StObject {
    
    /** The enum options list for a type that supports them */
    var enumOptions: js.UndefOr[js.Array[EnumOptionsType[S]]] = js.undefined
  }
  object EnumOptions {
    
    inline def apply[S /* <: StrictRJSFSchema */](): EnumOptions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnumOptions[S]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnumOptions[?], S /* <: StrictRJSFSchema */] (val x: Self & EnumOptions[S]) extends AnyVal {
      
      inline def setEnumOptions(value: js.Array[EnumOptionsType[S]]): Self = StObject.set(x, "enumOptions", value.asInstanceOf[js.Any])
      
      inline def setEnumOptionsUndefined: Self = StObject.set(x, "enumOptions", js.undefined)
      
      inline def setEnumOptionsVarargs(value: EnumOptionsType[S]*): Self = StObject.set(x, "enumOptions", js.Array(value*))
    }
  }
  
  trait Errors[Result] extends StObject {
    
    var errors: js.UndefOr[js.Array[Result]] = js.undefined
    
    var validationError: js.UndefOr[js.Error] = js.undefined
  }
  object Errors {
    
    inline def apply[Result](): Errors[Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Errors[Result]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Errors[?], Result] (val x: Self & Errors[Result]) extends AnyVal {
      
      inline def setErrors(value: js.Array[Result]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Result*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValidationError(value: js.Error): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    }
  }
  
  /* Inlined @rjsf/utils.@rjsf/utils.GenericObjectType & {  disabled :boolean | undefined,   className :string | undefined} */
  trait GenericObjectTypedisabled
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    /** The class name for the submit button */
    var className: js.UndefOr[String] = js.undefined
    
    /** A boolean value stating if the submit button is disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object GenericObjectTypedisabled {
    
    inline def apply(): GenericObjectTypedisabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericObjectTypedisabled]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericObjectTypedisabled] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var blob: Size
    
    var name: String
  }
  object Name {
    
    inline def apply(blob: Size, name: String): Name = {
      val __obj = js.Dynamic.literal(blob = blob.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setBlob(value: Size): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Double
    
    var `type`: String
  }
  object Size {
    
    inline def apply(size: Double, `type`: String): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
