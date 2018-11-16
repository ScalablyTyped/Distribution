package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ReactLifeCycleFunctionsThisArguments[TProps, TState] extends js.Object {
  var context: js.Any = js.native
  var props: TProps = js.native
  var refs: ScalablyTyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactInstance] = js.native
  var state: TState = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): scala.Unit = js.native
  def setState[TKeyOfState /* <: java.lang.String */](f: js.Function2[/* prevState */ TState, /* props */ TProps, stdLib.Pick[TState, TKeyOfState]]): scala.Unit = js.native
  def setState[TKeyOfState /* <: java.lang.String */](
    f: js.Function2[/* prevState */ TState, /* props */ TProps, stdLib.Pick[TState, TKeyOfState]],
    callback: js.Function0[_]
  ): scala.Unit = js.native
  def setState[TKeyOfState /* <: java.lang.String */](state: stdLib.Pick[TState, TKeyOfState]): scala.Unit = js.native
  def setState[TKeyOfState /* <: java.lang.String */](state: stdLib.Pick[TState, TKeyOfState], callback: js.Function0[_]): scala.Unit = js.native
}

