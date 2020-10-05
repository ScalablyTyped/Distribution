package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.reactNative.anon.ReadonlyNativeMethods
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.ComponentClass<P, react.react.ComponentState>, std.Exclude<keyof react.react.ComponentClass<P, react.react.ComponentState>, 'new'>> */
@js.native
trait HostComponent[P]
  extends Instantiable1[/* props */ P, (Component[P, js.Object, _]) with ReadonlyNativeMethods]
     with Instantiable2[
      /* props */ P, 
      /* context */ js.Any, 
      (Component[P, js.Object, _]) with ReadonlyNativeMethods
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[typings.reactNative.reactNativeStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[
    GetDerivedStateFromError[typings.reactNative.reactNativeStrings.getDerivedStateFromError, ComponentState]
  ] = js.native
  var getDerivedStateFromProps: js.UndefOr[
    GetDerivedStateFromProps[typings.reactNative.reactNativeStrings.getDerivedStateFromProps, ComponentState]
  ] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[typings.reactNative.reactNativeStrings.propTypes]] = js.native
}

