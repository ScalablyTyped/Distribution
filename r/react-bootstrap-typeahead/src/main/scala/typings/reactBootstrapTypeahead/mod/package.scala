package typings.reactBootstrapTypeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AllTypeaheadOwnAndInjectedProps[T /* <: typings.reactBootstrapTypeahead.mod.TypeaheadModel */] = typings.reactBootstrapTypeahead.mod.TypeaheadProps[T] with typings.reactBootstrapTypeahead.mod.TypeaheadContainerProps[T]
  
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
