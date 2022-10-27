package typings.prosemirrorTestBuilder

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTestBuilder.anon.Eq
import typings.prosemirrorTestBuilder.anon.Flat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-test-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-test-builder", "a")
  @js.native
  val a: MarkBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "blockquote")
  @js.native
  val blockquote: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "br")
  @js.native
  val br: NodeBuilder = js.native
  
  inline def builders(schema: Schema[Any, Any]): typings.prosemirrorTestBuilder.anon.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("builders")(schema.asInstanceOf[js.Any]).asInstanceOf[typings.prosemirrorTestBuilder.anon.Schema]
  inline def builders(schema: Schema[Any, Any], names: StringDictionary[Attrs]): typings.prosemirrorTestBuilder.anon.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("builders")(schema.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[typings.prosemirrorTestBuilder.anon.Schema]
  
  @JSImport("prosemirror-test-builder", "code")
  @js.native
  val code: MarkBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "code_block")
  @js.native
  val codeBlock: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "doc")
  @js.native
  val doc: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "em")
  @js.native
  val em: MarkBuilder = js.native
  
  inline def eq_[T /* <: Eq[T] */](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("prosemirror-test-builder", "h1")
  @js.native
  val h1: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "h2")
  @js.native
  val h2: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "h3")
  @js.native
  val h3: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "hr")
  @js.native
  val hr: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "img")
  @js.native
  val img: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "li")
  @js.native
  val li: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "ol")
  @js.native
  val ol: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "p")
  @js.native
  val p: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "pre")
  @js.native
  val pre: NodeBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "schema")
  @js.native
  val schema: Schema[Any, Any] = js.native
  
  @JSImport("prosemirror-test-builder", "strong")
  @js.native
  val strong: MarkBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "ul")
  @js.native
  val ul: NodeBuilder = js.native
  
  type ChildSpec = String | Node | Flat
  
  @js.native
  trait MarkBuilder extends StObject {
    
    def apply(attrsOrFirstChild: Unit, children: ChildSpec*): ChildSpec = js.native
    def apply(attrsOrFirstChild: Attrs, children: ChildSpec*): ChildSpec = js.native
    def apply(attrsOrFirstChild: ChildSpec, children: ChildSpec*): ChildSpec = js.native
  }
  
  @js.native
  trait NodeBuilder extends StObject {
    
    def apply(attrsOrFirstChild: Unit, children: ChildSpec*): Node = js.native
    def apply(attrsOrFirstChild: Attrs, children: ChildSpec*): Node = js.native
    def apply(attrsOrFirstChild: ChildSpec, children: ChildSpec*): Node = js.native
  }
  
  type Tags = StringDictionary[Double]
}
