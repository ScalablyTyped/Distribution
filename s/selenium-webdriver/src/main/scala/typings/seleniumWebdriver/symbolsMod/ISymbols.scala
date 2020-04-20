package typings.seleniumWebdriver.symbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISymbols extends js.Object {
  /**
    * The serialize symbol specifies a method that returns an object's serialized
    * representation. If an object's serialized form is not immediately
    * available, the serialize method will return a promise that will be resolved
    * with the serialized form.
    *
    * Note that the described method is analogous to objects that define a
    * `toJSON()` method, except the serialized result may be a promise, or
    * another object with a promised property.
    */
  val serialize: js.Symbol
}

object ISymbols {
  @scala.inline
  def apply(serialize: js.Symbol): ISymbols = {
    val __obj = js.Dynamic.literal(serialize = serialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISymbols]
  }
}

