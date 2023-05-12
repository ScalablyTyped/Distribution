package typings.rdflib

import typings.rdflib.anon.Boolean
import typings.rdflib.anon.Incoming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSerializerMod {
  
  @JSImport("rdflib/lib/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(store: Any): Serializer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(store.asInstanceOf[js.Any]).asInstanceOf[Serializer]
  
  @JSImport("rdflib/lib/serializer", "Serializer")
  @js.native
  open class Serializer protected () extends StObject {
    def this(store: Any) = this()
    
    var _notNameChars: String = js.native
    
    var _notQNameChars: String = js.native
    
    def atomicTermToN3(expr: Any, stats: Any): Any = js.native
    
    var base: Any = js.native
    
    def checkIntegrity(): Unit = js.native
    
    var defaultNamespace: js.UndefOr[String] = js.native
    
    def explicitURI(uri: Any): String = js.native
    
    var flags: String = js.native
    
    var forbidden1: js.RegExp = js.native
    
    var forbidden3: js.RegExp = js.native
    
    var formulas: js.Array[Any] = js.native
    
    def fromStr(s: Any): Any = js.native
    
    var incoming: js.Object | Null = js.native
    
    var keywords: js.Array[String] = js.native
    
    def makeUpPrefix(uri: Any): Any = js.native
    
    var namespaces: js.Array[Any] = js.native
    
    var namespacesUsed: js.Array[Any] = js.native
    
    var prefixchars: String = js.native
    
    var prefixes: js.Array[String] = js.native
    
    var rdfFactory: Any = js.native
    
    def rootSubjects(sts: Any): Incoming = js.native
    
    def setBase(base: Any): Serializer = js.native
    
    def setFlags(flags: Any): Serializer = js.native
    
    /**
      * Defines a set of [prefix, namespace] pairs to be used by this Serializer instance.
      * Overrides previous prefixes if any
      * @param namespaces
      * @return {Serializer}
      */
    def setNamespaces(namespaces: Any): Serializer = js.native
    
    /**
      * Defines a namespace prefix, overriding any existing prefix for that URI
      * @param prefix
      * @param uri
      */
    def setPrefix(prefix: Any, uri: Any): Unit = js.native
    
    def statementsToJsonld(sts: Any): String = js.native
    
    def statementsToN3(sts: Any): String = js.native
    
    def statementsToNTriples(sts: Any): String = js.native
    
    def statementsToXML(sts: Any): String = js.native
    
    var store: Any = js.native
    
    def stringToN3(str: Any, flags: Any): String = js.native
    
    def suggestNamespaces(namespaces: Any): Serializer = js.native
    
    def suggestPrefix(prefix: Any, uri: Any): Unit = js.native
    
    def symbolToN3(x: Any): Any = js.native
    
    def toN3(f: Any): String = js.native
    
    def toStr(x: Any): Any = js.native
    
    var validPrefix: js.RegExp = js.native
    
    def writeStore(write: Any): Unit = js.native
    
    var xsd: Boolean = js.native
  }
}
