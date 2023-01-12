package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNativeWindows.rntypesMod.HostComponent
import typings.reactNativeWindows.rntypesMod.MeasureInWindowOnSuccessCallback
import typings.reactNativeWindows.rntypesMod.MeasureLayoutOnSuccessCallback
import typings.reactNativeWindows.rntypesMod.MeasureOnSuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-windows.react-native-windows/rntypes.NativeMethods> */
trait ReadonlyNativeMethods extends StObject {
  
  val blur: js.Function0[Unit]
  
  val focus: js.Function0[Unit]
  
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit]
  
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit]
  
  val measureLayout: js.Function3[
    /* relativeToNativeComponentRef */ HostComponent[Any] | Double, 
    /* onSuccess */ MeasureLayoutOnSuccessCallback, 
    /* onFail */ js.Function0[Unit], 
    Unit
  ]
  
  val refs: StringDictionary[Component[Any, Any, Any]]
  
  val setNativeProps: js.Function1[/* nativeProps */ js.Object, Unit]
}
object ReadonlyNativeMethods {
  
  inline def apply(
    blur: () => Unit,
    focus: () => Unit,
    measure: /* callback */ MeasureOnSuccessCallback => Unit,
    measureInWindow: /* callback */ MeasureInWindowOnSuccessCallback => Unit,
    measureLayout: (/* relativeToNativeComponentRef */ HostComponent[Any] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit,
    refs: StringDictionary[Component[Any, Any, Any]],
    setNativeProps: /* nativeProps */ js.Object => Unit
  ): ReadonlyNativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), measure = js.Any.fromFunction1(measure), measureInWindow = js.Any.fromFunction1(measureInWindow), measureLayout = js.Any.fromFunction3(measureLayout), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
    __obj.asInstanceOf[ReadonlyNativeMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyNativeMethods] (val x: Self) extends AnyVal {
    
    inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    inline def setMeasure(value: /* callback */ MeasureOnSuccessCallback => Unit): Self = StObject.set(x, "measure", js.Any.fromFunction1(value))
    
    inline def setMeasureInWindow(value: /* callback */ MeasureInWindowOnSuccessCallback => Unit): Self = StObject.set(x, "measureInWindow", js.Any.fromFunction1(value))
    
    inline def setMeasureLayout(
      value: (/* relativeToNativeComponentRef */ HostComponent[Any] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit
    ): Self = StObject.set(x, "measureLayout", js.Any.fromFunction3(value))
    
    inline def setRefs(value: StringDictionary[Component[Any, Any, Any]]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setSetNativeProps(value: /* nativeProps */ js.Object => Unit): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction1(value))
  }
}
