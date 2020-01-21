package typings.shopifyPrime.noteAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteAttribute extends js.Object {
  /**
    * The name of the note attribute.
    */
  var name: String
  /**
    * The value of the note attribute.
    */
  var value: String | Double
}

object NoteAttribute {
  @scala.inline
  def apply(name: String, value: String | Double): NoteAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NoteAttribute]
  }
}

