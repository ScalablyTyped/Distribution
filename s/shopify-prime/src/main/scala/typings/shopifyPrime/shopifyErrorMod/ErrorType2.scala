package typings.shopifyPrime.shopifyErrorMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorType2 extends js.Object {
  var errors: StringDictionary[String | js.Array[String]]
}

object ErrorType2 {
  @scala.inline
  def apply(errors: StringDictionary[String | js.Array[String]]): ErrorType2 = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType2]
  }
}

