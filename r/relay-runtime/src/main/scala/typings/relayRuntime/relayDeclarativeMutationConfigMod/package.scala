package typings.relayRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object relayDeclarativeMutationConfigMod {
  
  type RangeBehaviors = typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeBehaviorsFunction | typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeBehaviorsObject
  
  type RangeBehaviorsFunction = js.Function1[
    /* connectionArgs */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeOperations
  ]
  
  type RangeBehaviorsObject = org.scalablytyped.runtime.StringDictionary[typings.relayRuntime.relayDeclarativeMutationConfigMod.RangeOperations]
}
