package typings.sharepoint.SPNs

import typings.microsoftDashAjax.SysNs.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a writer that provides a set of methods to append text in XML format. Use the static SP.XmlWriter.create(sb) Method to create an SP.XmlWriter object with the Sys.StringBuilder object you pass in. */
@JSGlobal("SP.XmlWriter")
@js.native
class XmlWriter () extends js.Object {
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

/* static members */
@JSGlobal("SP.XmlWriter")
@js.native
object XmlWriter extends js.Object {
  /** Creates a new instance of the XmlWriter class with the specified string builder. */
  def create(sb: StringBuilder): XmlWriter = js.native
}

