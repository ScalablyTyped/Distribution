package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldArrayMod {
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ java.lang.String, 
    /* index */ scala.Double, 
    /* fields */ FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
