package typings
package reduxDashSagaDashTesterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaDashTesterMod {
  type Reducer = js.Function2[/* state */ js.Object, /* action */ AnyAction, js.Object]
  type ReduxMiddleware = js.Function1[
    /* options */ reduxDashSagaDashTesterLib.Anon_Dispatch, 
    js.Function1[/* next */ js.Function1[/* action */ AnyAction, js.Any], js.Any]
  ]
  type SagaFunction = js.Function1[/* repeated */js.Any, js.Any]
}
