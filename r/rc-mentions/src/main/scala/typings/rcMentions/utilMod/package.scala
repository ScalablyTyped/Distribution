package typings.rcMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ Array[/* keyof object */ java.lang.String], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...std.Array<keyof object>][number]> ]: object[K2]}
    */ typings.rcMentions.rcMentionsStrings.OmitFunc with org.scalablytyped.runtime.TopLevel[js.Object]
  ]
  type Omit_[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}
