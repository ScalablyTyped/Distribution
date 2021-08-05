package typings.scriptableIos

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
trait XMLParser extends StObject {
  
  /**
    * _Function called when the parser ends parsing a document._
    *
    * When the parser calls the function, it has successfully completed parsing the document.
    * @see https://docs.scriptable.app/xmlparser/#didenddocument
    */
  def didEndDocument(): Unit
  
  /**
    * _Function called when ended parsing an element._
    *
    * Called by the parser when it encounters an end tag for an element. The function takes the element name as a parameter.
    * @see https://docs.scriptable.app/xmlparser/#didendelement
    */
  def didEndElement(arg0: String): Unit
  
  /**
    * _Function called when the parser begins parsing a document._
    * @see https://docs.scriptable.app/xmlparser/#didstartdocument
    */
  def didStartDocument(): Unit
  
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
  def didStartElement(arg0: String, arg1: StringDictionary[String]): Unit
  
  /**
    * _Function called when the parser finds characters of an element._
    *
    * The parser calls this function with a string whenever it finds characters for the current element. This function may be called several times for a single element.
    * @see https://docs.scriptable.app/xmlparser/#foundcharacters
    */
  def foundCharacters(arg0: String): Unit
  
  /**
    * _Starts parsing._
    *
    * Before calling this function you should ensure that the parser is correctly configured, i.e. the necessary callback functions should be set.
    * @see https://docs.scriptable.app/xmlparser/#-parse
    */
  def parse(): Boolean
  
  /**
    * _Function called when the parser encounters an error._
    *
    * The parser will call this function when it encounters a fatal error preventing it from continuing to parse. When the function is called the parsing is stopped.
    * @see https://docs.scriptable.app/xmlparser/#parseerroroccurred
    */
  def parseErrorOccurred(arg0: String): Unit
  
  /**
    * _XML string to be parsed._
    * @see https://docs.scriptable.app/xmlparser/#string
    */
  var string: String
}
object XMLParser {
  
  inline def apply(
    didEndDocument: () => Unit,
    didEndElement: String => Unit,
    didStartDocument: () => Unit,
    didStartElement: (String, StringDictionary[String]) => Unit,
    foundCharacters: String => Unit,
    parse: () => Boolean,
    parseErrorOccurred: String => Unit,
    string: String
  ): XMLParser = {
    val __obj = js.Dynamic.literal(didEndDocument = js.Any.fromFunction0(didEndDocument), didEndElement = js.Any.fromFunction1(didEndElement), didStartDocument = js.Any.fromFunction0(didStartDocument), didStartElement = js.Any.fromFunction2(didStartElement), foundCharacters = js.Any.fromFunction1(foundCharacters), parse = js.Any.fromFunction0(parse), parseErrorOccurred = js.Any.fromFunction1(parseErrorOccurred), string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLParser]
  }
  
  extension [Self <: XMLParser](x: Self) {
    
    inline def setDidEndDocument(value: () => Unit): Self = StObject.set(x, "didEndDocument", js.Any.fromFunction0(value))
    
    inline def setDidEndElement(value: String => Unit): Self = StObject.set(x, "didEndElement", js.Any.fromFunction1(value))
    
    inline def setDidStartDocument(value: () => Unit): Self = StObject.set(x, "didStartDocument", js.Any.fromFunction0(value))
    
    inline def setDidStartElement(value: (String, StringDictionary[String]) => Unit): Self = StObject.set(x, "didStartElement", js.Any.fromFunction2(value))
    
    inline def setFoundCharacters(value: String => Unit): Self = StObject.set(x, "foundCharacters", js.Any.fromFunction1(value))
    
    inline def setParse(value: () => Boolean): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    
    inline def setParseErrorOccurred(value: String => Unit): Self = StObject.set(x, "parseErrorOccurred", js.Any.fromFunction1(value))
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
