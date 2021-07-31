package typings.sharepoint.global.SP

import typings.microsoftAjax.Sys.StringBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a writer that provides a set of methods to append text in XML format. Use the static SP.XmlWriter.create(sb) Method to create an SP.XmlWriter object with the Sys.StringBuilder object you pass in. */
@JSGlobal("SP.XmlWriter")
@js.native
class XmlWriter ()
  extends StObject
     with typings.sharepoint.SP.XmlWriter {
  
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Appends an attribute with the specified name and value in XML format to the object?s string builder. */
  /* CompleteClass */
  override def writeAttributeString(localName: String, value: String): Unit = js.native
  
  /** Appends an element with the specified tag name and value in XML format to the string builder. */
  /* CompleteClass */
  override def writeElementString(tagName: String, value: String): Unit = js.native
  
  /** Appends an end of an attribute in XML format to the object?s string builder. */
  /* CompleteClass */
  override def writeEndAttribute(): Unit = js.native
  
  /** Appends an end element tag in XML format to the object?s string builder. This method appends the end element tag ?/>? if the start element tag is not closed; otherwise, it appends a full end element tag ?</tagName>? to the string builder. */
  /* CompleteClass */
  override def writeEndElement(): Unit = js.native
  
  /** Appends the specified text to the object?s string builder. */
  /* CompleteClass */
  override def writeRaw(xml: String): Unit = js.native
  
  /** This method only appends the name of the attribute. You can append the value of the attribute by calling the SP.XmlWriter.writeString(value) Method, and close the attribute by calling the SP.XmlWriter.writeEndAttribute() Method. */
  /* CompleteClass */
  override def writeStartAttribute(localName: String): Unit = js.native
  
  /** Appends a start element tag with the specified name in XML format to the object?s string builder. */
  /* CompleteClass */
  override def writeStartElement(tagName: String): Unit = js.native
  
  /** Appends the specified value for an element tag or attribute to the object?s string builder. */
  /* CompleteClass */
  override def writeString(value: String): Unit = js.native
}
object XmlWriter {
  
  @JSGlobal("SP.XmlWriter")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates a new instance of the XmlWriter class with the specified string builder. */
  /* static member */
  @scala.inline
  def create(sb: StringBuilder): typings.sharepoint.SP.XmlWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(sb.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.XmlWriter]
}
