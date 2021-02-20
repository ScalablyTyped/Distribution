package typings.rcFieldForm

import org.scalablytyped.runtime.Shortcut
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-field-form", JSImport.Default)
  @js.native
  val default: RefForm = js.native
  
  @JSImport("rc-field-form", "Field")
  @js.native
  def Field[Values](hasNameRestProps: FieldProps[Values]): Element = js.native
  
  @JSImport("rc-field-form", "FormProvider")
  @js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  
  @JSImport("rc-field-form", "List")
  @js.native
  val List: FunctionComponent[ListProps] = js.native
  
  @JSImport("rc-field-form", "useForm")
  @js.native
  def useForm[Values](): js.Array[FormInstance[Values]] = js.native
  @JSImport("rc-field-form", "useForm")
  @js.native
  def useForm[Values](form: FormInstance[Values]): js.Array[FormInstance[Values]] = js.native
  
  @js.native
  trait InternalForm extends StObject {
    
    def apply[Values](props: Children[Values] with FormProps[Values]): ReactElement = js.native
  }
  
  @js.native
  trait RefForm extends InternalForm {
    
    var Field: FnCall = js.native
    
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    
    var List: FunctionComponent[ListProps] = js.native
    
    var useForm: FnCallForm = js.native
  }
  
  type _To = RefForm
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RefForm = default
}
