package typings.readPackageTree

import org.scalablytyped.runtime.StringDictionary
import typings.readPackageTree.readPackageTreeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: String, cb: js.Function2[/* er */ js.Error | Null, /* data */ Node, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    root: String,
    filterWith: js.Function2[/* node */ Node, /* kidName */ String, js.UndefOr[Unit | Boolean]],
    cb: js.Function2[/* er */ js.Error | Null, /* data */ Node, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], filterWith.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("read-package-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("read-package-tree", "Link")
  @js.native
  open class Link protected () extends Node {
    def this(
      pkg: Any,
      logical: String,
      physical: String,
      realpath: String,
      er: js.Error,
      cache: StringDictionary[Node]
    ) = this()
    def this(
      pkg: Any,
      logical: String,
      physical: String,
      realpath: String,
      er: Null,
      cache: StringDictionary[Node]
    ) = this()
    
    @JSName("isLink")
    var isLink_Link: `true` = js.native
    
    var target: Node = js.native
  }
  
  @JSImport("read-package-tree", "Node")
  @js.native
  open class Node protected () extends StObject {
    def this(pkg: Any, logical: String, physical: String, er: js.Error, cache: StringDictionary[Node]) = this()
    def this(pkg: Any, logical: String, physical: String, er: Null, cache: StringDictionary[Node]) = this()
    def this(
      pkg: Any,
      logical: String,
      physical: String,
      er: js.Error,
      cache: StringDictionary[Node],
      fromLink: Boolean
    ) = this()
    def this(
      pkg: Any,
      logical: String,
      physical: String,
      er: Null,
      cache: StringDictionary[Node],
      fromLink: Boolean
    ) = this()
    
    @JSName("package")
    var _package: Any = js.native
    
    var children: js.Array[Node] = js.native
    
    var error: js.Error | Null = js.native
    
    var id: Double = js.native
    
    var isLink: Boolean = js.native
    
    var name: String = js.native
    
    var parent: Node | Null = js.native
    
    var path: String = js.native
    
    var realpath: String = js.native
  }
}
