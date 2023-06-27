package typings.prosemirrorTestBuilder

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTestBuilder.anon.Eq
import typings.prosemirrorTestBuilder.anon.Flat
import typings.prosemirrorTestBuilder.anon.NodetagTags
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.addBefore
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.addToEnd
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.addToStart
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.append
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.constructor
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.forEach
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.get
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.prepend
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.remove
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.size
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.subtract
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.toObject
import typings.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.update
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
  
  inline def builders[Nodes /* <: String */, Marks /* <: String */](schema: Schema[Nodes, Marks]): Builders_[Schema[Nodes, Marks]] = ^.asInstanceOf[js.Dynamic].applyDynamic("builders")(schema.asInstanceOf[js.Any]).asInstanceOf[Builders_[Schema[Nodes, Marks]]]
  inline def builders[Nodes /* <: String */, Marks /* <: String */](schema: Schema[Nodes, Marks], names: StringDictionary[Attrs]): Builders_[Schema[Nodes, Marks]] = (^.asInstanceOf[js.Dynamic].applyDynamic("builders")(schema.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Builders_[Schema[Nodes, Marks]]]
  
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
  val schema: Schema[
    /* keyof orderedmap.orderedmap.default<prosemirror-model.prosemirror-model.NodeSpec> */ constructor | size | get | update | remove | addToStart | addToEnd | addBefore | forEach | prepend | append | subtract | toObject, 
    /* keyof orderedmap.orderedmap.default<prosemirror-model.prosemirror-model.MarkSpec> */ constructor | size | get | update | remove | addToStart | addToEnd | addBefore | forEach | prepend | append | subtract | toObject
  ] = js.native
  
  @JSImport("prosemirror-test-builder", "strong")
  @js.native
  val strong: MarkBuilder = js.native
  
  @JSImport("prosemirror-test-builder", "ul")
  @js.native
  val ul: NodeBuilder = js.native
  
  @js.native
  trait Builders_[S /* <: Schema[Any, Any] */]
    extends StObject
       with /* name */ StringDictionary[NodeBuilder | MarkBuilder] {
    
    var schema: S = js.native
  }
  
  type ChildSpec = String | Node | Flat
  
  @js.native
  trait MarkBuilder extends StObject {
    
    def apply(attrsOrFirstChild: Unit, children: ChildSpec*): ChildSpec = js.native
    def apply(attrsOrFirstChild: Attrs, children: ChildSpec*): ChildSpec = js.native
    def apply(attrsOrFirstChild: ChildSpec, children: ChildSpec*): ChildSpec = js.native
  }
  
  @js.native
  trait NodeBuilder extends StObject {
    
    def apply(attrsOrFirstChild: Unit, children: ChildSpec*): NodetagTags = js.native
    def apply(attrsOrFirstChild: Attrs, children: ChildSpec*): NodetagTags = js.native
    def apply(attrsOrFirstChild: ChildSpec, children: ChildSpec*): NodetagTags = js.native
  }
  
  type Tags = StringDictionary[Double]
}
