package typings.sassGraph

import org.scalablytyped.runtime.StringDictionary
import typings.sassGraph.anon.ImportedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDir(dirpath: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[Graph]
  inline def parseDir(dirpath: String, options: Options): Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDir")(dirpath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graph]
  
  inline def parseFile(filepath: String): Graph = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[Graph]
  inline def parseFile(filepath: String, options: Options): Graph = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFile")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Graph]
  
  @js.native
  trait Graph extends StObject {
    
    /**
      * Add a sass file to the graph
      * @param {string} filepath Path to the file to visit
      * @param {string} [parent] Parent filepath
      */
    def addFile(filepath: String): Unit = js.native
    def addFile(filepath: String, parent: String): Unit = js.native
    
    var dir: String = js.native
    
    var extensions: js.Array[String] = js.native
    
    var index: Node = js.native
    
    var loadPaths: js.Array[String] = js.native
    
    /**
      * A generic visitor that uses an edgeCallback to find the edges to traverse
      * for a node
      * @param {string}   filepath     Path to the file to visit
      * @param {Function} callback     Called when a node is visited
      * @param {Function} edgeCallback Called when we reach an edge
      * @param {string[]} [visited]    Visited edges
      */
    def visit(
      filepath: String,
      callback: js.Function2[/* edge */ String, /* node */ Node, Any],
      edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, Any]
    ): Unit = js.native
    def visit(
      filepath: String,
      callback: js.Function2[/* edge */ String, /* node */ Node, Any],
      edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, Any],
      visited: js.Array[String]
    ): Unit = js.native
    
    /**
      * visits all files that are ancestors of the provided file
      * @param {string}   filepath Path to the file to visit
      * @param {Function} callback Called when a node is visited
      */
    def visitAncestors(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, Any]): Unit = js.native
    
    /**
      * Visits all files that are descendents of the provided file
      * @param {string}   filepath Path to the file to visit
      * @param {Function} callback Called when a node is visited
      */
    def visitDescendents(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, Any]): Unit = js.native
  }
  
  type Node = StringDictionary[ImportedBy]
  
  trait Options extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    var loadPath: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setLoadPath(value: js.Array[String]): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      inline def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
      
      inline def setLoadPathVarargs(value: String*): Self = StObject.set(x, "loadPath", js.Array(value*))
    }
  }
}
