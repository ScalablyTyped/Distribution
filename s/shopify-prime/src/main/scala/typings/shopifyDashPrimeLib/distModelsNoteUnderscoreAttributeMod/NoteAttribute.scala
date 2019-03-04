package typings
package shopifyDashPrimeLib.distModelsNoteUnderscoreAttributeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoteAttribute extends js.Object {
  /**
    * The name of the note attribute.
    */
  var name: java.lang.String
  /**
    * The value of the note attribute.
    */
  var value: java.lang.String | scala.Double
}

object NoteAttribute {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String | scala.Double): NoteAttribute = {
    val __obj = js.Dynamic.literal(name = name, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NoteAttribute]
  }
}

