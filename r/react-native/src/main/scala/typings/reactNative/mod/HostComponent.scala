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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.ComponentClass<P, react.react.ComponentState>, std.Exclude<keyof react.react.ComponentClass<P, react.react.ComponentState>, 'new'>> */
@js.native
trait HostComponent[P]
  extends StObject
     with Instantiable1[/* props */ P, (Component[P, js.Object, Any]) & ReadonlyNativeMethods]
     with Instantiable2[
      /* props */ P, 
      /* context */ Any, 
      (Component[P, js.Object, Any]) & ReadonlyNativeMethods
    ] {
  
  var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  
  var defaultProps: js.UndefOr[Partial["defaultProps"]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError["getDerivedStateFromError", ComponentState]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps["getDerivedStateFromProps", ComponentState]] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap["propTypes"]] = js.native
}
