package typings.splitDotJs

import typings.std.CSSStyleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splitDotJsMod {
  type CSSStyleDeclarationPartial = Partial[CSSStyleDeclaration]
  type Partial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.splitDotJs.splitDotJsStrings.Partial with T
}
