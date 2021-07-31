package typings.scriptableIos.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Event driven XML parser._
  *
  * Constructs an event driven XML parser. It does not do any parsing on its own and therefore the callback functions must be set before starting to parse.
  * @see https://docs.scriptable.app/xmlparser/#-new-xmlparser
  */
@JSGlobal("XMLParser")
@js.native
class XMLParser protected ()
  extends StObject
     with typings.scriptableIos.XMLParser {
  /**
    * _Event driven XML parser._
    *
    * Constructs an event driven XML parser. It does not do any parsing on its own and therefore the callback functions must be set before starting to parse.
    * @param string - XML string to be parsed.
    * @see https://docs.scriptable.app/xmlparser/#-new-xmlparser
    */
  def this(string: String) = this()
  
  /**
    * _Function called when the parser ends parsing a document._
    *
    * When the parser calls the function, it has successfully completed parsing the document.
    * @see https://docs.scriptable.app/xmlparser/#didenddocument
    */
  /* CompleteClass */
  override def didEndDocument(): Unit = js.native
  
  /**
    * _Function called when ended parsing an element._
    *
    * Called by the parser when it encounters an end tag for an element. The function takes the element name as a parameter.
    * @see https://docs.scriptable.app/xmlparser/#didendelement
    */
  /* CompleteClass */
  override def didEndElement(arg0: String): Unit = js.native
  
  /**
    * _Function called when the parser begins parsing a document._
    * @see https://docs.scriptable.app/xmlparser/#didstartdocument
    */
  /* CompleteClass */
  override def didStartDocument(): Unit = js.native
  
  /**
    * _Function called when starting to parse an element._
    *
    * Called by the parser when it encounters a start tag for an element. The function takes the element name as a parameter as well as a key value pair containing all the attributes
    * associated with the element.
    *
    * Use this function to update your state and prepare for receiving the characters of the element. After this function is called, the parser will call the foundCharacters callback
    * function with all or parts of the characters of the element.
    * @see https://docs.scriptable.app/xmlparser/#didstartelement
    */
  /* CompleteClass */
  override def didStartElement(arg0: String, arg1: StringDictionary[String]): Unit = js.native
  
  /**
    * _Function called when the parser finds characters of an element._
    *
    * The parser calls this function with a string whenever it finds characters for the current element. This function may be called several times for a single element.
    * @see https://docs.scriptable.app/xmlparser/#foundcharacters
    */
  /* CompleteClass */
  override def foundCharacters(arg0: String): Unit = js.native
  
  /**
    * _Starts parsing._
    *
    * Before calling this function you should ensure that the parser is correctly configured, i.e. the necessary callback functions should be set.
    * @see https://docs.scriptable.app/xmlparser/#-parse
    */
  /* CompleteClass */
  override def parse(): Boolean = js.native
  
  /**
    * _Function called when the parser encounters an error._
    *
    * The parser will call this function when it encounters a fatal error preventing it from continuing to parse. When the function is called the parsing is stopped.
    * @see https://docs.scriptable.app/xmlparser/#parseerroroccurred
    */
  /* CompleteClass */
  override def parseErrorOccurred(arg0: String): Unit = js.native
  
  /**
    * _XML string to be parsed._
    * @see https://docs.scriptable.app/xmlparser/#string
    */
  /* CompleteClass */
  var string: String = js.native
}
