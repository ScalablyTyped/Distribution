package typings
package reactLib.reactMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXNs {
  // tslint:disable-next-line:no-empty-interface
  type Element = reactLib.reactMod.ReactElement[js.Any]
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = reactLib.reactMod.Attributes
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = reactLib.reactMod.ClassAttributes[T]
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = reactLib.reactMod.ReactManagedAttributes[js.Any | C, P]
}
