package typings.saxes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("saxes", "SaxesParser")
@js.native
/**
  * @param opt The parser options.
  */
open class SaxesParser[O /* <: SaxesOptions */] () extends StObject {
  def this(opt: O) = this()
  
  /**
    * A map of entity name to expansion.
    */
  var ENTITIES: Record[String, String] = js.native
  
  /* private */ var _closed: Any = js.native
  
  def _init(): Unit = js.native
  
  /* private */ var attribList: Any = js.native
  
  /* private */ var attributeHandler: Any = js.native
  
  /**
    * Capture characters that satisfy ``isNameChar`` into the ``name`` field of
    * this parser.
    *
    * @return The character code that made the test fail, or ``EOC`` if we hit
    * the end of the chunk. The return value cannot be NL_LIKE: NL is returned
    * instead.
    */
  /* private */ var captureNameChars: Any = js.native
  
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
  /* private */ var captureTo: Any = js.native
  
  /**
    * Capture characters into a buffer until encountering a character.
    *
    * @param char The codepoint that ends the capture. **NOTE ``char`` MAY NOT
    * CONTAIN ``NL``.** Passing ``NL`` will result in buggy behavior.
    *
    * @return ``true`` if we ran into the character. Otherwise, we ran into the
    * end of the current chunk.
    */
  /* private */ var captureToChar: Any = js.native
  
  /* private */ var carriedFromPrevious: Any = js.native
  
  /* private */ var cdataHandler: Any = js.native
  
  /* private */ var chunk: Any = js.native
  
  /* private */ var chunkPosition: Any = js.native
  
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
  /* private */ var closeTag: Any = js.native
  
  /* private */ var closeTagHandler: Any = js.native
  
  /**
    * Indicates whether or not the parser is closed. If ``true``, wait for
    * the ``ready`` event to write again.
    */
  def closed: Boolean = js.native
  
  /* private */ var closedRoot: Any = js.native
  
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
  
  /* private */ var commentHandler: Any = js.native
  
  /* private */ var currentXMLVersion: Any = js.native
  
  /* private */ var doctype: Any = js.native
  
  /* private */ var doctypeHandler: Any = js.native
  
  /**
    * End parsing. This performs final well-formedness checks and resets the
    * parser to a clean state.
    *
    * @returns this
    */
  /* private */ var end: Any = js.native
  
  /* private */ var endHandler: Any = js.native
  
  /* private */ var entity: Any = js.native
  
  /* private */ var entityReturnState: Any = js.native
  
  /* private */ var errorHandler: Any = js.native
  
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
  
  /* private */ val fileName: Any = js.native
  
  /* private */ var forbiddenState: Any = js.native
  
  /* private */ val fragmentOpt: Any = js.native
  
  /* private */ var getCode: Any = js.native
  
  /**
    * Get a single code point out of the current chunk. This updates the current
    * position if we do position tracking.
    *
    * This is the algorithm to use for XML 1.0.
    *
    * @returns The character read.
    */
  /* private */ var getCode10: Any = js.native
  
  /**
    * Get a single code point out of the current chunk. This updates the current
    * position if we do position tracking.
    *
    * This is the algorithm to use for XML 1.1.
    *
    * @returns {number} The character read.
    */
  /* private */ var getCode11: Any = js.native
  
  /**
    * Like ``getCode`` but with the return value normalized so that ``NL`` is
    * returned for ``NL_LIKE``.
    */
  /* private */ var getCodeNorm: Any = js.native
  
  /* private */ var handleTextInRoot: Any = js.native
  
  /* private */ var handleTextOutsideRoot: Any = js.native
  
  /* private */ var i: Any = js.native
  
  /* private */ var isChar: Any = js.native
  
  /* private */ val isName: Any = js.native
  
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
  def makeError(message: String): js.Error = js.native
  
  /* private */ var name: Any = js.native
  
  /* private */ val nameCheck: Any = js.native
  
  /* private */ val nameStartCheck: Any = js.native
  
  /* private */ val ns: Any = js.native
  
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
  /* private */ var openSelfClosingTag: Any = js.native
  
  /**
    * Handle a complete open tag. This parser code calls this once it has seen
    * the whole tag. This method checks for well-formeness and then emits
    * ``onopentag``.
    */
  /* private */ var openTag: Any = js.native
  
  /* private */ var openTagHandler: Any = js.native
  
  /* private */ var openTagStartHandler: Any = js.native
  
  /* private */ var openWakaBang: Any = js.native
  
  val opt: SaxesOptions = js.native
  
  /**
    * Resolves an entity. Makes any necessary well-formedness checks.
    *
    * @param entity The entity to resolve.
    *
    * @returns The parsed entity.
    */
  /* private */ var parseEntity: Any = js.native
  
  /* private */ var piHandler: Any = js.native
  
  /* private */ var piTarget: Any = js.native
  
  /**
    * The stream position the parser is currently looking at. This field is
    * zero-based.
    *
    * This field is not based on counting Unicode characters but is to be
    * interpreted as a plain index into a JavaScript string.
    */
  def position: Double = js.native
  
