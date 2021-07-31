package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract. */
@js.native
trait CharacterData
  extends StObject
     with ChildNode
     with NonDocumentTypeChildNode {
  
  def appendData(data: java.lang.String): Unit = js.native
  
  var data: java.lang.String = js.native
  
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  def insertData(offset: Double, data: java.lang.String): Unit = js.native
  
  val length: Double = js.native
  
  @JSName("ownerDocument")
  val ownerDocument_CharacterData: Document = js.native
  
  def replaceData(offset: Double, count: Double, data: java.lang.String): Unit = js.native
  
  def substringData(offset: Double, count: Double): java.lang.String = js.native
}
