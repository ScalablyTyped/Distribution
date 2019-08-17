package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFormMod {
  import typings.std.Pick

  type FormErrors[FormData, T] = typings.reduxDashForm.reduxDashFormStrings.FormErrors with js.Any with ErrorOther[T]
  type FormWarnings[FormData, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>}
    */ typings.reduxDashForm.reduxDashFormStrings.FormWarnings with js.Any
  type Omit[T, K /* <: String */] = Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
