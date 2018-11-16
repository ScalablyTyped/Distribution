package typings
package skatejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComponentProps[T, E] = skatejsLib.skatejsLibStrings.ComponentProps with T
  type Constructor[T] = ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type Maybe[T] = js.UndefOr[T | scala.Null]
  type PropOptionsAttribute = PropOptionsAttributeIdentifier | PropOptionsAttributeIdentifierMap
  type PropOptionsAttributeIdentifier = scala.Boolean | java.lang.String
}
