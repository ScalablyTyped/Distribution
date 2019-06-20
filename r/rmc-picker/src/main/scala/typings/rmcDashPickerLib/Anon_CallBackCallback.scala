package typings
package rmcDashPickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBackCallback extends js.Object {
  var componentDidMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ rmcDashPickerLib.libPickerTypesMod.IPickerProps, 
      /* prevState */ js.Any, 
      /* prevContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[
      /* nextProps */ rmcDashPickerLib.libPickerTypesMod.IPickerProps, 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ rmcDashPickerLib.libPickerTypesMod.IPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var props: Anon_Children with rmcDashPickerLib.libPickerTypesMod.IPickerProps = js.native
  var refs: org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ rmcDashPickerLib.libPickerTypesMod.IPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      scala.Boolean
    ]
  ] = js.native
  var state: js.Any = js.native
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

