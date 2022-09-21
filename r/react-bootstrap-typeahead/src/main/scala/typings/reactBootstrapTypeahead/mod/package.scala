package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTypeahead.anon.Active
import typings.reactBootstrapTypeahead.anon.CustomOption
import typings.reactBootstrapTypeahead.anon.OnBlur
import typings.reactBootstrapTypeahead.mod.^
import typings.std.Event
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ClearButton: FunctionComponent[ClearButtonProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("ClearButton").asInstanceOf[FunctionComponent[ClearButtonProps]]

inline def Loader: FunctionComponent[LoaderProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Loader").asInstanceOf[FunctionComponent[LoaderProps]]

inline def useToken(props: OnBlur): Active = ^.asInstanceOf[js.Dynamic].applyDynamic("useToken")(props.asInstanceOf[js.Any]).asInstanceOf[Active]

type EventHandler[T] = js.Function1[/* e */ SyntheticEvent[T, Event], Unit]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]

type Option = String | StringDictionary[Any]

type ShouldSelect = js.Function2[/* shouldSelect */ Boolean, /* e */ KeyboardEvent[HTMLInputElement], Boolean]

type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any

type TypeaheadLabelKey[T /* <: TypeaheadModel */] = StringPropertyNames[T] | (js.Function1[/* option */ T, String])

type TypeaheadModel = String | js.Object

type TypeaheadResult[T /* <: TypeaheadModel */] = T & CustomOption
