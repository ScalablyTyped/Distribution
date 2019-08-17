package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReducerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.redux.reduxMod.AnyAction
  import typings.redux.reduxMod.Reducer

  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  StringDictionary[Reducer[js.Any, AnyAction]]
  type FormStateMap = StringDictionary[FormState]
}
