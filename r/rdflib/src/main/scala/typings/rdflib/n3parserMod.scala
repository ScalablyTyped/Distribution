package typings.rdflib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object n3parserMod {
  
  @JSImport("rdflib/lib/n3parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    store: Any,
    openFormula: Any,
    thisDoc: Any,
    baseURI: Any,
    genPrefix: Any,
    metaURI: Any,
    flags: Any,
    why: Any
  ): SinkParser = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any], openFormula.asInstanceOf[js.Any], thisDoc.asInstanceOf[js.Any], baseURI.asInstanceOf[js.Any], genPrefix.asInstanceOf[js.Any], metaURI.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], why.asInstanceOf[js.Any])).asInstanceOf[SinkParser]
  
  @JSImport("rdflib/lib/n3parser", "SinkParser")
  @js.native
  open class SinkParser protected () extends StObject {
    def this(
      store: Any,
      openFormula: Any,
      thisDoc: Any,
      baseURI: Any,
      genPrefix: Any,
      metaURI: Any,
      flags: Any,
      why: Any
    ) = this()
    
    def UEscape(str: Any, i: Any, startline: Any): Any = js.native
    
    var _anonymousNodes: Any = js.native
    
    var _baseURI: Any = js.native
    
    var _bindings: Any = js.native
    
    var _context: Any = js.native
    
    var _flags: Any = js.native
    
    var _formula: Any = js.native
    
    var _genPrefix: Any = js.native
    
    var _parentContext: Any = js.native
    
    var _parentVariables: Any = js.native
    
    var _reason: Any = js.native
    
    var _reason2: Any = js.native
    
    var _store: Any = js.native
    
    var _thisDoc: Any = js.native
    
    var _variables: Any = js.native
    
    def anonymousNode(ln: Any): Any = js.native
    
    def bareWord(str: Any, i: Any, res: Any): Any = js.native
    
    def bind(qn: Any, uri: Any): Unit = js.native
    
    def blankNode(uri: Any): Any = js.native
    
    def checkDot(str: Any, i: Any): Any = js.native
    
    def commaSeparatedList(str: Any, j: Any, res: Any, ofUris: Any): Any = js.native
    
    def directive(str: Any, i: Any): Any = js.native
    
    def directiveOrStatement(str: Any, h: Any): Any = js.native
    
    def endDoc(): Any = js.native
    
    def feed(octets: Any): Unit = js.native
    
    def formula(): Any = js.native
    
    def here(i: Any): String = js.native
    
    def item(str: Any, i: Any, res: Any): Any = js.native
    
    var keywords: Any = js.native
    
    var keywordsSet: Double = js.native
    
    var lines: Double = js.native
    
    def loadBuf(buf: Any): Any = js.native
    
    def loadStream(stream: Any): Any = js.native
    
    def makeStatement(quad: Any): Unit = js.native
    
    def node(str: Any, i: Any, res: Any, subjectAlready: Any): Any = js.native
    
    def nodeOrLiteral(str: Any, i: Any, res: Any): Any = js.native
    
    def `object`(str: Any, i: Any, res: Any): Any = js.native
    
    def objectList(str: Any, i: Any, res: Any): Any = js.native
    
    def path(str: Any, i: Any, res: Any): Any = js.native
    
    var previousLine: Double = js.native
    
    def prop(str: Any, i: Any, res: Any): Any = js.native
    
    def property_list(str: Any, i: Any, subj: Any): Any = js.native
    
    def qname(str: Any, i: Any, res: Any): Any = js.native
    
    def setKeywords(k: Any): Unit = js.native
    
    def skipSpace(str: Any, i: Any): Any = js.native
    
    var source: Any = js.native
    
    def startDoc(): Unit = js.native
    
    var startOfLine: Double = js.native
    
    def statement(str: Any, i: Any): Any = js.native
    
    var statementCount: Double = js.native
    
    def strconst(str: Any, i: Any, delim: Any): Any = js.native
    
    def subject(str: Any, i: Any, res: Any): Any = js.native
    
    def tok(tok: Any, str: Any, i: Any): Any = js.native
    
    def uEscape(str: Any, i: Any, startline: Any): Any = js.native
    
    def uri_ref2(str: Any, i: Any, res: Any): Any = js.native
    
    def variable(str: Any, i: Any, res: Any): Any = js.native
    
    def verb(str: Any, i: Any, res: Any): Any = js.native
  }
}
