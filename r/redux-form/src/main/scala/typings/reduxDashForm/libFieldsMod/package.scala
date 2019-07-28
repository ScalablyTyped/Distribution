package typings.reduxDashForm

import org.scalablytyped.runtime.StringDictionary
import typings.reduxDashForm.libFieldMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldsMod {
  type FieldsWarnerOrValidator = Validator | js.Array[Validator] | (StringDictionary[Validator | js.Array[Validator]])
}
