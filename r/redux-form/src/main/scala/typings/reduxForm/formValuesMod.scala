package typings.reduxForm

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reduxForm.reduxFormStrings.append
import typings.reduxForm.reduxFormStrings.delete
import typings.reduxForm.reduxFormStrings.entries
import typings.reduxForm.reduxFormStrings.forEach
import typings.reduxForm.reduxFormStrings.get
import typings.reduxForm.reduxFormStrings.getAll
import typings.reduxForm.reduxFormStrings.has
import typings.reduxForm.reduxFormStrings.keys
import typings.reduxForm.reduxFormStrings.set
import typings.reduxForm.reduxFormStrings.values
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/formValues", JSImport.Namespace)
@js.native
object formValuesMod extends js.Object {
  def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P with typings.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any]], 
    ComponentClass[
      P with typings.reduxForm.reduxFormStrings.formValues with TopLevel[js.Any], 
      ComponentState
    ]
  ] = js.native
  def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P with (Pick[FormData, K])], 
    ComponentClass[P with (Pick[FormData, K]), ComponentState]
  ] = js.native
}

