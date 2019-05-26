package typings
package rcDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilMod {
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type OmitFunc = js.Function2[
    /* obj */ js.Object, 
    /* keys */ js.Array[java.lang.String], 
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K2 in std.Exclude<keyof object, [...keyof object][number]> ]: object[K2]}
    */ rcDashMentionsLib.rcDashMentionsLibStrings.OmitFunc with js.Object
  ]
}
