package typings.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableDate {
  // These methods are banned by seamless-immutable
  type MutatingDateMethods = typings.std.Extract[
    java.lang.String, 
    typings.seamlessImmutable.seamlessImmutableStrings.setDate | typings.seamlessImmutable.seamlessImmutableStrings.setFullYear | typings.seamlessImmutable.seamlessImmutableStrings.setHours | typings.seamlessImmutable.seamlessImmutableStrings.setMilliseconds | typings.seamlessImmutable.seamlessImmutableStrings.setMinutes | typings.seamlessImmutable.seamlessImmutableStrings.setMonth | typings.seamlessImmutable.seamlessImmutableStrings.setSeconds | typings.seamlessImmutable.seamlessImmutableStrings.setTime | typings.seamlessImmutable.seamlessImmutableStrings.setUTCDate | typings.seamlessImmutable.seamlessImmutableStrings.setUTCFullYear | typings.seamlessImmutable.seamlessImmutableStrings.setUTCHours | typings.seamlessImmutable.seamlessImmutableStrings.setUTCMilliseconds | typings.seamlessImmutable.seamlessImmutableStrings.setUTCMinutes | typings.seamlessImmutable.seamlessImmutableStrings.setUTCMonth | typings.seamlessImmutable.seamlessImmutableStrings.setUTCSeconds | typings.seamlessImmutable.seamlessImmutableStrings.setYear
  ]
  /** Only allows Date methods, which are the getters. */
  type Remaining = typings.seamlessImmutable.mod.Omit[typings.std.Date, typings.seamlessImmutable.mod.ImmutableDate.MutatingDateMethods]
}
