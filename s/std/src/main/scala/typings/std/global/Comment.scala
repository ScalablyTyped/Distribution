package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Comment")
@js.native
class Comment ()
  extends typings.std.CharacterData {
  def this(data: java.lang.String) = this()
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: typings.std.Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: typings.std.Element | Null = js.native
}

@JSGlobal("Comment")
@js.native
object Comment
  extends Instantiable0[typings.std.Comment]
     with Instantiable1[/* data */ java.lang.String, typings.std.Comment]

