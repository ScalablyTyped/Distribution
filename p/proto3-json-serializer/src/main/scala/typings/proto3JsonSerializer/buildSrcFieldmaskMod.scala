package typings.proto3JsonSerializer

import typings.proto3JsonSerializer.anon.Paths
import typings.protobufjs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcFieldmaskMod {
  
  @JSImport("proto3-json-serializer/build/src/fieldmask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def googleProtobufFieldMaskFromProto3JSON(json: String): Paths = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufFieldMaskFromProto3JSON")(json.asInstanceOf[js.Any]).asInstanceOf[Paths]
  
  inline def googleProtobufFieldMaskToProto3JSON(obj: Message[js.Object] & FieldMask): String = ^.asInstanceOf[js.Dynamic].applyDynamic("googleProtobufFieldMaskToProto3JSON")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait FieldMask extends StObject {
    
    var paths: js.Array[String]
  }
  object FieldMask {
    
    inline def apply(paths: js.Array[String]): FieldMask = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldMask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldMask] (val x: Self) extends AnyVal {
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
}
