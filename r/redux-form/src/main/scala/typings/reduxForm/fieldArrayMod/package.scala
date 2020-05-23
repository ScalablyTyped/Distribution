package typings.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fieldArrayMod {
  type BaseFieldArrayProps[P, FieldValue] = (P | typings.reduxForm.anon.Props[P]) with (typings.reduxForm.fieldArrayMod._BaseFieldArrayProps[P, FieldValue])
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ java.lang.String, 
    /* index */ scala.Double, 
    /* fields */ typings.reduxForm.fieldArrayMod.FieldArrayFieldsProps[FieldValue], 
    R
  ]
}
