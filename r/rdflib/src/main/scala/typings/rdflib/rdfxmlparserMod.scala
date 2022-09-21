package typings.rdflib

import typings.rdflib.anon.ATTRIBUTE
import typings.rdflib.anon.RDF
import typings.std.HTMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdfxmlparserMod {
  
  @JSImport("rdflib/lib/rdfxmlparser", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RDFParser {
    def this(store: Any) = this()
    
    /**
      * Builds scope frame
      * @private
      */
    /* private */ /* CompleteClass */
    var buildFrame: Any = js.native
    
    /**
      * Cleans out state from a previous parse run
      * @private
      */
    /* private */ /* CompleteClass */
    var cleanParser: Any = js.native
    
    /**
      * Frame class for namespace and base URI lookups
      * Base lookups will always resolve because the parser knows
      * the default base.
      *
      * @private
      */
    /* private */ /* CompleteClass */
    var frameFactory: Any = js.native
    
    /* CompleteClass */
    override def getAttributeNodeNS(node: Any, uri: Any, name: Any): Any = js.native
    
    /**
      * Build our initial scope frame and parse the DOM into triples
      * @param {HTMLDocument} document The DOM to parse
      * @param {String} base The base URL to use
      * @param {Object} why The context to which this resource belongs
      */
    /* CompleteClass */
    override def parse(document: HTMLDocument, base: String, why: Any): Boolean = js.native
    
    /* CompleteClass */
    override def parseDOM(frame: Any): Unit = js.native
    
    /** Reification flag */
    /* CompleteClass */
    var reify: Boolean = js.native
    
    /** Our triple store reference @private */
    /* CompleteClass */
    var store: Any = js.native
    
    /** A context for context-aware stores @private */
    /* CompleteClass */
    var why: Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/rdfxmlparser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** DOM Level 2 node type magic numbers @final
      *  @member RDFParser
      */
    @JSImport("rdflib/lib/rdfxmlparser", "default.nodeType")
    @js.native
    def nodeType: ATTRIBUTE = js.native
    inline def nodeType_=(x: ATTRIBUTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeType")(x.asInstanceOf[js.Any])
    
    /** Standard namespaces that we know how to handle @final
      *  @member RDFParser
      */
    @JSImport("rdflib/lib/rdfxmlparser", "default.ns")
    @js.native
    def ns: RDF = js.native
    inline def ns_=(x: RDF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ns")(x.asInstanceOf[js.Any])
  }
  
  trait RDFParser extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * Builds scope frame
      * @private
      */
    /* private */ var buildFrame: Any
    
    /**
      * Cleans out state from a previous parse run
      * @private
      */
    /* private */ var cleanParser: Any
    
    /**
      * Frame class for namespace and base URI lookups
      * Base lookups will always resolve because the parser knows
      * the default base.
      *
      * @private
      */
    /* private */ var frameFactory: Any
    
    def getAttributeNodeNS(node: Any, uri: Any, name: Any): Any
    
    /**
      * Build our initial scope frame and parse the DOM into triples
      * @param {HTMLDocument} document The DOM to parse
      * @param {String} base The base URL to use
      * @param {Object} why The context to which this resource belongs
      */
    def parse(document: HTMLDocument, base: String, why: Any): Boolean
    
    def parseDOM(frame: Any): Unit
    
    /** Reification flag */
    var reify: Boolean
    
    /** Our triple store reference @private */
    var store: Any
    
    /** A context for context-aware stores @private */
    var why: Any
  }
  object RDFParser {
    
    inline def apply(
      buildFrame: Any,
      cleanParser: Any,
      frameFactory: Any,
      getAttributeNodeNS: (Any, Any, Any) => Any,
      parse: (HTMLDocument, String, Any) => Boolean,
      parseDOM: Any => Unit,
      reify: Boolean,
      store: Any,
      why: Any
    ): RDFParser = {
      val __obj = js.Dynamic.literal(buildFrame = buildFrame.asInstanceOf[js.Any], cleanParser = cleanParser.asInstanceOf[js.Any], frameFactory = frameFactory.asInstanceOf[js.Any], getAttributeNodeNS = js.Any.fromFunction3(getAttributeNodeNS), parse = js.Any.fromFunction3(parse), parseDOM = js.Any.fromFunction1(parseDOM), reify = reify.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], why = why.asInstanceOf[js.Any])
      __obj.asInstanceOf[RDFParser]
    }
    
    extension [Self <: RDFParser](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBuildFrame(value: Any): Self = StObject.set(x, "buildFrame", value.asInstanceOf[js.Any])
      
      inline def setCleanParser(value: Any): Self = StObject.set(x, "cleanParser", value.asInstanceOf[js.Any])
      
      inline def setFrameFactory(value: Any): Self = StObject.set(x, "frameFactory", value.asInstanceOf[js.Any])
      
      inline def setGetAttributeNodeNS(value: (Any, Any, Any) => Any): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction3(value))
      
      inline def setParse(value: (HTMLDocument, String, Any) => Boolean): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setParseDOM(value: Any => Unit): Self = StObject.set(x, "parseDOM", js.Any.fromFunction1(value))
      
      inline def setReify(value: Boolean): Self = StObject.set(x, "reify", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setWhy(value: Any): Self = StObject.set(x, "why", value.asInstanceOf[js.Any])
    }
  }
}
