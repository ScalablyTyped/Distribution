package typings.seamlessDashImmutable.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  import typings.seamlessDashImmutable.seamlessDashImmutableMod.Omit
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.copyWithin
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.fill
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.pop
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.push
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.reverse
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.shift
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.sort
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.splice
  import typings.seamlessDashImmutable.seamlessDashImmutableStrings.unshift
  import typings.std.Extract

  /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
  type AdditionalMutatingArrayMethods = Extract[js.Array[String], copyWithin | fill]
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = Extract[js.Array[String], push | pop | sort | splice | shift | unshift | reverse | Double]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = Omit[js.Array[T], MutatingArrayMethods | AdditionalMutatingArrayMethods | String]
}
