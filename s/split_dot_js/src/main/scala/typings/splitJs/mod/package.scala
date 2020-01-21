package typings.splitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CSSStyleDeclarationPartial = typings.splitJs.mod.Partial[typings.std.CSSStyleDeclaration]
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.splitJs.splitJsStrings.Partial with T
}
