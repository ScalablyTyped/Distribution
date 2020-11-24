package typings.reactSpringShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object frameLoopMod {
  
  type RequestFrameFn = js.Function1[
    /* cb */ typings.reactSpringShared.typesMod.FrameRequestCallback, 
    scala.Double | scala.Unit
  ]
}
