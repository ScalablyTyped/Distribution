package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldArrayMod {
  type BaseFieldArrayProps[P, FieldValue] = (P | reduxDashFormLib.Anon_Props[P]) with (_BaseFieldArrayProps[P, FieldValue])
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ java.lang.String, 
    /* index */ scala.Double, 
    /* fields */ FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
