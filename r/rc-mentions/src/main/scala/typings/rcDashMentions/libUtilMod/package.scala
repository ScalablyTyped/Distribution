package typings.rcDashMentions

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilMod {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ js.Array[String], 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...keyof object][number]> ]: object[K2]}
    */ typings.rcDashMentions.rcDashMentionsStrings.OmitFunc with js.Object
  ]
}
