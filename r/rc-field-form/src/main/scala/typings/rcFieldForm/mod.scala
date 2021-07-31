package typings.rcFieldForm

import typings.rcFieldForm.anon.Children
import typings.rcFieldForm.anon.FnCall
import typings.rcFieldForm.anon.FnCallForm
import typings.rcFieldForm.fieldMod.FieldProps
import typings.rcFieldForm.formContextMod.FormProviderProps
import typings.rcFieldForm.formMod.FormProps
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.listMod.ListProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-field-form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefForm = js.native
  
  @scala.inline
  def Field[Values](hasNameRestProps: FieldProps[Values]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(hasNameRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  @JSImport("rc-field-form", "List")
  @js.native
  val List: FunctionComponent[ListProps] = js.native
  
  @scala.inline
  def useForm[Values](): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")().asInstanceOf[js.Array[FormInstance[Values]]]
  @scala.inline
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(form.asInstanceOf[js.Any]).asInstanceOf[js.Array[FormInstance[Values]]]
  
  @js.native
  trait InternalForm extends StObject {
    
    def apply[Values](props: Children[Values] & FormProps[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefForm
    extends StObject
       with InternalForm {
    
    var Field: FnCall = js.native
    
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    
    var List: FunctionComponent[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
  }
}
