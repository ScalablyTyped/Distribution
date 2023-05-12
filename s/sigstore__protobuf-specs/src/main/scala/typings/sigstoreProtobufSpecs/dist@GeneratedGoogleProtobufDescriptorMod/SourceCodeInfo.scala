package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeInfo extends StObject {
  
  /**
    * A Location identifies a piece of source code in a .proto file which
    * corresponds to a particular definition.  This information is intended
    * to be useful to IDEs, code indexers, documentation generators, and similar
    * tools.
    *
    * For example, say we have a file like:
    *   message Foo {
    *     optional string foo = 1;
    *   }
    * Let's look at just the field definition:
    *   optional string foo = 1;
    *   ^       ^^     ^^  ^  ^^^
    *   a       bc     de  f  ghi
    * We have the following locations:
    *   span   path               represents
    *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
    *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
    *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
    *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
    *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
    *
    * Notes:
    * - A location may refer to a repeated field itself (i.e. not to any
    *   particular index within it).  This is used whenever a set of elements are
    *   logically enclosed in a single code segment.  For example, an entire
    *   extend block (possibly containing multiple extension definitions) will
    *   have an outer location whose path refers to the "extensions" repeated
    *   field without an index.
    * - Multiple locations may have the same path.  This happens when a single
    *   logical declaration is spread out across multiple places.  The most
    *   obvious example is the "extend" block again -- there may be multiple
    *   extend blocks in the same scope, each of which will have the same path.
    * - A location's span is not always a subset of its parent's span.  For
    *   example, the "extendee" of an extension declaration appears at the
    *   beginning of the "extend" block and is shared by all extensions within
    *   the block.
    * - Just because a location's span is a subset of some other location's span
    *   does not mean that it is a descendant.  For example, a "group" defines
    *   both a type and a field in a single declaration.  Thus, the locations
    *   corresponding to the type and field and their components will overlap.
    * - Code which tries to interpret locations should probably be designed to
    *   ignore those that it doesn't understand, as more types of locations could
    *   be recorded in the future.
    */
  var location: js.Array[SourceCodeInfoLocation]
}
object SourceCodeInfo {
  
  inline def apply(location: js.Array[SourceCodeInfoLocation]): SourceCodeInfo = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeInfo]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  
  inline def toJSON(message: SourceCodeInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCodeInfo] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: js.Array[SourceCodeInfoLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationVarargs(value: SourceCodeInfoLocation*): Self = StObject.set(x, "location", js.Array(value*))
  }
}
