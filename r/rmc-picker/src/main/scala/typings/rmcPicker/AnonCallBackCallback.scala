package typings.rmcPicker

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactInstance
import typings.react.mod._Global_.JSX.Element
import typings.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallBackCallback extends js.Object {
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* prevProps */ IPickerProps, /* prevState */ js.Any, /* prevContext */ js.Any, Unit]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ IPickerProps, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ IPickerProps, /* nextState */ js.Any, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: js.Any = js.native
  var props: AnonChildren with IPickerProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ IPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  var state: js.Any = js.native
  def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: js.Any): Double = js.native
  def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  def render(): Element = js.native
  def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): Unit = js.native
  def selectByIndex(index: js.Any, itemHeight: js.Any, zscrollTo: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
}

