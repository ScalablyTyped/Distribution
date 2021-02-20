package typings.saxes.mod

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("saxes", "SaxesParser")
@js.native
/**
  * @param opt The parser options.
  */
class SaxesParser[O /* <: SaxesOptions */] () extends StObject {
  def this(opt: O) = this()
  
  /**
    * A map of entity name to expansion.
    */
  var ENTITIES: Record[String, String] = js.native
  
  var _closed: js.Any = js.native
  
  def _init(): Unit = js.native
  
  var attribList: js.Any = js.native
  
  var attributeHandler: js.Any = js.native
  
  /**
    * Capture characters that satisfy ``isNameChar`` into the ``name`` field of
    * this parser.
    *
    * @return The character code that made the test fail, or ``EOC`` if we hit
    * the end of the chunk. The return value cannot be NL_LIKE: NL is returned
    * instead.
    */
  var captureNameChars: js.Any = js.native
  
  /**
    * Capture characters into a buffer until encountering one of a set of
    * characters.
    *
    * @param chars An array of codepoints. Encountering a character in the array
    * ends the capture. (``chars`` may safely contain ``NL``.)
    *
    * @return The character code that made the capture end, or ``EOC`` if we hit
    * the end of the chunk. The return value cannot be NL_LIKE: NL is returned
    * instead.
    */
  var captureTo: js.Any = js.native
  
  /**
    * Capture characters into a buffer until encountering a character.
    *
    * @param char The codepoint that ends the capture. **NOTE ``char`` MAY NOT
    * CONTAIN ``NL``.** Passing ``NL`` will result in buggy behavior.
    *
    * @return ``true`` if we ran into the character. Otherwise, we ran into the
    * end of the current chunk.
    */
  var captureToChar: js.Any = js.native
  
  var carriedFromPrevious: js.Any = js.native
  
  var cdataHandler: js.Any = js.native
  
  var chunk: js.Any = js.native
  
  var chunkPosition: js.Any = js.native
  
  /**
    * Close the current stream. Perform final well-formedness checks and reset
    * the parser tstate.
    *
    * @returns this
    */
  def close(): this.type = js.native
  
  /**
    * Handle a complete close tag. This parser code calls this once it has seen
    * the whole tag. This method checks for well-formeness and then emits
    * ``onclosetag``.
    */
  var closeTag: js.Any = js.native
  
  var closeTagHandler: js.Any = js.native
  
  /**
    * Indicates whether or not the parser is closed. If ``true``, wait for
    * the ``ready`` event to write again.
    */
  def closed: Boolean = js.native
  
  var closedRoot: js.Any = js.native
  
  /**
    * The column number of the next character to be read by the parser.  *
    * This field is zero-based. (The first column is 0.)
    *
    * This field counts columns by *Unicode character*. Note that this *can*
    * be different from the index of the character in a JavaScript string due
    * to how JavaScript handles astral plane characters.
    *
    * See [[columnIndex]] for a number that corresponds to the JavaScript index.
    */
  var column: Double = js.native
  
  /**
    * The column number of the next character to be read by the parser.  *
    * This field is zero-based. (The first column in a line is 0.)
    *
    * This field reports the index at which the next character would be in the
    * line if the line were represented as a JavaScript string.  Note that this
    * *can* be different to a count based on the number of *Unicode characters*
    * due to how JavaScript handles astral plane characters.
    *
    * See [[column]] for a number that corresponds to a count of Unicode
    * characters.
    */
  def columnIndex: Double = js.native
  
  var commentHandler: js.Any = js.native
  
  var currentXMLVersion: js.Any = js.native
  
  var doctype: js.Any = js.native
  
  var doctypeHandler: js.Any = js.native
  
  /**
    * End parsing. This performs final well-formedness checks and resets the
    * parser to a clean state.
    *
    * @returns this
    */
  var end: js.Any = js.native
  
  var endHandler: js.Any = js.native
  
  var entity: js.Any = js.native
  
  var entityReturnState: js.Any = js.native
  
  var errorHandler: js.Any = js.native
  
  /**
    * Report a parsing error. This method is made public so that client code may
    * check for issues that are outside the scope of this project and can report
    * errors.
    *
    * @param message The error to report.
    *
    * @returns this
    */
  def fail(message: String): this.type = js.native
  
