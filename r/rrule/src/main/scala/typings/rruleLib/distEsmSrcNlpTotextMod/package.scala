package typings
package rruleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsmSrcNlpTotextMod {
  type DateFormatter = js.Function3[
    /* year */ scala.Double, 
    /* month */ java.lang.String, 
    /* day */ scala.Double, 
    java.lang.String
  ]
  type GetText = js.Function1[
    /* id */ java.lang.String | scala.Double | rruleLib.distEsmSrcWeekdayMod.Weekday, 
    java.lang.String
  ]
}
