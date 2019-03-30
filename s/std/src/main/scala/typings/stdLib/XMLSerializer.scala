package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The XMLSerializer interface provides the serializeToString() method to construct an XML string representing a DOM tree. */
trait XMLSerializer extends js.Object {
  def serializeToString(root: Node): java.lang.String
}

@JSGlobal("XMLSerializer")
@js.native
class XMLSerializerCls () extends XMLSerializer {
  /* CompleteClass */
  override def serializeToString(root: Node): java.lang.String = js.native
}

@JSGlobal("XMLSerializer")
@js.native
object XMLSerializer
  extends org.scalablytyped.runtime.Instantiable0[XMLSerializer]