  /* private */ var positionAtNewLine: Any = js.native
  
  /* private */ var prevI: Any = js.native
  
  /* private */ var processAttribs: Any = js.native
  
  /* private */ var processAttribsNS: Any = js.native
  
  /* private */ var processAttribsPlain: Any = js.native
  
  /* private */ var pushAttrib: Any = js.native
  
  /* private */ var pushAttribNS: Any = js.native
  
  /* private */ var pushAttribPlain: Any = js.native
  
  /* private */ var q: Any = js.native
  
  /**
    * Parse a qname into its prefix and local name parts.
    *
    * @param name The name to parse
    *
    * @returns
    */
  /* private */ var qname: Any = js.native
  
  /* private */ var readyHandler: Any = js.native
  
  /* private */ var reportedTextAfterRoot: Any = js.native
  
  /* private */ var reportedTextBeforeRoot: Any = js.native
  
  /**
    * Resolve a namespace prefix.
    *
    * @param prefix The prefix to resolve.
    *
    * @returns The namespace URI or ``undefined`` if the prefix is not defined.
    */
  def resolve(prefix: String): js.UndefOr[String] = js.native
  
  /* private */ var sAttrib: Any = js.native
  
  /* private */ var sAttribName: Any = js.native
  
  /* private */ var sAttribNameSawWhite: Any = js.native
  
  /* private */ var sAttribValue: Any = js.native
  
  /* private */ var sAttribValueClosed: Any = js.native
  
  /* private */ var sAttribValueQuoted: Any = js.native
  
  /* private */ var sAttribValueUnquoted: Any = js.native
  
  /* private */ var sBegin: Any = js.native
  
  /* private */ var sBeginWhitespace: Any = js.native
  
  /* private */ var sCData: Any = js.native
  
  /* private */ var sCDataEnding: Any = js.native
  
  /* private */ var sCDataEnding2: Any = js.native
  
  /* private */ var sCloseTag: Any = js.native
  
  /* private */ var sCloseTagSawWhite: Any = js.native
  
  /* private */ var sComment: Any = js.native
  
  /* private */ var sCommentEnded: Any = js.native
  
  /* private */ var sCommentEnding: Any = js.native
  
  /* private */ var sDTD: Any = js.native
  
  /* private */ var sDTDComment: Any = js.native
  
  /* private */ var sDTDCommentEnded: Any = js.native
  
  /* private */ var sDTDCommentEnding: Any = js.native
  
  /* private */ var sDTDOpenWaka: Any = js.native
  
  /* private */ var sDTDOpenWakaBang: Any = js.native
  
  /* private */ var sDTDPI: Any = js.native
  
  /* private */ var sDTDPIEnding: Any = js.native
  
  /* private */ var sDTDQuoted: Any = js.native
  
  /* private */ var sDoctype: Any = js.native
  
  /* private */ var sDoctypeQuote: Any = js.native
  
  /* private */ var sEntity: Any = js.native
  
  /* private */ var sOpenTag: Any = js.native
  
  /* private */ var sOpenTagSlash: Any = js.native
  
  /* private */ var sOpenWaka: Any = js.native
  
  /* private */ var sOpenWakaBang: Any = js.native
  
  /* private */ var sPIBody: Any = js.native
  
  /* private */ var sPIEnding: Any = js.native
  
  /* private */ var sPIFirstChar: Any = js.native
  
  /* private */ var sPIRest: Any = js.native
  
  /* private */ var sText: Any = js.native
  
  /* private */ var sXMLDeclEnding: Any = js.native
  
  /* private */ var sXMLDeclEq: Any = js.native
  
  /* private */ var sXMLDeclName: Any = js.native
  
  /* private */ var sXMLDeclNameStart: Any = js.native
  
  /* private */ var sXMLDeclSeparator: Any = js.native
  
  /* private */ var sXMLDeclValue: Any = js.native
  
  /* private */ var sXMLDeclValueStart: Any = js.native
  
  /* private */ var sawRoot: Any = js.native
  
  /* private */ var setXMLVersion: Any = js.native
  
  /**
    * Skip white spaces.
    *
    * @return The character that ended the skip, or ``EOC`` if we hit
    * the end of the chunk. The return value cannot be NL_LIKE: NL is returned
    * instead.
    */
  /* private */ var skipSpaces: Any = js.native
  
  /* private */ var state: Any = js.native
  
  /* private */ val stateTable: Any = js.native
  
  /* private */ var tag: Any = js.native
  
  /* private */ var tags: Any = js.native
  
  /* private */ var text: Any = js.native
  
  /* private */ var textHandler: Any = js.native
  
  /* private */ var topNS: Any = js.native
  
  /* private */ val trackPosition: Any = js.native
  
  /* private */ var unget: Any = js.native
  
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
  
  /* private */ var xmlDeclExpects: Any = js.native
  
  /* private */ var xmlDeclPossible: Any = js.native
  
  /* private */ var xmldeclHandler: Any = js.native
  
  /* private */ val xmlnsOpt: Any = js.native
}
