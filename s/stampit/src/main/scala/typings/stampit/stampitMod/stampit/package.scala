package typings.stampit.stampitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stampit {
  import typings.stampit.stampitMod.StampSignature

  /** A composable object (either a `Stamp` or a `ExtendedDescriptor`.) */
  type Composable = StampSignature | (ExtendedDescriptor[js.Any, js.Any])
  /**
    * A function used as `.composers` argument.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` produced by the `.compose()` method.
    */
  type Composer[S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.Function1[/* parameters */ ComposerParameters[S̤t̤a̤m̤p̤], Unit | S̤t̤a̤m̤p̤]
  /**
    * A function used as `.initializers` argument.
    * @template Obj The type of the object instance being produced by the `Stamp`.
    * @template S̤t̤a̤m̤p̤ The type of the `Stamp` producing the instance.
    */
  type Initializer[Obj, S̤t̤a̤m̤p̤ /* <: StampSignature */] = js.ThisFunction2[
    /* this */ Obj, 
    /*_propertyMap*/ /* options */ js.Any, 
    /* context */ InitializerContext[Obj, S̤t̤a̤m̤p̤], 
    Unit | Obj
  ]
}
