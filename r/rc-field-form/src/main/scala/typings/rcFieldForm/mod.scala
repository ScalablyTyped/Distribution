package typings.rcFieldForm

import typings.rcFieldForm.formContextMod.FormProviderProps
import typings.rcFieldForm.formMod.FormProps
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.interfaceMod.InternalFormInstance
import typings.rcFieldForm.listMod.ListProps
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Field ()
    extends typings.rcFieldForm.fieldMod.default
  
  @js.native
  trait RefForm extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    var Field: TypeofField = js.native
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    var List: FunctionComponent[ListProps] = js.native
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
  }
  
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  val List: FunctionComponent[ListProps] = js.native
  val default: RefForm = js.native
  def useForm(): js.Array[FormInstance] = js.native
  def useForm(form: FormInstance): js.Array[FormInstance] = js.native
  /* static members */
  @js.native
  object Field extends js.Object {
    var contextType: Context[InternalFormInstance] = js.native
    var defaultProps: AnonTrigger = js.native
  }
  
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}

