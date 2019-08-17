package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldArrayMod {
  import typings.reduxDashForm.Anon_Props

  type BaseFieldArrayProps[P, FieldValue] = (P | Anon_Props[P]) with (_BaseFieldArrayProps[P, FieldValue])
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ String, 
    /* index */ Double, 
    /* fields */ FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
