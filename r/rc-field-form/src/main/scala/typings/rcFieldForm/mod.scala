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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Field[Values](hasNameRestProps: FieldProps[Values]): Element = js.native
  
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  val List: FunctionComponent[ListProps] = js.native
  
  val default: RefForm = js.native
  
  def useForm[Values](): js.Array[FormInstance[Values]] = js.native
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait InternalForm extends js.Object {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefForm extends InternalForm {
    
    var Field: FnCall = js.native
    
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    
    var List: FunctionComponent[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
  }
}
