package typings.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentClassProps[C] = js.Any
  
  type ElementConfig[C] = typings.react.mod.global.JSX.LibraryManagedAttributes[C, typings.reactWithStyles.mod.ElementProps[C]]
  
  type ElementProps[C] = typings.reactWithStyles.mod.SFCProps[C] | typings.reactWithStyles.mod.ComponentClassProps[C]
  
  type Nullable[T] = js.UndefOr[T | scala.Null]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type SFCProps[C] = js.Any
  
  type Styles = org.scalablytyped.runtime.StringDictionary[
    typings.reactWithStyles.mod.Nullable[typings.reactWithStyles.anon.CSSPropertiespseudoSelect]
  ]
}
