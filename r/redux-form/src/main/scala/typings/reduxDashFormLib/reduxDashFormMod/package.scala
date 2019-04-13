package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashFormMod {
  type FormErrors[FormData, T] = reduxDashFormLib.reduxDashFormLibStrings.FormErrors with js.Any with ErrorOther[T]
  type FormWarnings[FormData, T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof FormData ]:? react.react.ReactElement<any> | string | redux-form.redux-form.WarningOther<T>}
    */ reduxDashFormLib.reduxDashFormLibStrings.FormWarnings with js.Any
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
}
