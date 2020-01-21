package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormErrors[FormData, T] = typings.reduxForm.reduxFormStrings.FormErrors with js.Any with typings.reduxForm.mod.ErrorOther[T]
  type FormWarnings[FormData, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof FormData ]:? react.react.ReactElement | string | redux-form.redux-form.WarningOther<T>}
    */ typings.reduxForm.reduxFormStrings.FormWarnings with js.Any
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
