package typings.react.reactMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  import typings.react.reactMod.Attributes
  import typings.react.reactMod.ClassAttributes
  import typings.react.reactMod.ReactElement
  import typings.react.reactMod.ReactManagedAttributes

  // tslint:disable-next-line:no-empty-interface
  type Element = ReactElement
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = Attributes
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = ClassAttributes[T]
  // We can't recurse forever because `type` can't be self-referential;
  // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
  type LibraryManagedAttributes[C, P] = ReactManagedAttributes[js.Any | C, P]
}
