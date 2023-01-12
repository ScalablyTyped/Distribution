package typings.slate

import typings.slate.distInterfacesEditorMod.Editor
import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesElementMod.ElementEntry
import typings.slate.distInterfacesPathMod.Path
import typings.slate.distInterfacesRangeMod.Range
import typings.slate.distInterfacesTextMod.Text
import typings.slate.slateStrings.children
import typings.slate.slateStrings.text_
import typings.std.Generator
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesNodeMod {
  
  @JSImport("slate/dist/interfaces/node", "Node")
  @js.native
  val Node: NodeInterface = js.native
  type Node = Editor | Element | Text
  
  type Ancestor = Editor | Element
  
  type BaseNode = Editor | Element | Text
  
  type Descendant = Element | Text
  
  trait NodeAncestorsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeAncestorsOptions {
    
    inline def apply(): NodeAncestorsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeAncestorsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeAncestorsOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeChildrenOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeChildrenOptions {
    
    inline def apply(): NodeChildrenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeChildrenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeChildrenOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeDescendantsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeDescendantsOptions {
    
    inline def apply(): NodeDescendantsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeDescendantsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeDescendantsOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait NodeElementsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeElementsOptions {
    
    inline def apply(): NodeElementsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeElementsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeElementsOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type NodeEntry[T /* <: typings.slate.distInterfacesNodeMod.Node */] = js.Tuple2[T, Path]
  
  @js.native
  trait NodeInterface extends StObject {
    
    def ancestor(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Ancestor = js.native
    
    def ancestors(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[Ancestor], Unit, Unit] = js.native
    def ancestors(root: typings.slate.distInterfacesNodeMod.Node, path: Path, options: NodeAncestorsOptions): Generator[NodeEntry[Ancestor], Unit, Unit] = js.native
    
    def child(root: typings.slate.distInterfacesNodeMod.Node, index: Double): Descendant = js.native
    
    def children(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    def children(root: typings.slate.distInterfacesNodeMod.Node, path: Path, options: NodeChildrenOptions): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    
    def common(root: typings.slate.distInterfacesNodeMod.Node, path: Path, another: Path): NodeEntry[typings.slate.distInterfacesNodeMod.Node] = js.native
    
    def descendant(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Descendant = js.native
    
    def descendants(root: typings.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    def descendants(root: typings.slate.distInterfacesNodeMod.Node, options: NodeDescendantsOptions): Generator[NodeEntry[Descendant], Unit, Unit] = js.native
    
    def elements(root: typings.slate.distInterfacesNodeMod.Node): Generator[ElementEntry, Unit, Unit] = js.native
    def elements(root: typings.slate.distInterfacesNodeMod.Node, options: NodeElementsOptions): Generator[ElementEntry, Unit, Unit] = js.native
    
    def extractProps(node: typings.slate.distInterfacesNodeMod.Node): NodeProps = js.native
    
    def first(root: typings.slate.distInterfacesNodeMod.Node, path: Path): NodeEntry[typings.slate.distInterfacesNodeMod.Node] = js.native
    
    def fragment(root: typings.slate.distInterfacesNodeMod.Node, range: Range): js.Array[Descendant] = js.native
    
    def get(root: typings.slate.distInterfacesNodeMod.Node, path: Path): typings.slate.distInterfacesNodeMod.Node = js.native
    
    def has(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Boolean = js.native
    
    def isNode(value: Any): /* is slate.slate/dist/interfaces/node.Node */ Boolean = js.native
    
    def isNodeList(value: Any): /* is std.Array<slate.slate/dist/interfaces/node.Node> */ Boolean = js.native
    
    def last(root: typings.slate.distInterfacesNodeMod.Node, path: Path): NodeEntry[typings.slate.distInterfacesNodeMod.Node] = js.native
    
    def leaf(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Text = js.native
    
    def levels(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Generator[NodeEntry[typings.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    def levels(root: typings.slate.distInterfacesNodeMod.Node, path: Path, options: NodeLevelsOptions): Generator[NodeEntry[typings.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    
    def matches(
      node: typings.slate.distInterfacesNodeMod.Node,
      props: Partial[typings.slate.distInterfacesNodeMod.Node]
    ): Boolean = js.native
    
    def nodes(root: typings.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[typings.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    def nodes(root: typings.slate.distInterfacesNodeMod.Node, options: NodeNodesOptions): Generator[NodeEntry[typings.slate.distInterfacesNodeMod.Node], Unit, Unit] = js.native
    
    def parent(root: typings.slate.distInterfacesNodeMod.Node, path: Path): Ancestor = js.native
    
    def string(node: typings.slate.distInterfacesNodeMod.Node): String = js.native
    
    def texts(root: typings.slate.distInterfacesNodeMod.Node): Generator[NodeEntry[Text], Unit, Unit] = js.native
    def texts(root: typings.slate.distInterfacesNodeMod.Node, options: NodeTextsOptions): Generator[NodeEntry[Text], Unit, Unit] = js.native
  }
  
  trait NodeLevelsOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object NodeLevelsOptions {
    
    inline def apply(): NodeLevelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeLevelsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLevelsOptions] (val x: Self) extends AnyVal {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  trait NodeNodesOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* entry */ NodeEntry[typings.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeNodesOptions {
    
    inline def apply(): NodeNodesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeNodesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeNodesOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* entry */ NodeEntry[typings.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  type NodeProps = Omit[Editor | Element | Text, children | text_]
  
  trait NodeTextsOptions extends StObject {
    
    var from: js.UndefOr[Path] = js.undefined
    
    var pass: js.UndefOr[
        js.Function1[/* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node], Boolean]
      ] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Path] = js.undefined
  }
  object NodeTextsOptions {
    
    inline def apply(): NodeTextsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeTextsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeTextsOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Path): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setFromVarargs(value: Double*): Self = StObject.set(x, "from", js.Array(value*))
      
      inline def setPass(value: /* node */ NodeEntry[typings.slate.distInterfacesNodeMod.Node] => Boolean): Self = StObject.set(x, "pass", js.Any.fromFunction1(value))
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setTo(value: Path): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
}
