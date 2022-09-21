package typings.rehypeParse

import typings.hastUtilFromParse5.libMod.Space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("rehype-parse/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(options: Unit): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* keyof rehype-parse.anon.AbandonedHeadElementChild */ /* Rewritten from type alias, can be one of: 
    - typings.rehypeParse.rehypeParseStrings.abandonedHeadElementChild
    - typings.rehypeParse.rehypeParseStrings.abruptClosingOfEmptyComment
    - typings.rehypeParse.rehypeParseStrings.abruptDoctypePublicIdentifier
    - typings.rehypeParse.rehypeParseStrings.abruptDoctypeSystemIdentifier
    - typings.rehypeParse.rehypeParseStrings.absenceOfDigitsInNumericCharacterReference
    - typings.rehypeParse.rehypeParseStrings.cdataInHtmlContent
    - typings.rehypeParse.rehypeParseStrings.characterReferenceOutsideUnicodeRange
    - typings.rehypeParse.rehypeParseStrings.closingOfElementWithOpenChildElements
    - typings.rehypeParse.rehypeParseStrings.controlCharacterInInputStream
    - typings.rehypeParse.rehypeParseStrings.controlCharacterReference
    - typings.rehypeParse.rehypeParseStrings.disallowedContentInNoscriptInHead
    - typings.rehypeParse.rehypeParseStrings.duplicateAttribute
    - typings.rehypeParse.rehypeParseStrings.endTagWithAttributes
    - typings.rehypeParse.rehypeParseStrings.endTagWithTrailingSolidus
    - typings.rehypeParse.rehypeParseStrings.endTagWithoutMatchingOpenElement
    - typings.rehypeParse.rehypeParseStrings.eofBeforeTagName
    - typings.rehypeParse.rehypeParseStrings.eofInCdata
    - typings.rehypeParse.rehypeParseStrings.eofInComment
    - typings.rehypeParse.rehypeParseStrings.eofInDoctype
    - typings.rehypeParse.rehypeParseStrings.eofInElementThatCanContainOnlyText
    - typings.rehypeParse.rehypeParseStrings.eofInScriptHtmlCommentLikeText
    - typings.rehypeParse.rehypeParseStrings.eofInTag
    - typings.rehypeParse.rehypeParseStrings.incorrectlyClosedComment
    - typings.rehypeParse.rehypeParseStrings.incorrectlyOpenedComment
    - typings.rehypeParse.rehypeParseStrings.invalidCharacterSequenceAfterDoctypeName
    - typings.rehypeParse.rehypeParseStrings.invalidFirstCharacterOfTagName
    - typings.rehypeParse.rehypeParseStrings.misplacedDoctype
    - typings.rehypeParse.rehypeParseStrings.misplacedStartTagForHeadElement
    - typings.rehypeParse.rehypeParseStrings.missingAttributeValue
    - typings.rehypeParse.rehypeParseStrings.missingDoctype
    - typings.rehypeParse.rehypeParseStrings.missingDoctypeName
    - typings.rehypeParse.rehypeParseStrings.missingDoctypePublicIdentifier
    - typings.rehypeParse.rehypeParseStrings.missingDoctypeSystemIdentifier
    - typings.rehypeParse.rehypeParseStrings.missingEndTagName
    - typings.rehypeParse.rehypeParseStrings.missingQuoteBeforeDoctypePublicIdentifier
    - typings.rehypeParse.rehypeParseStrings.missingQuoteBeforeDoctypeSystemIdentifier
    - typings.rehypeParse.rehypeParseStrings.missingSemicolonAfterCharacterReference
    - typings.rehypeParse.rehypeParseStrings.missingWhitespaceAfterDoctypePublicKeyword
    - typings.rehypeParse.rehypeParseStrings.missingWhitespaceAfterDoctypeSystemKeyword
    - typings.rehypeParse.rehypeParseStrings.missingWhitespaceBeforeDoctypeName
    - typings.rehypeParse.rehypeParseStrings.missingWhitespaceBetweenAttributes
    - typings.rehypeParse.rehypeParseStrings.missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers
    - typings.rehypeParse.rehypeParseStrings.nestedComment
    - typings.rehypeParse.rehypeParseStrings.nestedNoscriptInHead
    - typings.rehypeParse.rehypeParseStrings.nonConformingDoctype
    - typings.rehypeParse.rehypeParseStrings.nonVoidHtmlElementStartTagWithTrailingSolidus
    - typings.rehypeParse.rehypeParseStrings.noncharacterCharacterReference
    - typings.rehypeParse.rehypeParseStrings.noncharacterInInputStream
    - typings.rehypeParse.rehypeParseStrings.nullCharacterReference
    - typings.rehypeParse.rehypeParseStrings.openElementsLeftAfterEof
    - typings.rehypeParse.rehypeParseStrings.surrogateCharacterReference
    - typings.rehypeParse.rehypeParseStrings.surrogateInInputStream
    - typings.rehypeParse.rehypeParseStrings.unexpectedCharacterAfterDoctypeSystemIdentifier
    - typings.rehypeParse.rehypeParseStrings.unexpectedCharacterInAttributeName
    - typings.rehypeParse.rehypeParseStrings.unexpectedCharacterInUnquotedAttributeValue
    - typings.rehypeParse.rehypeParseStrings.unexpectedEqualsSignBeforeAttributeName
    - typings.rehypeParse.rehypeParseStrings.unexpectedNullCharacter
    - typings.rehypeParse.rehypeParseStrings.unexpectedQuestionMarkInsteadOfTagName
    - typings.rehypeParse.rehypeParseStrings.unexpectedSolidusInTag
    - typings.rehypeParse.rehypeParseStrings.unknownNamedCharacterReference
  */
  trait ErrorCode extends StObject
  
  /* Inlined std.Partial<std.Record<rehype-parse.rehype-parse/lib.ErrorCode, rehype-parse.rehype-parse/lib.ErrorSeverity>> */
  trait ErrorFields extends StObject {
    
    var abandonedHeadElementChild: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptClosingOfEmptyComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var absenceOfDigitsInNumericCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var cdataInHtmlContent: js.UndefOr[ErrorSeverity] = js.undefined
    
    var characterReferenceOutsideUnicodeRange: js.UndefOr[ErrorSeverity] = js.undefined
    
    var closingOfElementWithOpenChildElements: js.UndefOr[ErrorSeverity] = js.undefined
    
    var controlCharacterInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var controlCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var disallowedContentInNoscriptInHead: js.UndefOr[ErrorSeverity] = js.undefined
    
    var duplicateAttribute: js.UndefOr[ErrorSeverity] = js.undefined
    
    var endTagWithAttributes: js.UndefOr[ErrorSeverity] = js.undefined
    
    var endTagWithTrailingSolidus: js.UndefOr[ErrorSeverity] = js.undefined
    
    var endTagWithoutMatchingOpenElement: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofBeforeTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInCdata: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInElementThatCanContainOnlyText: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInScriptHtmlCommentLikeText: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInTag: js.UndefOr[ErrorSeverity] = js.undefined
    
    var incorrectlyClosedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var incorrectlyOpenedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var invalidCharacterSequenceAfterDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var invalidFirstCharacterOfTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var misplacedDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var misplacedStartTagForHeadElement: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingAttributeValue: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingEndTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingQuoteBeforeDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingQuoteBeforeDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingSemicolonAfterCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceAfterDoctypePublicKeyword: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceAfterDoctypeSystemKeyword: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBeforeDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBetweenAttributes: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nestedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nestedNoscriptInHead: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nonConformingDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nonVoidHtmlElementStartTagWithTrailingSolidus: js.UndefOr[ErrorSeverity] = js.undefined
    
    var noncharacterCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var noncharacterInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nullCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var openElementsLeftAfterEof: js.UndefOr[ErrorSeverity] = js.undefined
    
    var surrogateCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var surrogateInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterAfterDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterInAttributeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterInUnquotedAttributeValue: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedEqualsSignBeforeAttributeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedNullCharacter: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedQuestionMarkInsteadOfTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedSolidusInTag: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unknownNamedCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
  }
  object ErrorFields {
    
    inline def apply(): ErrorFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorFields]
    }
    
    extension [Self <: ErrorFields](x: Self) {
      
      inline def setAbandonedHeadElementChild(value: ErrorSeverity): Self = StObject.set(x, "abandonedHeadElementChild", value.asInstanceOf[js.Any])
      
      inline def setAbandonedHeadElementChildNull: Self = StObject.set(x, "abandonedHeadElementChild", null)
      
      inline def setAbandonedHeadElementChildUndefined: Self = StObject.set(x, "abandonedHeadElementChild", js.undefined)
      
      inline def setAbruptClosingOfEmptyComment(value: ErrorSeverity): Self = StObject.set(x, "abruptClosingOfEmptyComment", value.asInstanceOf[js.Any])
      
      inline def setAbruptClosingOfEmptyCommentNull: Self = StObject.set(x, "abruptClosingOfEmptyComment", null)
      
      inline def setAbruptClosingOfEmptyCommentUndefined: Self = StObject.set(x, "abruptClosingOfEmptyComment", js.undefined)
      
      inline def setAbruptDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "abruptDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAbruptDoctypePublicIdentifierNull: Self = StObject.set(x, "abruptDoctypePublicIdentifier", null)
      
      inline def setAbruptDoctypePublicIdentifierUndefined: Self = StObject.set(x, "abruptDoctypePublicIdentifier", js.undefined)
      
      inline def setAbruptDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "abruptDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAbruptDoctypeSystemIdentifierNull: Self = StObject.set(x, "abruptDoctypeSystemIdentifier", null)
      
      inline def setAbruptDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "abruptDoctypeSystemIdentifier", js.undefined)
      
      inline def setAbsenceOfDigitsInNumericCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setAbsenceOfDigitsInNumericCharacterReferenceNull: Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", null)
      
      inline def setAbsenceOfDigitsInNumericCharacterReferenceUndefined: Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", js.undefined)
      
      inline def setCdataInHtmlContent(value: ErrorSeverity): Self = StObject.set(x, "cdataInHtmlContent", value.asInstanceOf[js.Any])
      
      inline def setCdataInHtmlContentNull: Self = StObject.set(x, "cdataInHtmlContent", null)
      
      inline def setCdataInHtmlContentUndefined: Self = StObject.set(x, "cdataInHtmlContent", js.undefined)
      
      inline def setCharacterReferenceOutsideUnicodeRange(value: ErrorSeverity): Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", value.asInstanceOf[js.Any])
      
      inline def setCharacterReferenceOutsideUnicodeRangeNull: Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", null)
      
      inline def setCharacterReferenceOutsideUnicodeRangeUndefined: Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", js.undefined)
      
      inline def setClosingOfElementWithOpenChildElements(value: ErrorSeverity): Self = StObject.set(x, "closingOfElementWithOpenChildElements", value.asInstanceOf[js.Any])
      
      inline def setClosingOfElementWithOpenChildElementsNull: Self = StObject.set(x, "closingOfElementWithOpenChildElements", null)
      
      inline def setClosingOfElementWithOpenChildElementsUndefined: Self = StObject.set(x, "closingOfElementWithOpenChildElements", js.undefined)
      
      inline def setControlCharacterInInputStream(value: ErrorSeverity): Self = StObject.set(x, "controlCharacterInInputStream", value.asInstanceOf[js.Any])
      
      inline def setControlCharacterInInputStreamNull: Self = StObject.set(x, "controlCharacterInInputStream", null)
      
      inline def setControlCharacterInInputStreamUndefined: Self = StObject.set(x, "controlCharacterInInputStream", js.undefined)
      
      inline def setControlCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "controlCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setControlCharacterReferenceNull: Self = StObject.set(x, "controlCharacterReference", null)
      
      inline def setControlCharacterReferenceUndefined: Self = StObject.set(x, "controlCharacterReference", js.undefined)
      
      inline def setDisallowedContentInNoscriptInHead(value: ErrorSeverity): Self = StObject.set(x, "disallowedContentInNoscriptInHead", value.asInstanceOf[js.Any])
      
      inline def setDisallowedContentInNoscriptInHeadNull: Self = StObject.set(x, "disallowedContentInNoscriptInHead", null)
      
      inline def setDisallowedContentInNoscriptInHeadUndefined: Self = StObject.set(x, "disallowedContentInNoscriptInHead", js.undefined)
      
      inline def setDuplicateAttribute(value: ErrorSeverity): Self = StObject.set(x, "duplicateAttribute", value.asInstanceOf[js.Any])
      
      inline def setDuplicateAttributeNull: Self = StObject.set(x, "duplicateAttribute", null)
      
      inline def setDuplicateAttributeUndefined: Self = StObject.set(x, "duplicateAttribute", js.undefined)
      
      inline def setEndTagWithAttributes(value: ErrorSeverity): Self = StObject.set(x, "endTagWithAttributes", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithAttributesNull: Self = StObject.set(x, "endTagWithAttributes", null)
      
      inline def setEndTagWithAttributesUndefined: Self = StObject.set(x, "endTagWithAttributes", js.undefined)
      
      inline def setEndTagWithTrailingSolidus(value: ErrorSeverity): Self = StObject.set(x, "endTagWithTrailingSolidus", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithTrailingSolidusNull: Self = StObject.set(x, "endTagWithTrailingSolidus", null)
      
      inline def setEndTagWithTrailingSolidusUndefined: Self = StObject.set(x, "endTagWithTrailingSolidus", js.undefined)
      
      inline def setEndTagWithoutMatchingOpenElement(value: ErrorSeverity): Self = StObject.set(x, "endTagWithoutMatchingOpenElement", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithoutMatchingOpenElementNull: Self = StObject.set(x, "endTagWithoutMatchingOpenElement", null)
      
      inline def setEndTagWithoutMatchingOpenElementUndefined: Self = StObject.set(x, "endTagWithoutMatchingOpenElement", js.undefined)
      
      inline def setEofBeforeTagName(value: ErrorSeverity): Self = StObject.set(x, "eofBeforeTagName", value.asInstanceOf[js.Any])
      
      inline def setEofBeforeTagNameNull: Self = StObject.set(x, "eofBeforeTagName", null)
      
      inline def setEofBeforeTagNameUndefined: Self = StObject.set(x, "eofBeforeTagName", js.undefined)
      
      inline def setEofInCdata(value: ErrorSeverity): Self = StObject.set(x, "eofInCdata", value.asInstanceOf[js.Any])
      
      inline def setEofInCdataNull: Self = StObject.set(x, "eofInCdata", null)
      
      inline def setEofInCdataUndefined: Self = StObject.set(x, "eofInCdata", js.undefined)
      
      inline def setEofInComment(value: ErrorSeverity): Self = StObject.set(x, "eofInComment", value.asInstanceOf[js.Any])
      
      inline def setEofInCommentNull: Self = StObject.set(x, "eofInComment", null)
      
      inline def setEofInCommentUndefined: Self = StObject.set(x, "eofInComment", js.undefined)
      
      inline def setEofInDoctype(value: ErrorSeverity): Self = StObject.set(x, "eofInDoctype", value.asInstanceOf[js.Any])
      
      inline def setEofInDoctypeNull: Self = StObject.set(x, "eofInDoctype", null)
      
      inline def setEofInDoctypeUndefined: Self = StObject.set(x, "eofInDoctype", js.undefined)
      
      inline def setEofInElementThatCanContainOnlyText(value: ErrorSeverity): Self = StObject.set(x, "eofInElementThatCanContainOnlyText", value.asInstanceOf[js.Any])
      
      inline def setEofInElementThatCanContainOnlyTextNull: Self = StObject.set(x, "eofInElementThatCanContainOnlyText", null)
      
      inline def setEofInElementThatCanContainOnlyTextUndefined: Self = StObject.set(x, "eofInElementThatCanContainOnlyText", js.undefined)
      
      inline def setEofInScriptHtmlCommentLikeText(value: ErrorSeverity): Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", value.asInstanceOf[js.Any])
      
      inline def setEofInScriptHtmlCommentLikeTextNull: Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", null)
      
      inline def setEofInScriptHtmlCommentLikeTextUndefined: Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", js.undefined)
      
      inline def setEofInTag(value: ErrorSeverity): Self = StObject.set(x, "eofInTag", value.asInstanceOf[js.Any])
      
      inline def setEofInTagNull: Self = StObject.set(x, "eofInTag", null)
      
      inline def setEofInTagUndefined: Self = StObject.set(x, "eofInTag", js.undefined)
      
      inline def setIncorrectlyClosedComment(value: ErrorSeverity): Self = StObject.set(x, "incorrectlyClosedComment", value.asInstanceOf[js.Any])
      
      inline def setIncorrectlyClosedCommentNull: Self = StObject.set(x, "incorrectlyClosedComment", null)
      
      inline def setIncorrectlyClosedCommentUndefined: Self = StObject.set(x, "incorrectlyClosedComment", js.undefined)
      
      inline def setIncorrectlyOpenedComment(value: ErrorSeverity): Self = StObject.set(x, "incorrectlyOpenedComment", value.asInstanceOf[js.Any])
      
      inline def setIncorrectlyOpenedCommentNull: Self = StObject.set(x, "incorrectlyOpenedComment", null)
      
      inline def setIncorrectlyOpenedCommentUndefined: Self = StObject.set(x, "incorrectlyOpenedComment", js.undefined)
      
      inline def setInvalidCharacterSequenceAfterDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setInvalidCharacterSequenceAfterDoctypeNameNull: Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", null)
      
      inline def setInvalidCharacterSequenceAfterDoctypeNameUndefined: Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", js.undefined)
      
      inline def setInvalidFirstCharacterOfTagName(value: ErrorSeverity): Self = StObject.set(x, "invalidFirstCharacterOfTagName", value.asInstanceOf[js.Any])
      
      inline def setInvalidFirstCharacterOfTagNameNull: Self = StObject.set(x, "invalidFirstCharacterOfTagName", null)
      
      inline def setInvalidFirstCharacterOfTagNameUndefined: Self = StObject.set(x, "invalidFirstCharacterOfTagName", js.undefined)
      
      inline def setMisplacedDoctype(value: ErrorSeverity): Self = StObject.set(x, "misplacedDoctype", value.asInstanceOf[js.Any])
      
      inline def setMisplacedDoctypeNull: Self = StObject.set(x, "misplacedDoctype", null)
      
      inline def setMisplacedDoctypeUndefined: Self = StObject.set(x, "misplacedDoctype", js.undefined)
      
      inline def setMisplacedStartTagForHeadElement(value: ErrorSeverity): Self = StObject.set(x, "misplacedStartTagForHeadElement", value.asInstanceOf[js.Any])
      
      inline def setMisplacedStartTagForHeadElementNull: Self = StObject.set(x, "misplacedStartTagForHeadElement", null)
      
      inline def setMisplacedStartTagForHeadElementUndefined: Self = StObject.set(x, "misplacedStartTagForHeadElement", js.undefined)
      
      inline def setMissingAttributeValue(value: ErrorSeverity): Self = StObject.set(x, "missingAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setMissingAttributeValueNull: Self = StObject.set(x, "missingAttributeValue", null)
      
      inline def setMissingAttributeValueUndefined: Self = StObject.set(x, "missingAttributeValue", js.undefined)
      
      inline def setMissingDoctype(value: ErrorSeverity): Self = StObject.set(x, "missingDoctype", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeNameNull: Self = StObject.set(x, "missingDoctypeName", null)
      
      inline def setMissingDoctypeNameUndefined: Self = StObject.set(x, "missingDoctypeName", js.undefined)
      
      inline def setMissingDoctypeNull: Self = StObject.set(x, "missingDoctype", null)
      
      inline def setMissingDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypePublicIdentifierNull: Self = StObject.set(x, "missingDoctypePublicIdentifier", null)
      
      inline def setMissingDoctypePublicIdentifierUndefined: Self = StObject.set(x, "missingDoctypePublicIdentifier", js.undefined)
      
      inline def setMissingDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeSystemIdentifierNull: Self = StObject.set(x, "missingDoctypeSystemIdentifier", null)
      
      inline def setMissingDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "missingDoctypeSystemIdentifier", js.undefined)
      
      inline def setMissingDoctypeUndefined: Self = StObject.set(x, "missingDoctype", js.undefined)
      
      inline def setMissingEndTagName(value: ErrorSeverity): Self = StObject.set(x, "missingEndTagName", value.asInstanceOf[js.Any])
      
      inline def setMissingEndTagNameNull: Self = StObject.set(x, "missingEndTagName", null)
      
      inline def setMissingEndTagNameUndefined: Self = StObject.set(x, "missingEndTagName", js.undefined)
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifierNull: Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", null)
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifierUndefined: Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", js.undefined)
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifierNull: Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", null)
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", js.undefined)
      
      inline def setMissingSemicolonAfterCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "missingSemicolonAfterCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setMissingSemicolonAfterCharacterReferenceNull: Self = StObject.set(x, "missingSemicolonAfterCharacterReference", null)
      
      inline def setMissingSemicolonAfterCharacterReferenceUndefined: Self = StObject.set(x, "missingSemicolonAfterCharacterReference", js.undefined)
      
      inline def setMissingWhitespaceAfterDoctypePublicKeyword(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceAfterDoctypePublicKeywordNull: Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", null)
      
      inline def setMissingWhitespaceAfterDoctypePublicKeywordUndefined: Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", js.undefined)
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeyword(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeywordNull: Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", null)
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeywordUndefined: Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", js.undefined)
      
      inline def setMissingWhitespaceBeforeDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBeforeDoctypeNameNull: Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", null)
      
      inline def setMissingWhitespaceBeforeDoctypeNameUndefined: Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", js.undefined)
      
      inline def setMissingWhitespaceBetweenAttributes(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBetweenAttributes", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBetweenAttributesNull: Self = StObject.set(x, "missingWhitespaceBetweenAttributes", null)
      
      inline def setMissingWhitespaceBetweenAttributesUndefined: Self = StObject.set(x, "missingWhitespaceBetweenAttributes", js.undefined)
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiers(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiersNull: Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", null)
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiersUndefined: Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", js.undefined)
      
      inline def setNestedComment(value: ErrorSeverity): Self = StObject.set(x, "nestedComment", value.asInstanceOf[js.Any])
      
      inline def setNestedCommentNull: Self = StObject.set(x, "nestedComment", null)
      
      inline def setNestedCommentUndefined: Self = StObject.set(x, "nestedComment", js.undefined)
      
      inline def setNestedNoscriptInHead(value: ErrorSeverity): Self = StObject.set(x, "nestedNoscriptInHead", value.asInstanceOf[js.Any])
      
      inline def setNestedNoscriptInHeadNull: Self = StObject.set(x, "nestedNoscriptInHead", null)
      
      inline def setNestedNoscriptInHeadUndefined: Self = StObject.set(x, "nestedNoscriptInHead", js.undefined)
      
      inline def setNonConformingDoctype(value: ErrorSeverity): Self = StObject.set(x, "nonConformingDoctype", value.asInstanceOf[js.Any])
      
      inline def setNonConformingDoctypeNull: Self = StObject.set(x, "nonConformingDoctype", null)
      
      inline def setNonConformingDoctypeUndefined: Self = StObject.set(x, "nonConformingDoctype", js.undefined)
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidus(value: ErrorSeverity): Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", value.asInstanceOf[js.Any])
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidusNull: Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", null)
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidusUndefined: Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", js.undefined)
      
      inline def setNoncharacterCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "noncharacterCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setNoncharacterCharacterReferenceNull: Self = StObject.set(x, "noncharacterCharacterReference", null)
      
      inline def setNoncharacterCharacterReferenceUndefined: Self = StObject.set(x, "noncharacterCharacterReference", js.undefined)
      
      inline def setNoncharacterInInputStream(value: ErrorSeverity): Self = StObject.set(x, "noncharacterInInputStream", value.asInstanceOf[js.Any])
      
      inline def setNoncharacterInInputStreamNull: Self = StObject.set(x, "noncharacterInInputStream", null)
      
      inline def setNoncharacterInInputStreamUndefined: Self = StObject.set(x, "noncharacterInInputStream", js.undefined)
      
      inline def setNullCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "nullCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setNullCharacterReferenceNull: Self = StObject.set(x, "nullCharacterReference", null)
      
      inline def setNullCharacterReferenceUndefined: Self = StObject.set(x, "nullCharacterReference", js.undefined)
      
      inline def setOpenElementsLeftAfterEof(value: ErrorSeverity): Self = StObject.set(x, "openElementsLeftAfterEof", value.asInstanceOf[js.Any])
      
      inline def setOpenElementsLeftAfterEofNull: Self = StObject.set(x, "openElementsLeftAfterEof", null)
      
      inline def setOpenElementsLeftAfterEofUndefined: Self = StObject.set(x, "openElementsLeftAfterEof", js.undefined)
      
      inline def setSurrogateCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "surrogateCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setSurrogateCharacterReferenceNull: Self = StObject.set(x, "surrogateCharacterReference", null)
      
      inline def setSurrogateCharacterReferenceUndefined: Self = StObject.set(x, "surrogateCharacterReference", js.undefined)
      
      inline def setSurrogateInInputStream(value: ErrorSeverity): Self = StObject.set(x, "surrogateInInputStream", value.asInstanceOf[js.Any])
      
      inline def setSurrogateInInputStreamNull: Self = StObject.set(x, "surrogateInInputStream", null)
      
      inline def setSurrogateInInputStreamUndefined: Self = StObject.set(x, "surrogateInInputStream", js.undefined)
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifierNull: Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", null)
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", js.undefined)
      
      inline def setUnexpectedCharacterInAttributeName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterInAttributeName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterInAttributeNameNull: Self = StObject.set(x, "unexpectedCharacterInAttributeName", null)
      
      inline def setUnexpectedCharacterInAttributeNameUndefined: Self = StObject.set(x, "unexpectedCharacterInAttributeName", js.undefined)
      
      inline def setUnexpectedCharacterInUnquotedAttributeValue(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterInUnquotedAttributeValueNull: Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", null)
      
      inline def setUnexpectedCharacterInUnquotedAttributeValueUndefined: Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", js.undefined)
      
      inline def setUnexpectedEqualsSignBeforeAttributeName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedEqualsSignBeforeAttributeNameNull: Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", null)
      
      inline def setUnexpectedEqualsSignBeforeAttributeNameUndefined: Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", js.undefined)
      
      inline def setUnexpectedNullCharacter(value: ErrorSeverity): Self = StObject.set(x, "unexpectedNullCharacter", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedNullCharacterNull: Self = StObject.set(x, "unexpectedNullCharacter", null)
      
      inline def setUnexpectedNullCharacterUndefined: Self = StObject.set(x, "unexpectedNullCharacter", js.undefined)
      
      inline def setUnexpectedQuestionMarkInsteadOfTagName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedQuestionMarkInsteadOfTagNameNull: Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", null)
      
      inline def setUnexpectedQuestionMarkInsteadOfTagNameUndefined: Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", js.undefined)
      
      inline def setUnexpectedSolidusInTag(value: ErrorSeverity): Self = StObject.set(x, "unexpectedSolidusInTag", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedSolidusInTagNull: Self = StObject.set(x, "unexpectedSolidusInTag", null)
      
      inline def setUnexpectedSolidusInTagUndefined: Self = StObject.set(x, "unexpectedSolidusInTag", js.undefined)
      
      inline def setUnknownNamedCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "unknownNamedCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setUnknownNamedCharacterReferenceNull: Self = StObject.set(x, "unknownNamedCharacterReference", null)
      
      inline def setUnknownNamedCharacterReferenceUndefined: Self = StObject.set(x, "unknownNamedCharacterReference", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rehypeParse.rehypeParseNumbers.`0`
    - typings.rehypeParse.rehypeParseNumbers.`1`
    - typings.rehypeParse.rehypeParseNumbers.`2`
    - scala.Boolean
    - scala.Null
    - scala.Unit
  */
  type ErrorSeverity = js.UndefOr[_ErrorSeverity | Boolean | Null]
  
  /* Inlined std.Pick<hast-util-from-parse5.hast-util-from-parse5.Options, 'space' | 'verbose'> */
  trait FromParse5Options extends StObject {
    
    var space: js.UndefOr[Space] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object FromParse5Options {
    
    inline def apply(): FromParse5Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromParse5Options]
    }
    
    extension [Self <: FromParse5Options](x: Self) {
      
      inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  /* Inlined rehype-parse.rehype-parse/lib.FromParse5Options & rehype-parse.rehype-parse/lib.ParseFields & rehype-parse.rehype-parse/lib.ErrorFields */
  trait Options extends StObject {
    
    var abandonedHeadElementChild: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptClosingOfEmptyComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var abruptDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var absenceOfDigitsInNumericCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var cdataInHtmlContent: js.UndefOr[ErrorSeverity] = js.undefined
    
    var characterReferenceOutsideUnicodeRange: js.UndefOr[ErrorSeverity] = js.undefined
    
    var closingOfElementWithOpenChildElements: js.UndefOr[ErrorSeverity] = js.undefined
    
    var controlCharacterInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var controlCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var disallowedContentInNoscriptInHead: js.UndefOr[ErrorSeverity] = js.undefined
    
    var duplicateAttribute: js.UndefOr[ErrorSeverity] = js.undefined
    
    /**
      * > ⚠️ Parse errors are currently being added to HTML.
      * > Not all errors emitted by parse5 (or rehype-parse) are specced yet.
      * > Some documentation may still be missing.
      *
      * Emit parse errors while parsing on the vfile.
      * Setting this to `true` starts emitting HTML parse errors.
      *
      * Specific rules can be turned off by setting them to `false` (or `0`).
      * The default, when `emitParseErrors: true`, is `true` (or `1`), and means
      * that rules emit as warnings.
      * Rules can also be configured with `2`, to turn them into fatal errors.
      */
    var emitParseErrors: js.UndefOr[Boolean] = js.undefined
    
    var endTagWithAttributes: js.UndefOr[ErrorSeverity] = js.undefined
    
    var endTagWithTrailingSolidus: js.UndefOr[ErrorSeverity] = js.undefined
    
    var endTagWithoutMatchingOpenElement: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofBeforeTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInCdata: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInElementThatCanContainOnlyText: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInScriptHtmlCommentLikeText: js.UndefOr[ErrorSeverity] = js.undefined
    
    var eofInTag: js.UndefOr[ErrorSeverity] = js.undefined
    
    /**
      * Specify whether to parse a fragment, instead of a complete document.
      * In document mode, unopened `html`, `head`, and `body` elements are opened
      * in just the right places.
      */
    var fragment: js.UndefOr[Boolean] = js.undefined
    
    var incorrectlyClosedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var incorrectlyOpenedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var invalidCharacterSequenceAfterDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var invalidFirstCharacterOfTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var misplacedDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var misplacedStartTagForHeadElement: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingAttributeValue: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingEndTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingQuoteBeforeDoctypePublicIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingQuoteBeforeDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingSemicolonAfterCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceAfterDoctypePublicKeyword: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceAfterDoctypeSystemKeyword: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBeforeDoctypeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBetweenAttributes: js.UndefOr[ErrorSeverity] = js.undefined
    
    var missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nestedComment: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nestedNoscriptInHead: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nonConformingDoctype: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nonVoidHtmlElementStartTagWithTrailingSolidus: js.UndefOr[ErrorSeverity] = js.undefined
    
    var noncharacterCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var noncharacterInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var nullCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var openElementsLeftAfterEof: js.UndefOr[ErrorSeverity] = js.undefined
    
    var space: js.UndefOr[Space] = js.undefined
    
    var surrogateCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var surrogateInInputStream: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterAfterDoctypeSystemIdentifier: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterInAttributeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedCharacterInUnquotedAttributeValue: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedEqualsSignBeforeAttributeName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedNullCharacter: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedQuestionMarkInsteadOfTagName: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unexpectedSolidusInTag: js.UndefOr[ErrorSeverity] = js.undefined
    
    var unknownNamedCharacterReference: js.UndefOr[ErrorSeverity] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAbandonedHeadElementChild(value: ErrorSeverity): Self = StObject.set(x, "abandonedHeadElementChild", value.asInstanceOf[js.Any])
      
      inline def setAbandonedHeadElementChildNull: Self = StObject.set(x, "abandonedHeadElementChild", null)
      
      inline def setAbandonedHeadElementChildUndefined: Self = StObject.set(x, "abandonedHeadElementChild", js.undefined)
      
      inline def setAbruptClosingOfEmptyComment(value: ErrorSeverity): Self = StObject.set(x, "abruptClosingOfEmptyComment", value.asInstanceOf[js.Any])
      
      inline def setAbruptClosingOfEmptyCommentNull: Self = StObject.set(x, "abruptClosingOfEmptyComment", null)
      
      inline def setAbruptClosingOfEmptyCommentUndefined: Self = StObject.set(x, "abruptClosingOfEmptyComment", js.undefined)
      
      inline def setAbruptDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "abruptDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAbruptDoctypePublicIdentifierNull: Self = StObject.set(x, "abruptDoctypePublicIdentifier", null)
      
      inline def setAbruptDoctypePublicIdentifierUndefined: Self = StObject.set(x, "abruptDoctypePublicIdentifier", js.undefined)
      
      inline def setAbruptDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "abruptDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setAbruptDoctypeSystemIdentifierNull: Self = StObject.set(x, "abruptDoctypeSystemIdentifier", null)
      
      inline def setAbruptDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "abruptDoctypeSystemIdentifier", js.undefined)
      
      inline def setAbsenceOfDigitsInNumericCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setAbsenceOfDigitsInNumericCharacterReferenceNull: Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", null)
      
      inline def setAbsenceOfDigitsInNumericCharacterReferenceUndefined: Self = StObject.set(x, "absenceOfDigitsInNumericCharacterReference", js.undefined)
      
      inline def setCdataInHtmlContent(value: ErrorSeverity): Self = StObject.set(x, "cdataInHtmlContent", value.asInstanceOf[js.Any])
      
      inline def setCdataInHtmlContentNull: Self = StObject.set(x, "cdataInHtmlContent", null)
      
      inline def setCdataInHtmlContentUndefined: Self = StObject.set(x, "cdataInHtmlContent", js.undefined)
      
      inline def setCharacterReferenceOutsideUnicodeRange(value: ErrorSeverity): Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", value.asInstanceOf[js.Any])
      
      inline def setCharacterReferenceOutsideUnicodeRangeNull: Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", null)
      
      inline def setCharacterReferenceOutsideUnicodeRangeUndefined: Self = StObject.set(x, "characterReferenceOutsideUnicodeRange", js.undefined)
      
      inline def setClosingOfElementWithOpenChildElements(value: ErrorSeverity): Self = StObject.set(x, "closingOfElementWithOpenChildElements", value.asInstanceOf[js.Any])
      
      inline def setClosingOfElementWithOpenChildElementsNull: Self = StObject.set(x, "closingOfElementWithOpenChildElements", null)
      
      inline def setClosingOfElementWithOpenChildElementsUndefined: Self = StObject.set(x, "closingOfElementWithOpenChildElements", js.undefined)
      
      inline def setControlCharacterInInputStream(value: ErrorSeverity): Self = StObject.set(x, "controlCharacterInInputStream", value.asInstanceOf[js.Any])
      
      inline def setControlCharacterInInputStreamNull: Self = StObject.set(x, "controlCharacterInInputStream", null)
      
      inline def setControlCharacterInInputStreamUndefined: Self = StObject.set(x, "controlCharacterInInputStream", js.undefined)
      
      inline def setControlCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "controlCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setControlCharacterReferenceNull: Self = StObject.set(x, "controlCharacterReference", null)
      
      inline def setControlCharacterReferenceUndefined: Self = StObject.set(x, "controlCharacterReference", js.undefined)
      
      inline def setDisallowedContentInNoscriptInHead(value: ErrorSeverity): Self = StObject.set(x, "disallowedContentInNoscriptInHead", value.asInstanceOf[js.Any])
      
      inline def setDisallowedContentInNoscriptInHeadNull: Self = StObject.set(x, "disallowedContentInNoscriptInHead", null)
      
      inline def setDisallowedContentInNoscriptInHeadUndefined: Self = StObject.set(x, "disallowedContentInNoscriptInHead", js.undefined)
      
      inline def setDuplicateAttribute(value: ErrorSeverity): Self = StObject.set(x, "duplicateAttribute", value.asInstanceOf[js.Any])
      
      inline def setDuplicateAttributeNull: Self = StObject.set(x, "duplicateAttribute", null)
      
      inline def setDuplicateAttributeUndefined: Self = StObject.set(x, "duplicateAttribute", js.undefined)
      
      inline def setEmitParseErrors(value: Boolean): Self = StObject.set(x, "emitParseErrors", value.asInstanceOf[js.Any])
      
      inline def setEmitParseErrorsUndefined: Self = StObject.set(x, "emitParseErrors", js.undefined)
      
      inline def setEndTagWithAttributes(value: ErrorSeverity): Self = StObject.set(x, "endTagWithAttributes", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithAttributesNull: Self = StObject.set(x, "endTagWithAttributes", null)
      
      inline def setEndTagWithAttributesUndefined: Self = StObject.set(x, "endTagWithAttributes", js.undefined)
      
      inline def setEndTagWithTrailingSolidus(value: ErrorSeverity): Self = StObject.set(x, "endTagWithTrailingSolidus", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithTrailingSolidusNull: Self = StObject.set(x, "endTagWithTrailingSolidus", null)
      
      inline def setEndTagWithTrailingSolidusUndefined: Self = StObject.set(x, "endTagWithTrailingSolidus", js.undefined)
      
      inline def setEndTagWithoutMatchingOpenElement(value: ErrorSeverity): Self = StObject.set(x, "endTagWithoutMatchingOpenElement", value.asInstanceOf[js.Any])
      
      inline def setEndTagWithoutMatchingOpenElementNull: Self = StObject.set(x, "endTagWithoutMatchingOpenElement", null)
      
      inline def setEndTagWithoutMatchingOpenElementUndefined: Self = StObject.set(x, "endTagWithoutMatchingOpenElement", js.undefined)
      
      inline def setEofBeforeTagName(value: ErrorSeverity): Self = StObject.set(x, "eofBeforeTagName", value.asInstanceOf[js.Any])
      
      inline def setEofBeforeTagNameNull: Self = StObject.set(x, "eofBeforeTagName", null)
      
      inline def setEofBeforeTagNameUndefined: Self = StObject.set(x, "eofBeforeTagName", js.undefined)
      
      inline def setEofInCdata(value: ErrorSeverity): Self = StObject.set(x, "eofInCdata", value.asInstanceOf[js.Any])
      
      inline def setEofInCdataNull: Self = StObject.set(x, "eofInCdata", null)
      
      inline def setEofInCdataUndefined: Self = StObject.set(x, "eofInCdata", js.undefined)
      
      inline def setEofInComment(value: ErrorSeverity): Self = StObject.set(x, "eofInComment", value.asInstanceOf[js.Any])
      
      inline def setEofInCommentNull: Self = StObject.set(x, "eofInComment", null)
      
      inline def setEofInCommentUndefined: Self = StObject.set(x, "eofInComment", js.undefined)
      
      inline def setEofInDoctype(value: ErrorSeverity): Self = StObject.set(x, "eofInDoctype", value.asInstanceOf[js.Any])
      
      inline def setEofInDoctypeNull: Self = StObject.set(x, "eofInDoctype", null)
      
      inline def setEofInDoctypeUndefined: Self = StObject.set(x, "eofInDoctype", js.undefined)
      
      inline def setEofInElementThatCanContainOnlyText(value: ErrorSeverity): Self = StObject.set(x, "eofInElementThatCanContainOnlyText", value.asInstanceOf[js.Any])
      
      inline def setEofInElementThatCanContainOnlyTextNull: Self = StObject.set(x, "eofInElementThatCanContainOnlyText", null)
      
      inline def setEofInElementThatCanContainOnlyTextUndefined: Self = StObject.set(x, "eofInElementThatCanContainOnlyText", js.undefined)
      
      inline def setEofInScriptHtmlCommentLikeText(value: ErrorSeverity): Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", value.asInstanceOf[js.Any])
      
      inline def setEofInScriptHtmlCommentLikeTextNull: Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", null)
      
      inline def setEofInScriptHtmlCommentLikeTextUndefined: Self = StObject.set(x, "eofInScriptHtmlCommentLikeText", js.undefined)
      
      inline def setEofInTag(value: ErrorSeverity): Self = StObject.set(x, "eofInTag", value.asInstanceOf[js.Any])
      
      inline def setEofInTagNull: Self = StObject.set(x, "eofInTag", null)
      
      inline def setEofInTagUndefined: Self = StObject.set(x, "eofInTag", js.undefined)
      
      inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setIncorrectlyClosedComment(value: ErrorSeverity): Self = StObject.set(x, "incorrectlyClosedComment", value.asInstanceOf[js.Any])
      
      inline def setIncorrectlyClosedCommentNull: Self = StObject.set(x, "incorrectlyClosedComment", null)
      
      inline def setIncorrectlyClosedCommentUndefined: Self = StObject.set(x, "incorrectlyClosedComment", js.undefined)
      
      inline def setIncorrectlyOpenedComment(value: ErrorSeverity): Self = StObject.set(x, "incorrectlyOpenedComment", value.asInstanceOf[js.Any])
      
      inline def setIncorrectlyOpenedCommentNull: Self = StObject.set(x, "incorrectlyOpenedComment", null)
      
      inline def setIncorrectlyOpenedCommentUndefined: Self = StObject.set(x, "incorrectlyOpenedComment", js.undefined)
      
      inline def setInvalidCharacterSequenceAfterDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setInvalidCharacterSequenceAfterDoctypeNameNull: Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", null)
      
      inline def setInvalidCharacterSequenceAfterDoctypeNameUndefined: Self = StObject.set(x, "invalidCharacterSequenceAfterDoctypeName", js.undefined)
      
      inline def setInvalidFirstCharacterOfTagName(value: ErrorSeverity): Self = StObject.set(x, "invalidFirstCharacterOfTagName", value.asInstanceOf[js.Any])
      
      inline def setInvalidFirstCharacterOfTagNameNull: Self = StObject.set(x, "invalidFirstCharacterOfTagName", null)
      
      inline def setInvalidFirstCharacterOfTagNameUndefined: Self = StObject.set(x, "invalidFirstCharacterOfTagName", js.undefined)
      
      inline def setMisplacedDoctype(value: ErrorSeverity): Self = StObject.set(x, "misplacedDoctype", value.asInstanceOf[js.Any])
      
      inline def setMisplacedDoctypeNull: Self = StObject.set(x, "misplacedDoctype", null)
      
      inline def setMisplacedDoctypeUndefined: Self = StObject.set(x, "misplacedDoctype", js.undefined)
      
      inline def setMisplacedStartTagForHeadElement(value: ErrorSeverity): Self = StObject.set(x, "misplacedStartTagForHeadElement", value.asInstanceOf[js.Any])
      
      inline def setMisplacedStartTagForHeadElementNull: Self = StObject.set(x, "misplacedStartTagForHeadElement", null)
      
      inline def setMisplacedStartTagForHeadElementUndefined: Self = StObject.set(x, "misplacedStartTagForHeadElement", js.undefined)
      
      inline def setMissingAttributeValue(value: ErrorSeverity): Self = StObject.set(x, "missingAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setMissingAttributeValueNull: Self = StObject.set(x, "missingAttributeValue", null)
      
      inline def setMissingAttributeValueUndefined: Self = StObject.set(x, "missingAttributeValue", js.undefined)
      
      inline def setMissingDoctype(value: ErrorSeverity): Self = StObject.set(x, "missingDoctype", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeNameNull: Self = StObject.set(x, "missingDoctypeName", null)
      
      inline def setMissingDoctypeNameUndefined: Self = StObject.set(x, "missingDoctypeName", js.undefined)
      
      inline def setMissingDoctypeNull: Self = StObject.set(x, "missingDoctype", null)
      
      inline def setMissingDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypePublicIdentifierNull: Self = StObject.set(x, "missingDoctypePublicIdentifier", null)
      
      inline def setMissingDoctypePublicIdentifierUndefined: Self = StObject.set(x, "missingDoctypePublicIdentifier", js.undefined)
      
      inline def setMissingDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingDoctypeSystemIdentifierNull: Self = StObject.set(x, "missingDoctypeSystemIdentifier", null)
      
      inline def setMissingDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "missingDoctypeSystemIdentifier", js.undefined)
      
      inline def setMissingDoctypeUndefined: Self = StObject.set(x, "missingDoctype", js.undefined)
      
      inline def setMissingEndTagName(value: ErrorSeverity): Self = StObject.set(x, "missingEndTagName", value.asInstanceOf[js.Any])
      
      inline def setMissingEndTagNameNull: Self = StObject.set(x, "missingEndTagName", null)
      
      inline def setMissingEndTagNameUndefined: Self = StObject.set(x, "missingEndTagName", js.undefined)
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifierNull: Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", null)
      
      inline def setMissingQuoteBeforeDoctypePublicIdentifierUndefined: Self = StObject.set(x, "missingQuoteBeforeDoctypePublicIdentifier", js.undefined)
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifierNull: Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", null)
      
      inline def setMissingQuoteBeforeDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "missingQuoteBeforeDoctypeSystemIdentifier", js.undefined)
      
      inline def setMissingSemicolonAfterCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "missingSemicolonAfterCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setMissingSemicolonAfterCharacterReferenceNull: Self = StObject.set(x, "missingSemicolonAfterCharacterReference", null)
      
      inline def setMissingSemicolonAfterCharacterReferenceUndefined: Self = StObject.set(x, "missingSemicolonAfterCharacterReference", js.undefined)
      
      inline def setMissingWhitespaceAfterDoctypePublicKeyword(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceAfterDoctypePublicKeywordNull: Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", null)
      
      inline def setMissingWhitespaceAfterDoctypePublicKeywordUndefined: Self = StObject.set(x, "missingWhitespaceAfterDoctypePublicKeyword", js.undefined)
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeyword(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeywordNull: Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", null)
      
      inline def setMissingWhitespaceAfterDoctypeSystemKeywordUndefined: Self = StObject.set(x, "missingWhitespaceAfterDoctypeSystemKeyword", js.undefined)
      
      inline def setMissingWhitespaceBeforeDoctypeName(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBeforeDoctypeNameNull: Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", null)
      
      inline def setMissingWhitespaceBeforeDoctypeNameUndefined: Self = StObject.set(x, "missingWhitespaceBeforeDoctypeName", js.undefined)
      
      inline def setMissingWhitespaceBetweenAttributes(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBetweenAttributes", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBetweenAttributesNull: Self = StObject.set(x, "missingWhitespaceBetweenAttributes", null)
      
      inline def setMissingWhitespaceBetweenAttributesUndefined: Self = StObject.set(x, "missingWhitespaceBetweenAttributes", js.undefined)
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiers(value: ErrorSeverity): Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiersNull: Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", null)
      
      inline def setMissingWhitespaceBetweenDoctypePublicAndSystemIdentifiersUndefined: Self = StObject.set(x, "missingWhitespaceBetweenDoctypePublicAndSystemIdentifiers", js.undefined)
      
      inline def setNestedComment(value: ErrorSeverity): Self = StObject.set(x, "nestedComment", value.asInstanceOf[js.Any])
      
      inline def setNestedCommentNull: Self = StObject.set(x, "nestedComment", null)
      
      inline def setNestedCommentUndefined: Self = StObject.set(x, "nestedComment", js.undefined)
      
      inline def setNestedNoscriptInHead(value: ErrorSeverity): Self = StObject.set(x, "nestedNoscriptInHead", value.asInstanceOf[js.Any])
      
      inline def setNestedNoscriptInHeadNull: Self = StObject.set(x, "nestedNoscriptInHead", null)
      
      inline def setNestedNoscriptInHeadUndefined: Self = StObject.set(x, "nestedNoscriptInHead", js.undefined)
      
      inline def setNonConformingDoctype(value: ErrorSeverity): Self = StObject.set(x, "nonConformingDoctype", value.asInstanceOf[js.Any])
      
      inline def setNonConformingDoctypeNull: Self = StObject.set(x, "nonConformingDoctype", null)
      
      inline def setNonConformingDoctypeUndefined: Self = StObject.set(x, "nonConformingDoctype", js.undefined)
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidus(value: ErrorSeverity): Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", value.asInstanceOf[js.Any])
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidusNull: Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", null)
      
      inline def setNonVoidHtmlElementStartTagWithTrailingSolidusUndefined: Self = StObject.set(x, "nonVoidHtmlElementStartTagWithTrailingSolidus", js.undefined)
      
      inline def setNoncharacterCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "noncharacterCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setNoncharacterCharacterReferenceNull: Self = StObject.set(x, "noncharacterCharacterReference", null)
      
      inline def setNoncharacterCharacterReferenceUndefined: Self = StObject.set(x, "noncharacterCharacterReference", js.undefined)
      
      inline def setNoncharacterInInputStream(value: ErrorSeverity): Self = StObject.set(x, "noncharacterInInputStream", value.asInstanceOf[js.Any])
      
      inline def setNoncharacterInInputStreamNull: Self = StObject.set(x, "noncharacterInInputStream", null)
      
      inline def setNoncharacterInInputStreamUndefined: Self = StObject.set(x, "noncharacterInInputStream", js.undefined)
      
      inline def setNullCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "nullCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setNullCharacterReferenceNull: Self = StObject.set(x, "nullCharacterReference", null)
      
      inline def setNullCharacterReferenceUndefined: Self = StObject.set(x, "nullCharacterReference", js.undefined)
      
      inline def setOpenElementsLeftAfterEof(value: ErrorSeverity): Self = StObject.set(x, "openElementsLeftAfterEof", value.asInstanceOf[js.Any])
      
      inline def setOpenElementsLeftAfterEofNull: Self = StObject.set(x, "openElementsLeftAfterEof", null)
      
      inline def setOpenElementsLeftAfterEofUndefined: Self = StObject.set(x, "openElementsLeftAfterEof", js.undefined)
      
      inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setSurrogateCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "surrogateCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setSurrogateCharacterReferenceNull: Self = StObject.set(x, "surrogateCharacterReference", null)
      
      inline def setSurrogateCharacterReferenceUndefined: Self = StObject.set(x, "surrogateCharacterReference", js.undefined)
      
      inline def setSurrogateInInputStream(value: ErrorSeverity): Self = StObject.set(x, "surrogateInInputStream", value.asInstanceOf[js.Any])
      
      inline def setSurrogateInInputStreamNull: Self = StObject.set(x, "surrogateInInputStream", null)
      
      inline def setSurrogateInInputStreamUndefined: Self = StObject.set(x, "surrogateInInputStream", js.undefined)
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifier(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifierNull: Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", null)
      
      inline def setUnexpectedCharacterAfterDoctypeSystemIdentifierUndefined: Self = StObject.set(x, "unexpectedCharacterAfterDoctypeSystemIdentifier", js.undefined)
      
      inline def setUnexpectedCharacterInAttributeName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterInAttributeName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterInAttributeNameNull: Self = StObject.set(x, "unexpectedCharacterInAttributeName", null)
      
      inline def setUnexpectedCharacterInAttributeNameUndefined: Self = StObject.set(x, "unexpectedCharacterInAttributeName", js.undefined)
      
      inline def setUnexpectedCharacterInUnquotedAttributeValue(value: ErrorSeverity): Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedCharacterInUnquotedAttributeValueNull: Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", null)
      
      inline def setUnexpectedCharacterInUnquotedAttributeValueUndefined: Self = StObject.set(x, "unexpectedCharacterInUnquotedAttributeValue", js.undefined)
      
      inline def setUnexpectedEqualsSignBeforeAttributeName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedEqualsSignBeforeAttributeNameNull: Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", null)
      
      inline def setUnexpectedEqualsSignBeforeAttributeNameUndefined: Self = StObject.set(x, "unexpectedEqualsSignBeforeAttributeName", js.undefined)
      
      inline def setUnexpectedNullCharacter(value: ErrorSeverity): Self = StObject.set(x, "unexpectedNullCharacter", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedNullCharacterNull: Self = StObject.set(x, "unexpectedNullCharacter", null)
      
      inline def setUnexpectedNullCharacterUndefined: Self = StObject.set(x, "unexpectedNullCharacter", js.undefined)
      
      inline def setUnexpectedQuestionMarkInsteadOfTagName(value: ErrorSeverity): Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedQuestionMarkInsteadOfTagNameNull: Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", null)
      
      inline def setUnexpectedQuestionMarkInsteadOfTagNameUndefined: Self = StObject.set(x, "unexpectedQuestionMarkInsteadOfTagName", js.undefined)
      
      inline def setUnexpectedSolidusInTag(value: ErrorSeverity): Self = StObject.set(x, "unexpectedSolidusInTag", value.asInstanceOf[js.Any])
      
      inline def setUnexpectedSolidusInTagNull: Self = StObject.set(x, "unexpectedSolidusInTag", null)
      
      inline def setUnexpectedSolidusInTagUndefined: Self = StObject.set(x, "unexpectedSolidusInTag", js.undefined)
      
      inline def setUnknownNamedCharacterReference(value: ErrorSeverity): Self = StObject.set(x, "unknownNamedCharacterReference", value.asInstanceOf[js.Any])
      
      inline def setUnknownNamedCharacterReferenceNull: Self = StObject.set(x, "unknownNamedCharacterReference", null)
      
      inline def setUnknownNamedCharacterReferenceUndefined: Self = StObject.set(x, "unknownNamedCharacterReference", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait ParseFields extends StObject {
    
    /**
      * > ⚠️ Parse errors are currently being added to HTML.
      * > Not all errors emitted by parse5 (or rehype-parse) are specced yet.
      * > Some documentation may still be missing.
      *
      * Emit parse errors while parsing on the vfile.
      * Setting this to `true` starts emitting HTML parse errors.
      *
      * Specific rules can be turned off by setting them to `false` (or `0`).
      * The default, when `emitParseErrors: true`, is `true` (or `1`), and means
      * that rules emit as warnings.
      * Rules can also be configured with `2`, to turn them into fatal errors.
      */
    var emitParseErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify whether to parse a fragment, instead of a complete document.
      * In document mode, unopened `html`, `head`, and `body` elements are opened
      * in just the right places.
      */
    var fragment: js.UndefOr[Boolean] = js.undefined
  }
  object ParseFields {
    
    inline def apply(): ParseFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseFields]
    }
    
    extension [Self <: ParseFields](x: Self) {
      
      inline def setEmitParseErrors(value: Boolean): Self = StObject.set(x, "emitParseErrors", value.asInstanceOf[js.Any])
      
      inline def setEmitParseErrorsUndefined: Self = StObject.set(x, "emitParseErrors", js.undefined)
      
      inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    }
  }
  
  type Root = typings.hast.mod.Root
  
  trait _ErrorSeverity extends StObject
}
