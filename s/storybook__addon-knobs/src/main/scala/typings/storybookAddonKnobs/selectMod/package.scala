package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type SelectTypeKnobValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | scala.Null | js.Array[typings.std.PropertyKey]
  ]
  
  type SelectTypeOptionsProp[T /* <: typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue */] = (typings.std.Record[
    (typings.std.Extract[T, typings.std.PropertyKey]) | typings.std.PropertyKey, 
    (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
  ]) | js.Array[T]
}
