package typings.stampit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampitMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.stampit.stampitMod.stampit.Stamp

  type MethodMap[This] = StringDictionary[(js.ThisFunction1[/* this */ This, /* repeated */ js.Any, js.Any]) | js.Object]
  /**
    * @internal Chainables `Stamp` additionnal methods
    * @template Obj The object type that the `Stamp` will create.
    */
  type StampChainables[Obj] = Chainables[StampObjectType[Obj], StampType[Obj]]
  /**
    * @internal The type of the object produced by the `Stamp`.
    * @template Original The type (either a `Stamp` or a `ExtendedDescriptor`) to get the object type from.
    */
  type StampObjectType[Original] = Original | js.Any
  /**
    * @internal Extracts the `Stamp` type.
    * @template Original The type to extract the `Stamp` type from.
    */
  type StampType[Original] = (Stamp[js.Any | Original]) | Original | js.Any
}
