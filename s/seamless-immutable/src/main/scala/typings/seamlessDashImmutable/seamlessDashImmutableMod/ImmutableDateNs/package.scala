package typings.seamlessDashImmutable.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDateNs {
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.Omit
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setDate
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setFullYear
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setHours
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setMilliseconds
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setMinutes
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setMonth
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setSeconds
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setTime
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCDate
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCFullYear
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCHours
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMilliseconds
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMinutes
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCMonth
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setUTCSeconds
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.setYear
  import typings.std.Date
  import typings.std.Extract

  // These methods are banned by seamless-immutable
  type MutatingDateMethods = Extract[
    String, 
    setDate | setFullYear | setHours | setMilliseconds | setMinutes | setMonth | setSeconds | setTime | setUTCDate | setUTCFullYear | setUTCHours | setUTCMilliseconds | setUTCMinutes | setUTCMonth | setUTCSeconds | setYear
  ]
  /** Only allows Date methods, which are the getters. */
  type Remaining = Omit[Date, MutatingDateMethods]
}
