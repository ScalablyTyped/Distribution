package typings.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = typings.std.Extract[
    js.Array[/* keyof any */ java.lang.String], 
    typings.seamlessImmutable.seamlessImmutableStrings.push | typings.seamlessImmutable.seamlessImmutableStrings.pop | typings.seamlessImmutable.seamlessImmutableStrings.sort | typings.seamlessImmutable.seamlessImmutableStrings.splice | typings.seamlessImmutable.seamlessImmutableStrings.shift | typings.seamlessImmutable.seamlessImmutableStrings.unshift | typings.seamlessImmutable.seamlessImmutableStrings.reverse | scala.Double
  ]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = typings.seamlessImmutable.mod.Omit[
    js.Array[T], 
    typings.seamlessImmutable.mod.ImmutableArray.MutatingArrayMethods | typings.seamlessImmutable.mod.ImmutableArray.AdditionalMutatingArrayMethods | typings.seamlessImmutable.seamlessImmutableStrings.forEach | typings.seamlessImmutable.seamlessImmutableStrings.map | typings.seamlessImmutable.seamlessImmutableStrings.filter | typings.seamlessImmutable.seamlessImmutableStrings.slice | typings.seamlessImmutable.seamlessImmutableStrings.concat | typings.seamlessImmutable.seamlessImmutableStrings.reduce | typings.seamlessImmutable.seamlessImmutableStrings.reduceRight
  ]
}
