package typings.reactLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // React Element Props
  type DivProps = typings.react.mod.HTMLProps[typings.std.HTMLDivElement]
  
  // Helper types
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PreProps = typings.react.mod.HTMLProps[typings.std.HTMLPreElement]
}
