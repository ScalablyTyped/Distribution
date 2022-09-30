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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formValuesMod {
  
  @JSImport("redux-form/lib/formValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formValues[Values, P](obj: Values): js.Function1[
    /* component */ ComponentType[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any]], 
    ComponentClass[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any], ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any]], 
    ComponentClass[P & typings.reduxForm.reduxFormStrings.formValues & TopLevel[Any], ComponentState]
  ]]
  inline def formValues[FormData, K /* <: /* keyof FormData */ append | delete | get | getAll | has | set | forEach | entries | keys | values */, P](names: K*): js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClass[P & (Pick[FormData, K]), ComponentState]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("formValues")(names.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[
    /* component */ ComponentType[P & (Pick[FormData, K])], 
    ComponentClass[P & (Pick[FormData, K]), ComponentState]
  ]]
}