  val fileName: js.Any = js.native
  
  var forbiddenState: js.Any = js.native
  
  val fragmentOpt: js.Any = js.native
  
  var getCode: js.Any = js.native
  
  /**
    * Get a single code point out of the current chunk. This updates the current
    * position if we do position tracking.
    *
    * This is the algorithm to use for XML 1.0.
    *
    * @returns The character read.
    */
  var getCode10: js.Any = js.native
  
  /**
    * Get a single code point out of the current chunk. This updates the current
    * position if we do position tracking.
    *
    * This is the algorithm to use for XML 1.1.
    *
    * @returns {number} The character read.
    */
  var getCode11: js.Any = js.native
  
  /**
    * Like ``getCode`` but with the return value normalized so that ``NL`` is
    * returned for ``NL_LIKE``.
    */
  var getCodeNorm: js.Any = js.native
  
  var handleTextInRoot: js.Any = js.native
  
  var handleTextOutsideRoot: js.Any = js.native
  
  var i: js.Any = js.native
  
  var isChar: js.Any = js.native
  
  val isName: js.Any = js.native
  
  /**
    * The line number of the next character to be read by the parser. This field
    * is one-based. (The first line is numbered 1.)
    */
  var line: Double = js.native
  
  /**
    * Make an error object. The error object will have a message that contains
    * the ``fileName`` option passed at the creation of the parser. If position
    * tracking was turned on, it will also have line and column number
    * information.
    *
    * @param message The message describing the error to report.
    *
    * @returns An error object with a properly formatted message.
    */
  def makeError(message: String): Error = js.native
  
  var name: js.Any = js.native
  
  val nameCheck: js.Any = js.native
  
  val nameStartCheck: js.Any = js.native
  
  val ns: js.Any = js.native
  
  /**
    * Unset an event handler.
    *
    * @parma name The event to stop listening to.
    */
  def off(name: EventName): Unit = js.native
  
  /**
    * Set an event listener on an event. The parser supports one handler per
    * event type. If you try to set an event handler over an existing handler,
    * the old handler is silently overwritten.
    *
    * @param name The event to listen to.
    *
    * @param handler The handler to set.
    */
  def on[N /* <: EventName */](name: N, handler: EventNameToHandler[O, N]): Unit = js.native
  
  /**
    * Handle a complete self-closing tag. This parser code calls this once it has
    * seen the whole tag. This method checks for well-formeness and then emits
    * ``onopentag`` and ``onclosetag``.
    */
  var openSelfClosingTag: js.Any = js.native
  
  /**
    * Handle a complete open tag. This parser code calls this once it has seen
    * the whole tag. This method checks for well-formeness and then emits
    * ``onopentag``.
    */
  var openTag: js.Any = js.native
  
  var openTagHandler: js.Any = js.native
  
  var openTagStartHandler: js.Any = js.native
  
  var openWakaBang: js.Any = js.native
  
  val opt: SaxesOptions = js.native
  
  /**
    * Resolves an entity. Makes any necessary well-formedness checks.
    *
    * @param entity The entity to resolve.
    *
    * @returns The parsed entity.
    */
  var parseEntity: js.Any = js.native
  
  var piHandler: js.Any = js.native
  
  var piTarget: js.Any = js.native
  
  /**
    * The stream position the parser is currently looking at. This field is
    * zero-based.
    *
    * This field is not based on counting Unicode characters but is to be
    * interpreted as a plain index into a JavaScript string.
    */
  def position: Double = js.native
  
  var positionAtNewLine: js.Any = js.native
  
  var prevI: js.Any = js.native
  
  var processAttribs: js.Any = js.native
  
  var processAttribsNS: js.Any = js.native
  
  var processAttribsPlain: js.Any = js.native
  
  var pushAttrib: js.Any = js.native
  
  var pushAttribNS: js.Any = js.native
  
  var pushAttribPlain: js.Any = js.native
  
  var q: js.Any = js.native
  
  /**
    * Parse a qname into its prefix and local name parts.
    *
    * @param name The name to parse
    *
    * @returns
    */
  var qname: js.Any = js.native
  
