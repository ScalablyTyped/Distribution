package typings.relayDashRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMutationsRelayDeclarativeMutationConfigMod {
  import org.scalablytyped.runtime.StringDictionary

  type RangeBehaviors = RangeBehaviorsFunction | RangeBehaviorsObject
  type RangeBehaviorsFunction = js.Function1[/* connectionArgs */ StringDictionary[js.Any], RangeOperations]
  type RangeBehaviorsObject = StringDictionary[RangeOperations]
}
