package typings.skatejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import org.scalablytyped.runtime.Instantiable1

  type ComponentProps[T, E] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: skatejs.skatejs/types.PropOptions<T[P]>}
    */ typings.skatejs.skatejsStrings.ComponentProps with T
  type Constructor[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  type Maybe[T] = js.UndefOr[T | Null]
  type Mixed = js.Object
  type PropOptionsAttribute = PropOptionsAttributeIdentifier | PropOptionsAttributeIdentifierMap
  type PropOptionsAttributeIdentifier = Boolean | String
}
