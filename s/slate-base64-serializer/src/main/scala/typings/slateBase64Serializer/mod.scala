package typings.slateBase64Serializer

import typings.slate.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("slate-base64-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(string: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(string.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def deserialize(string: String, options: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def deserializeNode(string: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeNode")(string.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def deserializeNode(string: String, options: js.Object): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeNode")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def serialize(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Value */ Any,
    options: js.Object
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeNode(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeNode(node: Node, options: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeNode")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
