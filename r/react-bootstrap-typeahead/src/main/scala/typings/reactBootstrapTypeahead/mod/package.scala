package typings.reactBootstrapTypeahead

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllTypeaheadOwnAndInjectedProps[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typings.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  
  @scala.inline
  def ClearButton: typings.react.mod.FunctionComponent[typings.reactBootstrapTypeahead.mod.ClearButtonProps] = typings.reactBootstrapTypeahead.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ClearButton").asInstanceOf[typings.react.mod.FunctionComponent[typings.reactBootstrapTypeahead.mod.ClearButtonProps]]
  
  @scala.inline
  def Loader: typings.react.mod.FunctionComponent[typings.reactBootstrapTypeahead.mod.LoaderProps] = typings.reactBootstrapTypeahead.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Loader").asInstanceOf[typings.react.mod.FunctionComponent[typings.reactBootstrapTypeahead.mod.LoaderProps]]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type ShouldSelect = js.Function2[
    /* shouldSelect */ scala.Boolean, 
    /* e */ typings.react.mod.KeyboardEvent[typings.std.HTMLInputElement], 
    scala.Boolean
  ]
  
  type StringPropertyNames[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends string? K : never}[keyof T] */ js.Any
  
  type TypeaheadLabelKey[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.reactBootstrapTypeahead.mod.StringPropertyNames[T] | (js.Function1[/* option */ T, java.lang.String])
  
  type TypeaheadModel = java.lang.String | js.Object
  
  type TypeaheadResult[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = T with typings.reactBootstrapTypeahead.anon.CustomOption
}
