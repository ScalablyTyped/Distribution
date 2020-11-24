package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a writer that provides a set of methods to append text in XML format. Use the static SP.XmlWriter.create(sb) Method to create an SP.XmlWriter object with the Sys.StringBuilder object you pass in. */
@js.native
trait XmlWriter extends js.Object {
  
  /** This member is reserved for internal use and is not intended to be used directly from your code. */
  def close(): Unit = js.native
  
  /** Appends an attribute with the specified name and value in XML format to the object?s string builder. */
  def writeAttributeString(localName: String, value: String): Unit = js.native
  
  /** Appends an element with the specified tag name and value in XML format to the string builder. */
  def writeElementString(tagName: String, value: String): Unit = js.native
  
  /** Appends an end of an attribute in XML format to the object?s string builder. */
  def writeEndAttribute(): Unit = js.native
  
  /** Appends an end element tag in XML format to the object?s string builder. This method appends the end element tag ?/>? if the start element tag is not closed; otherwise, it appends a full end element tag ?</tagName>? to the string builder. */
  def writeEndElement(): Unit = js.native
  
  /** Appends the specified text to the object?s string builder. */
  def writeRaw(xml: String): Unit = js.native
  
  /** This method only appends the name of the attribute. You can append the value of the attribute by calling the SP.XmlWriter.writeString(value) Method, and close the attribute by calling the SP.XmlWriter.writeEndAttribute() Method. */
  def writeStartAttribute(localName: String): Unit = js.native
  
  /** Appends a start element tag with the specified name in XML format to the object?s string builder. */
  def writeStartElement(tagName: String): Unit = js.native
  
  /** Appends the specified value for an element tag or attribute to the object?s string builder. */
  def writeString(value: String): Unit = js.native
}
object XmlWriter {
  
  @scala.inline
  def apply(
    close: () => Unit,
    writeAttributeString: (String, String) => Unit,
    writeElementString: (String, String) => Unit,
    writeEndAttribute: () => Unit,
    writeEndElement: () => Unit,
    writeRaw: String => Unit,
    writeStartAttribute: String => Unit,
    writeStartElement: String => Unit,
    writeString: String => Unit
  ): XmlWriter = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), writeAttributeString = js.Any.fromFunction2(writeAttributeString), writeElementString = js.Any.fromFunction2(writeElementString), writeEndAttribute = js.Any.fromFunction0(writeEndAttribute), writeEndElement = js.Any.fromFunction0(writeEndElement), writeRaw = js.Any.fromFunction1(writeRaw), writeStartAttribute = js.Any.fromFunction1(writeStartAttribute), writeStartElement = js.Any.fromFunction1(writeStartElement), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[XmlWriter]
  }
  
  @scala.inline
  implicit class XmlWriterOps[Self <: XmlWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteAttributeString(value: (String, String) => Unit): Self = this.set("writeAttributeString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteElementString(value: (String, String) => Unit): Self = this.set("writeElementString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteEndAttribute(value: () => Unit): Self = this.set("writeEndAttribute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteEndElement(value: () => Unit): Self = this.set("writeEndElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteRaw(value: String => Unit): Self = this.set("writeRaw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteStartAttribute(value: String => Unit): Self = this.set("writeStartAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteStartElement(value: String => Unit): Self = this.set("writeStartElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteString(value: String => Unit): Self = this.set("writeString", js.Any.fromFunction1(value))
  }
}
