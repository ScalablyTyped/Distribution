package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract. */
@js.native
trait CharacterData
  extends ChildNode
     with NonDocumentTypeChildNode {
  var data: java.lang.String = js.native
  val length: scala.Double = js.native
  def appendData(data: java.lang.String): scala.Unit = js.native
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit = js.native
  def insertData(offset: scala.Double, data: java.lang.String): scala.Unit = js.native
  def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit = js.native
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String = js.native
}

@JSGlobal("CharacterData")
@js.native
class CharacterDataCls () extends CharacterData {
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

@JSGlobal("CharacterData")
@js.native
object CharacterData
  extends org.scalablytyped.runtime.Instantiable0[CharacterData]

