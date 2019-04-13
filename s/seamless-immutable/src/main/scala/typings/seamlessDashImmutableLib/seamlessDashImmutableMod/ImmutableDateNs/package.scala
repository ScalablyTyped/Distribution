package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDateNs {
  // These methods are banned by seamless-immutable
  type MutatingDateMethods = stdLib.Extract[
    java.lang.String, 
    seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setDate | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setFullYear | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setHours | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setMilliseconds | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setMinutes | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setMonth | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setSeconds | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setTime | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCDate | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCFullYear | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCHours | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCMilliseconds | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCMinutes | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCMonth | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setUTCSeconds | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.setYear
  ]
  /** Only allows Date methods, which are the getters. */
  type Remaining = seamlessDashImmutableLib.seamlessDashImmutableMod.Omit[stdLib.Date, MutatingDateMethods]
}
