package typings.reduxDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFieldsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.reduxDashForm.libFieldMod.Validator

  type FieldsWarnerOrValidator = Validator | js.Array[Validator] | (StringDictionary[Validator | js.Array[Validator]])
}
