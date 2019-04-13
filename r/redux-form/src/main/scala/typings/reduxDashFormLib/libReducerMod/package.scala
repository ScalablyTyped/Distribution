package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libReducerMod {
  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  org.scalablytyped.runtime.StringDictionary[reduxLib.reduxMod.Reducer[js.Any, reduxLib.reduxMod.AnyAction]]
  type FormStateMap = org.scalablytyped.runtime.StringDictionary[FormState]
}
