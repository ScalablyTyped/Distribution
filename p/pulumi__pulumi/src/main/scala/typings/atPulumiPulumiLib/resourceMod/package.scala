package typings
package atPulumiPulumiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourceMod {
  type ID = java.lang.String
  type Input[T] = T | stdLib.Promise[T] | Output[T]
  type Inputs = stdLib.Record[java.lang.String, Input[js.Any]]
  type URN = java.lang.String
  /**
   * The 'Unwrap' type allows us to express the operation of taking a type, with potentially deeply
   * nested Promises and Outputs and to then get that same type with all the Promises and Outputs
   * replaced with their wrapped type.  Note that this Unwrapping is 'deep'.  So if you had:
   *
   *      `type X = { A: Promise<{ B: Output<{ c: Input<boolean> }> }> }`
   *
   * Then `Unwrap<X>` would be equivalent to:
   *
   *      `...    = { A: { B: { C: boolean } } }`
   *
   * Unwrapping sees through Promises, Outputs, Arrays and Objects.
   *
   * Note: due to TypeScript limitations there are some things that cannot be expressed. Specifically,
   * if you had a `Promise<Output<T>>` then the Unwrap type would not be able to undo both of those
   * wraps. In practice that should be ok.  Values in an object graph should not wrap Outputs in
   * Promises.  Instead, any code that needs to work Outputs and also be async should either create
   * the Output with the Promise (which will collapse into just an Output).  Or, it should start with
   * an Output and call [apply] on it, passing in an async function.  This will also collapse and just
   * produce an Output.
   *
   * In other words, this should not be used as the shape of an object: `{ a: Promise<Output<...>> }`.
   * It should always either be `{ a: Promise<NonOutput> }` or just `{ a: Output<...> }`.
   */
  type Unwrap[T] = UnwrapSimple[T] | UnwrapSimple[js.Any]
  /**
   * Handles encountering basic types when unwrapping.
   */
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  type UnwrappedObject[T] = atPulumiPulumiLib.atPulumiPulumiLibStrings.UnwrappedObject with T
  type primitive = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
}
