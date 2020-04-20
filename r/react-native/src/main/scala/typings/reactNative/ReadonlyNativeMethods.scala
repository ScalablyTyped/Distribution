package typings.reactNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.MeasureInWindowOnSuccessCallback
import typings.reactNative.mod.MeasureLayoutOnSuccessCallback
import typings.reactNative.mod.MeasureOnSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-native.react-native.NativeMethods> */
trait ReadonlyNativeMethods extends js.Object {
  val blur: js.Function0[Unit]
  val focus: js.Function0[Unit]
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit]
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit]
  val measureLayout: js.Function3[
    /* relativeToNativeNode */ Double, 
    /* onSuccess */ MeasureLayoutOnSuccessCallback, 
    /* onFail */ js.Function0[Unit], 
    Unit
  ]
  val refs: StringDictionary[Component[_, _, _]]
  val setNativeProps: js.Function1[/* nativeProps */ js.Object, Unit]
}

object ReadonlyNativeMethods {
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    measure: /* callback */ MeasureOnSuccessCallback => Unit,
    measureInWindow: /* callback */ MeasureInWindowOnSuccessCallback => Unit,
    measureLayout: (/* relativeToNativeNode */ Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit,
    refs: StringDictionary[Component[_, _, _]],
    setNativeProps: /* nativeProps */ js.Object => Unit
  ): ReadonlyNativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), measure = js.Any.fromFunction1(measure), measureInWindow = js.Any.fromFunction1(measureInWindow), measureLayout = js.Any.fromFunction3(measureLayout), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
    __obj.asInstanceOf[ReadonlyNativeMethods]
  }
}

