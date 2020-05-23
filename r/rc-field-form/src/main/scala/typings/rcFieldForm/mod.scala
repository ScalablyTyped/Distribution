package typings.rcFieldForm

import typings.rcFieldForm.fieldMod.FieldProps
import typings.rcFieldForm.formContextMod.FormProviderProps
import typings.rcFieldForm.formMod.FormProps
import typings.rcFieldForm.interfaceMod.FormInstance
import typings.rcFieldForm.listMod.ListProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-field-form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait RefForm extends ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]] {
    var Field: FC[FieldProps] = js.native
    var FormProvider: FunctionComponent[FormProviderProps] = js.native
    var List: FunctionComponent[ListProps] = js.native
    var useForm: js.Function1[/* form */ js.UndefOr[FormInstance], js.Array[FormInstance]] = js.native
  }
  
  val Field: FC[FieldProps] = js.native
  val FormProvider: FunctionComponent[FormProviderProps] = js.native
  val List: FunctionComponent[ListProps] = js.native
  val default: RefForm = js.native
  def useForm(): js.Array[FormInstance] = js.native
  def useForm(form: FormInstance): js.Array[FormInstance] = js.native
  type InternalForm = ForwardRefExoticComponent[FormProps with RefAttributes[FormInstance]]
}

