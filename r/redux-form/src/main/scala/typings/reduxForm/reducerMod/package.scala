package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reducerMod {
  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  org.scalablytyped.runtime.StringDictionary[typings.redux.mod.Reducer[js.Any, typings.redux.mod.AnyAction]]
  type FormStateMap = org.scalablytyped.runtime.StringDictionary[typings.reduxForm.reducerMod.FormState]
}
