package typings.soap

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNscontextMod {
  
  @JSImport("soap/lib/nscontext", "NamespaceContext")
  @js.native
  open class NamespaceContext () extends StObject {
    
    /**
      * Add a prefix/URI namespace mapping
      * @param {String} prefix Namespace prefix
      * @param {String} nsUri Namespace URI
      * @param {Boolean} [localOnly] Search current scope only
      * @returns {boolean} true if the mapping is added or false if the mapping
      * already exists
      */
    def addNamespace(prefix: String, nsUri: String): Boolean = js.native
    def addNamespace(prefix: String, nsUri: String, localOnly: Boolean): Boolean = js.native
    
    var currentScope: js.UndefOr[NamespaceScope] = js.native
    
    /**
      * Declare a namespace prefix/uri mapping
      * @param {String} prefix Namespace prefix
      * @param {String} nsUri Namespace URI
      * @returns {Boolean} true if the declaration is created
      */
    def declareNamespace(prefix: String, nsUri: String): Boolean = js.native
    
    /**
      * Look up the namespace URI by prefix
      * @param {String} prefix Namespace prefix
      * @param {Boolean} [localOnly] Search current scope only
      * @returns {String} Namespace URI
      */
    def getNamespaceURI(prefix: String): String = js.native
    def getNamespaceURI(prefix: String, localOnly: Boolean): String = js.native
    
    /**
      * Look up the namespace prefix by URI
      * @param {String} nsURI Namespace URI
      * @param {Boolean} [localOnly] Search current scope only
      * @returns {String} Namespace prefix
      */
    def getPrefix(nsUri: String): String = js.native
    def getPrefix(nsUri: String, localOnly: Boolean): String = js.native
    
    /**
      * Pop a scope out of the context
      * @returns {NamespaceScope} The removed scope
      */
    def popContext(): NamespaceScope = js.native
    
    var prefixCount: Double = js.native
    
    /**
      * Push a scope into the context
      * @returns {NamespaceScope} The current scope
      */
    def pushContext(): NamespaceScope = js.native
    
    /**
      * Register a namespace
      * @param {String} nsUri Namespace URI
      * @returns {String} The matching or generated namespace prefix
      */
    def registerNamespace(nsUri: String): String = js.native
    
    var scopes: js.Array[NamespaceScope] = js.native
  }
  
  trait INamespace extends StObject {
    
    var declared: Boolean
    
    var prefix: String
    
    var uri: String
  }
  object INamespace {
    
    inline def apply(declared: Boolean, prefix: String, uri: String): INamespace = {
      val __obj = js.Dynamic.literal(declared = declared.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[INamespace]
    }
    
    extension [Self <: INamespace](x: Self) {
      
      inline def setDeclared(value: Boolean): Self = StObject.set(x, "declared", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Scope for XML namespaces
    * @param {NamespaceScope} [parent] Parent scope
    * @returns {NamespaceScope}
    * @constructor
    */
  @js.native
  trait NamespaceScope extends StObject {
    
    def getNamespaceMapping(prefix: String): INamespace = js.native
    
    /**
      * Look up the namespace URI by prefix
      * @param {String} prefix Namespace prefix
      * @param {Boolean} [localOnly] Search current scope only
      * @returns {String} Namespace URI
      */
    def getNamespaceURI(prefix: String): String = js.native
    def getNamespaceURI(prefix: String, localOnly: Boolean): String = js.native
    
    /**
      * Look up the namespace prefix by URI
      * @param {String} nsUri Namespace URI
      * @param {Boolean} [localOnly] Search current scope only
      * @returns {String} Namespace prefix
      */
    def getPrefix(nsUri: String): String = js.native
    def getPrefix(nsUri: String, localOnly: Boolean): String = js.native
    
    var namespaces: StringDictionary[INamespace] = js.native
    
    var parent: NamespaceScope = js.native
  }
}
