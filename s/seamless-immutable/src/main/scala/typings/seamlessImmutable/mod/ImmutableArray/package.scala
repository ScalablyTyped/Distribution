package typings.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
  type AdditionalMutatingArrayMethods = typings.std.Extract[
    js.Array[java.lang.String], 
    typings.seamlessImmutable.seamlessImmutableStrings.copyWithin | typings.seamlessImmutable.seamlessImmutableStrings.fill
  ]
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = typings.std.Extract[
    js.Array[java.lang.String], 
    typings.seamlessImmutable.seamlessImmutableStrings.push | typings.seamlessImmutable.seamlessImmutableStrings.pop | typings.seamlessImmutable.seamlessImmutableStrings.sort | typings.seamlessImmutable.seamlessImmutableStrings.splice | typings.seamlessImmutable.seamlessImmutableStrings.shift | typings.seamlessImmutable.seamlessImmutableStrings.unshift | typings.seamlessImmutable.seamlessImmutableStrings.reverse | scala.Double
  ]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = typings.seamlessImmutable.mod.Omit[
    js.Array[T], 
    typings.seamlessImmutable.mod.ImmutableArray.MutatingArrayMethods | typings.seamlessImmutable.mod.ImmutableArray.AdditionalMutatingArrayMethods | java.lang.String
  ]
}
