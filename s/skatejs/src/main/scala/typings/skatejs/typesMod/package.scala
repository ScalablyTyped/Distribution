package typings.skatejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComponentProps[T, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: skatejs.skatejs/types.PropOptions<T[P]>}
    */ typings.skatejs.skatejsStrings.ComponentProps with T
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type Maybe[T] = js.UndefOr[T | scala.Null]
  type Mixed = js.Object
  type PropOptionsAttribute = typings.skatejs.typesMod.PropOptionsAttributeIdentifier | typings.skatejs.typesMod.PropOptionsAttributeIdentifierMap
  type PropOptionsAttributeIdentifier = scala.Boolean | java.lang.String
}
