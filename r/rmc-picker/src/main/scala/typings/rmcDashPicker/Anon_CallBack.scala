package typings.rmcDashPicker

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactInstance
import typings.react.reactMod._Global_.JSX.Element
import typings.rmcDashPicker.libMultiPickerPropsMod.IMultiPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallBack extends js.Object {
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[
      /* prevProps */ IMultiPickerProps, 
      /* prevState */ js.Any, 
      /* prevContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ IMultiPickerProps, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ IMultiPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Unit
    ]
  ] = js.native
  var context: js.Any = js.native
  var props: Anon_Children with IMultiPickerProps = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ IMultiPickerProps, 
      /* nextState */ js.Any, 
      /* nextContext */ js.Any, 
      Boolean
    ]
  ] = js.native
  var state: js.Any = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[_]): Unit = js.native
  def getValue(): js.Array[_] = js.native
  def onChange(i: js.Any, v: js.Any, cb: js.Any): Unit = js.native
  def onScrollChange(i: js.Any, v: js.Any): Unit = js.native
  def onValueChange(i: js.Any, v: js.Any): Unit = js.native
  def render(): Element = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[_]): Unit = js.native
}

