package typings.reactAddonsTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventSimulator = js.Function2[
    /* element */ typings.std.Element | (typings.react.mod.Component[js.Any, js.Object, js.Any]), 
    /* eventData */ js.UndefOr[typings.reactAddonsTestUtils.mod.SyntheticEventData], 
    scala.Unit
  ]
}
