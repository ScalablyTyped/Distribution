package typings
package splitDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splitDotJsMod {
  type CSSStyleDeclarationPartial = Partial[stdLib.CSSStyleDeclaration]
  type Partial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ splitDotJsLib.splitDotJsLibStrings.Partial with T
}
