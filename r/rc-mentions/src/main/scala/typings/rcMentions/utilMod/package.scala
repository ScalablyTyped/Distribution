package typings.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ js.Array[java.lang.String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...keyof object][number]> ]: object[K2]}
    */ typings.rcMentions.rcMentionsStrings.OmitFunc with js.Object
  ]
  type Omit_[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}
