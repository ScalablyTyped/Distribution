package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedCodeInfoAnnotation extends StObject {
  
  /**
    * Identifies the starting offset in bytes in the generated code
    * that relates to the identified object.
    */
  var begin: Double
  
  /**
    * Identifies the ending offset in bytes in the generated code that
    * relates to the identified offset. The end offset should be one past
    * the last relevant byte (so the length of the text = end - begin).
    */
  var end: Double
  
  /**
    * Identifies the element in the original source .proto file. This field
    * is formatted the same as SourceCodeInfo.Location.path.
    */
  var path: js.Array[Double]
  
  /** Identifies the filesystem path to the original source .proto. */
  var sourceFile: String
}
object GeneratedCodeInfoAnnotation {
  
  inline def apply(begin: Double, end: Double, path: js.Array[Double], sourceFile: String): GeneratedCodeInfoAnnotation = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedCodeInfoAnnotation]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "GeneratedCodeInfo_Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfoAnnotation]
  
  inline def toJSON(message: GeneratedCodeInfoAnnotation): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedCodeInfoAnnotation] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: Double): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
  }
}
