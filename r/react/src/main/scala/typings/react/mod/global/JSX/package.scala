package typings.react.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  // tslint:disable-next-line:no-empty-interface
  type Element = typings.react.mod.ReactElement
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = typings.react.mod.Attributes
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = typings.react.mod.ClassAttributes[T]
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = typings.react.mod.ReactManagedAttributes[js.Any | C, P]
}
