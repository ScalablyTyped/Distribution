package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type CharacterData: it is implemented by other interfaces, like Text, Comment, or ProcessingInstruction which aren't abstract.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData)
  */
@js.native
trait CharacterData
  extends StObject
     with ChildNode
     with NonDocumentTypeChildNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/appendData) */
  /* standard dom */
  def appendData(data: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/data) */
  /* standard dom */
  var data: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/deleteData) */
  /* standard dom */
  def deleteData(offset: Double, count: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/insertData) */
  /* standard dom */
  def insertData(offset: Double, data: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/length) */
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_CharacterData: Document = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceData) */
  /* standard dom */
  def replaceData(offset: Double, count: Double, data: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/substringData) */
  /* standard dom */
  def substringData(offset: Double, count: Double): java.lang.String = js.native
}
