package typings.rjsfUtils

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.rjsfUtils.mod.EnumOptionsType
import typings.rjsfUtils.mod.IconButtonProps
import typings.rjsfUtils.mod.SubmitButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddButton[T, F] extends StObject {
    
    /** The template to use for the Add button used for AdditionalProperties and Array items */
    var AddButton: ComponentType[IconButtonProps]
    
    /** The template to use for the Move Down button used for Array items */
    var MoveDownButton: ComponentType[IconButtonProps]
    
    /** The template to use for the Move Up button used for Array items */
    var MoveUpButton: ComponentType[IconButtonProps]
    
    /** The template to use for the Remove button used for AdditionalProperties and Array items */
    var RemoveButton: ComponentType[IconButtonProps]
    
    /** The template to use for the main `Submit` button  */
    var SubmitButton: ComponentType[SubmitButtonProps[T, F]]
  }
  object AddButton {
    
    inline def apply[T, F](
      AddButton: ComponentType[IconButtonProps],
      MoveDownButton: ComponentType[IconButtonProps],
      MoveUpButton: ComponentType[IconButtonProps],
      RemoveButton: ComponentType[IconButtonProps],
      SubmitButton: ComponentType[SubmitButtonProps[T, F]]
    ): AddButton[T, F] = {
      val __obj = js.Dynamic.literal(AddButton = AddButton.asInstanceOf[js.Any], MoveDownButton = MoveDownButton.asInstanceOf[js.Any], MoveUpButton = MoveUpButton.asInstanceOf[js.Any], RemoveButton = RemoveButton.asInstanceOf[js.Any], SubmitButton = SubmitButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddButton[T, F]]
    }
    
    extension [Self <: AddButton[?, ?], T, F](x: Self & (AddButton[T, F])) {
      
      inline def setAddButton(value: ComponentType[IconButtonProps]): Self = StObject.set(x, "AddButton", value.asInstanceOf[js.Any])
      
      inline def setMoveDownButton(value: ComponentType[IconButtonProps]): Self = StObject.set(x, "MoveDownButton", value.asInstanceOf[js.Any])
      
      inline def setMoveUpButton(value: ComponentType[IconButtonProps]): Self = StObject.set(x, "MoveUpButton", value.asInstanceOf[js.Any])
      
      inline def setRemoveButton(value: ComponentType[IconButtonProps]): Self = StObject.set(x, "RemoveButton", value.asInstanceOf[js.Any])
      
      inline def setSubmitButton(value: ComponentType[SubmitButtonProps[T, F]]): Self = StObject.set(x, "SubmitButton", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Blob](x: Self) {
      
      inline def setBlob(value: typings.std.Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumOptions extends StObject {
    
    /** The enum options list for a type that supports them */
    var enumOptions: js.UndefOr[js.Array[EnumOptionsType]] = js.undefined
  }
  object EnumOptions {
    
    inline def apply(): EnumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnumOptions]
    }
    
    extension [Self <: EnumOptions](x: Self) {
      
      inline def setEnumOptions(value: js.Array[EnumOptionsType]): Self = StObject.set(x, "enumOptions", value.asInstanceOf[js.Any])
      
      inline def setEnumOptionsUndefined: Self = StObject.set(x, "enumOptions", js.undefined)
      
      inline def setEnumOptionsVarargs(value: EnumOptionsType*): Self = StObject.set(x, "enumOptions", js.Array(value*))
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
    
    extension [Self <: GenericObjectTypedisabled](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
