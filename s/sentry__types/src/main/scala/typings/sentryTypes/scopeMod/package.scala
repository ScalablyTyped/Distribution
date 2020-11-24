package typings.sentryTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scopeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.scopeMod.Scope
    - typings.sentryTypes.anon.PartialScopeContext
    - js.Function1[/ * scope * / typings.sentryTypes.scopeMod.Scope, typings.sentryTypes.scopeMod.Scope]
  */
  type CaptureContext = typings.sentryTypes.scopeMod._CaptureContext | (js.Function1[/* scope */ typings.sentryTypes.scopeMod.Scope, typings.sentryTypes.scopeMod.Scope])
}
