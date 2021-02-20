package typings.sassGraph

import org.scalablytyped.runtime.StringDictionary
import typings.sassGraph.anon.ImportedBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass-graph", "parseDir")
  @js.native
  def parseDir(dirpath: String): Graph = js.native
  @JSImport("sass-graph", "parseDir")
  @js.native
  def parseDir(dirpath: String, options: Options): Graph = js.native
  
  @JSImport("sass-graph", "parseFile")
  @js.native
  def parseFile(filepath: String): Graph = js.native
  @JSImport("sass-graph", "parseFile")
  @js.native
  def parseFile(filepath: String, options: Options): Graph = js.native
  
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
      callback: js.Function2[/* edge */ String, /* node */ Node, _],
      edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, _]
    ): Unit = js.native
    def visit(
      filepath: String,
      callback: js.Function2[/* edge */ String, /* node */ Node, _],
      edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, _],
      visited: js.Array[String]
    ): Unit = js.native
    
    /**
      * visits all files that are ancestors of the provided file
      * @param {string}   filepath Path to the file to visit
      * @param {Function} callback Called when a node is visited
      */
    def visitAncestors(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, _]): Unit = js.native
    
    /**
      * Visits all files that are descendents of the provided file
      * @param {string}   filepath Path to the file to visit
      * @param {Function} callback Called when a node is visited
      */
    def visitDescendents(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, _]): Unit = js.native
  }
  
  type Node = StringDictionary[ImportedBy]
  
  @js.native
  trait Options extends StObject {
    
    var extensions: js.UndefOr[js.Array[String]] = js.native
    
    var loadPath: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setLoadPath(value: js.Array[String]): Self = StObject.set(x, "loadPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadPathUndefined: Self = StObject.set(x, "loadPath", js.undefined)
      
      @scala.inline
      def setLoadPathVarargs(value: String*): Self = StObject.set(x, "loadPath", js.Array(value :_*))
    }
  }
}
