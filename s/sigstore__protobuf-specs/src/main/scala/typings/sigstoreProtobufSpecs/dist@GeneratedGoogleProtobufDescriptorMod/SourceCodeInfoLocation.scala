package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeInfoLocation extends StObject {
  
  /**
    * If this SourceCodeInfo represents a complete declaration, these are any
    * comments appearing before and after the declaration which appear to be
    * attached to the declaration.
    *
    * A series of line comments appearing on consecutive lines, with no other
    * tokens appearing on those lines, will be treated as a single comment.
    *
    * leading_detached_comments will keep paragraphs of comments that appear
    * before (but not connected to) the current element. Each paragraph,
    * separated by empty lines, will be one comment element in the repeated
    * field.
    *
    * Only the comment content is provided; comment markers (e.g. //) are
    * stripped out.  For block comments, leading whitespace and an asterisk
    * will be stripped from the beginning of each line other than the first.
    * Newlines are included in the output.
    *
    * Examples:
    *
    *   optional int32 foo = 1;  // Comment attached to foo.
    *   // Comment attached to bar.
    *   optional int32 bar = 2;
    *
    *   optional string baz = 3;
    *   // Comment attached to baz.
    *   // Another line attached to baz.
    *
    *   // Comment attached to moo.
    *   //
    *   // Another line attached to moo.
    *   optional double moo = 4;
    *
    *   // Detached comment for corge. This is not leading or trailing comments
    *   // to moo or corge because there are blank lines separating it from
    *   // both.
    *
    *   // Detached comment for corge paragraph 2.
    *
    *   optional string corge = 5;
    *   / * Block comment attached
    *    * to corge.  Leading asterisks
    *    * will be removed. * /
    *   / * Block comment attached to
    *    * grault. * /
    *   optional int32 grault = 6;
    *
    *   // ignored detached comments.
    */
  var leadingComments: String
  
  var leadingDetachedComments: js.Array[String]
  
  /**
    * Identifies which part of the FileDescriptorProto was defined at this
    * location.
    *
    * Each element is a field number or an index.  They form a path from
    * the root FileDescriptorProto to the place where the definition occurs.
    * For example, this path:
    *   [ 4, 3, 2, 7, 1 ]
    * refers to:
    *   file.message_type(3)  // 4, 3
    *       .field(7)         // 2, 7
    *       .name()           // 1
    * This is because FileDescriptorProto.message_type has field number 4:
    *   repeated DescriptorProto message_type = 4;
    * and DescriptorProto.field has field number 2:
    *   repeated FieldDescriptorProto field = 2;
    * and FieldDescriptorProto.name has field number 1:
    *   optional string name = 1;
    *
    * Thus, the above path gives the location of a field name.  If we removed
    * the last element:
    *   [ 4, 3, 2, 7 ]
    * this path refers to the whole field declaration (from the beginning
    * of the label to the terminating semicolon).
    */
  var path: js.Array[Double]
  
  /**
    * Always has exactly three or four elements: start line, start column,
    * end line (optional, otherwise assumed same as start line), end column.
    * These are packed into a single field for efficiency.  Note that line
    * and column numbers are zero-based -- typically you will want to add
    * 1 to each before displaying to a user.
    */
  var span: js.Array[Double]
  
  var trailingComments: String
}
object SourceCodeInfoLocation {
  
  inline def apply(
    leadingComments: String,
    leadingDetachedComments: js.Array[String],
    path: js.Array[Double],
    span: js.Array[Double],
    trailingComments: String
  ): SourceCodeInfoLocation = {
    val __obj = js.Dynamic.literal(leadingComments = leadingComments.asInstanceOf[js.Any], leadingDetachedComments = leadingDetachedComments.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeInfoLocation]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "SourceCodeInfo_Location")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): SourceCodeInfoLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfoLocation]
  
  inline def toJSON(message: SourceCodeInfoLocation): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCodeInfoLocation] (val x: Self) extends AnyVal {
    
    inline def setLeadingComments(value: String): Self = StObject.set(x, "leadingComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetachedComments(value: js.Array[String]): Self = StObject.set(x, "leadingDetachedComments", value.asInstanceOf[js.Any])
    
    inline def setLeadingDetachedCommentsVarargs(value: String*): Self = StObject.set(x, "leadingDetachedComments", js.Array(value*))
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSpan(value: js.Array[Double]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
    
    inline def setSpanVarargs(value: Double*): Self = StObject.set(x, "span", js.Array(value*))
    
    inline def setTrailingComments(value: String): Self = StObject.set(x, "trailingComments", value.asInstanceOf[js.Any])
  }
}
