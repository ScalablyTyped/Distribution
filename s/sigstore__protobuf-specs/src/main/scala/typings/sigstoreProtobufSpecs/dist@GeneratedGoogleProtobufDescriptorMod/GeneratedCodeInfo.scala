package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedCodeInfo extends StObject {
  
  /**
    * An Annotation connects some span of text in generated code to an element
    * of its generating .proto file.
    */
  var annotation: js.Array[GeneratedCodeInfoAnnotation]
}
object GeneratedCodeInfo {
  
  inline def apply(annotation: js.Array[GeneratedCodeInfoAnnotation]): GeneratedCodeInfo = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedCodeInfo]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  
  inline def toJSON(message: GeneratedCodeInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedCodeInfo] (val x: Self) extends AnyVal {
    
    inline def setAnnotation(value: js.Array[GeneratedCodeInfoAnnotation]): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setAnnotationVarargs(value: GeneratedCodeInfoAnnotation*): Self = StObject.set(x, "annotation", js.Array(value*))
  }
}
