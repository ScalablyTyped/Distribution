package typings
package rmcDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBack extends js.Object {
  var context: js.Any = js.native
  var props: stdLib.Readonly[Anon_Children] with stdLib.Readonly[rmcDashPickerLib.libPickerTypesMod.IPickerProps] = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNs.ReactInstance] = js.native
  var state: stdLib.Readonly[_] = js.native
  def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: js.Any): scala.Double = js.native
  def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): scala.Unit = js.native
  def forceUpdate(): scala.Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): scala.Unit = js.native
  def render(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): scala.Unit = js.native
  def selectByIndex(index: js.Any, itemHeight: js.Any, zscrollTo: js.Any): scala.Unit = js.native
  def setState[K /* <: java.lang.String | scala.Double | js.Symbol */](state: js.Any): scala.Unit = js.native
  def setState[K /* <: java.lang.String | scala.Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): scala.Unit = js.native
}

