package typings.react.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object reactAugmentingMod {
  
  /**
    * WARNING: Don't use this as a `string`.
    *
    * This is an opaque type that is not supposed to type-check structurally.
    * It is only valid if returned from React methods and passed to React e.g. `<button aria-labelledby={opaqueIdentifier} />`
    */
  // We can't create a type that would be rejected for string concatenation or `.toString()` calls.
  // So in order to not have to add `string | OpaqueIdentifier` to every react-dom host prop we intersect it with `string`.
  type OpaqueIdentifier = java.lang.String with typings.react.anon.OpaqueIdentifierBranding
  
  type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]
  
  type TransitionStartFunction = js.Function1[
    /* callback */ typings.react.experimentalMod.reactAugmentingMod.TransitionFunction, 
    scala.Unit
  ]
}
