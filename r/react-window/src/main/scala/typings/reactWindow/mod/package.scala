package typings.reactWindow.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.Key
import typings.reactWindow.anon.ColumnIndex
import typings.reactWindow.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def areEqual(prevProps: js.Object, nextProps: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areEqual")(prevProps.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def shouldComponentUpdate[P, S](nextProps: P, nextState: S): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldComponentUpdate")(nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]

type GridItemKeySelector[T] = js.Function1[/* params */ ColumnIndex[T], Key]

type ListItemKeySelector[T] = js.Function2[/* index */ Double, /* data */ T, Key]

type ReactElementType = FunctionComponent[Any] | (ComponentClass[Any, ComponentState]) | String
