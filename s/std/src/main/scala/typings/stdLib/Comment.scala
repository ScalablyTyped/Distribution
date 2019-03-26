package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Comment")
@js.native
class CommentCls () extends Comment {
  def this(data: java.lang.String) = this()
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
}

@JSGlobal("Comment")
@js.native
object Comment
  extends org.scalablytyped.runtime.Instantiable0[Comment]
     with org.scalablytyped.runtime.Instantiable1[/* data */ java.lang.String, Comment]