  var readyHandler: js.Any = js.native
  
  var reportedTextAfterRoot: js.Any = js.native
  
  var reportedTextBeforeRoot: js.Any = js.native
  
  /**
    * Resolve a namespace prefix.
    *
    * @param prefix The prefix to resolve.
    *
    * @returns The namespace URI or ``undefined`` if the prefix is not defined.
    */
  def resolve(prefix: String): js.UndefOr[String] = js.native
  
  var sAttrib: js.Any = js.native
  
  var sAttribName: js.Any = js.native
  
  var sAttribNameSawWhite: js.Any = js.native
  
  var sAttribValue: js.Any = js.native
  
  var sAttribValueClosed: js.Any = js.native
  
  var sAttribValueQuoted: js.Any = js.native
  
  var sAttribValueUnquoted: js.Any = js.native
  
  var sBegin: js.Any = js.native
  
  var sBeginWhitespace: js.Any = js.native
  
  var sCData: js.Any = js.native
  
  var sCDataEnding: js.Any = js.native
  
  var sCDataEnding2: js.Any = js.native
  
  var sCloseTag: js.Any = js.native
  
  var sCloseTagSawWhite: js.Any = js.native
  
  var sComment: js.Any = js.native
  
  var sCommentEnded: js.Any = js.native
  
  var sCommentEnding: js.Any = js.native
  
  var sDTD: js.Any = js.native
  
  var sDTDComment: js.Any = js.native
  
  var sDTDCommentEnded: js.Any = js.native
  
  var sDTDCommentEnding: js.Any = js.native
  
  var sDTDOpenWaka: js.Any = js.native
  
  var sDTDOpenWakaBang: js.Any = js.native
  
  var sDTDPI: js.Any = js.native
  
  var sDTDPIEnding: js.Any = js.native
  
  var sDTDQuoted: js.Any = js.native
  
  var sDoctype: js.Any = js.native
  
  var sDoctypeQuote: js.Any = js.native
  
  var sEntity: js.Any = js.native
  
  var sOpenTag: js.Any = js.native
  
  var sOpenTagSlash: js.Any = js.native
  
  var sOpenWaka: js.Any = js.native
  
  var sOpenWakaBang: js.Any = js.native
  
  var sPIBody: js.Any = js.native
  
  var sPIEnding: js.Any = js.native
  
  var sPIFirstChar: js.Any = js.native
  
  var sPIRest: js.Any = js.native
  
  var sText: js.Any = js.native
  
  var sXMLDeclEnding: js.Any = js.native
  
  var sXMLDeclEq: js.Any = js.native
  
  var sXMLDeclName: js.Any = js.native
  
  var sXMLDeclNameStart: js.Any = js.native
  
  var sXMLDeclSeparator: js.Any = js.native
  
  var sXMLDeclValue: js.Any = js.native
  
  var sXMLDeclValueStart: js.Any = js.native
  
  var sawRoot: js.Any = js.native
  
  var setXMLVersion: js.Any = js.native
  
  /**
    * Skip white spaces.
    *
    * @return The character that ended the skip, or ``EOC`` if we hit
    * the end of the chunk. The return value cannot be NL_LIKE: NL is returned
    * instead.
    */
  var skipSpaces: js.Any = js.native
  
  var state: js.Any = js.native
  
  val stateTable: js.Any = js.native
  
  var tag: js.Any = js.native
  
  var tags: js.Any = js.native
  
  var text: js.Any = js.native
  
  var textHandler: js.Any = js.native
  
  var topNS: js.Any = js.native
  
  val trackPosition: js.Any = js.native
  
  var unget: js.Any = js.native
  
  /**
    * Write a XML data to the parser.
    *
    * @param chunk The XML data to write.
    *
    * @returns this
    */
  def write(): this.type = js.native
  def write(chunk: String): this.type = js.native
  def write(chunk: js.Object): this.type = js.native
  
  /**
    * The XML declaration for this document.
    */
  var xmlDecl: XMLDecl = js.native
  
  var xmlDeclExpects: js.Any = js.native
  
  var xmlDeclPossible: js.Any = js.native
  
  var xmldeclHandler: js.Any = js.native
  
  val xmlnsOpt: js.Any = js.native
}
