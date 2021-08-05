package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.FieldError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncUtilMod {
  
  @JSImport("rc-field-form/es/utils/asyncUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allPromiseFinish(promiseList: js.Array[js.Promise[FieldError]]): js.Promise[js.Array[FieldError]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPromiseFinish")(promiseList.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FieldError]]]
}
