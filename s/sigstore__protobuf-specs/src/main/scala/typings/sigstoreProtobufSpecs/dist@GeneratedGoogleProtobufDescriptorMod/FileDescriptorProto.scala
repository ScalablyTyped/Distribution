package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDescriptorProto extends StObject {
  
  /** e.g. "foo", "foo.bar", etc. */
  @JSName("package")
  var _package: String
  
  /** Names of files imported by this file. */
  var dependency: js.Array[String]
  
  var enumType: js.Array[EnumDescriptorProto]
  
  var `extension`: js.Array[FieldDescriptorProto]
  
  /** All top-level definitions in this file. */
  var messageType: js.Array[DescriptorProto]
  
  /** file name, relative to root of source tree */
  var name: String
  
  var options: js.UndefOr[FileOptions] = js.undefined
  
  /** Indexes of the public imported files in the dependency list above. */
  var publicDependency: js.Array[Double]
  
  var service: js.Array[ServiceDescriptorProto]
  
  /**
    * This field contains optional information about the original source code.
    * You may safely remove this entire field without harming runtime
    * functionality of the descriptors -- the information is needed only by
    * development tools.
    */
  var sourceCodeInfo: js.UndefOr[SourceCodeInfo] = js.undefined
  
  /**
    * The syntax of the proto file.
    * The supported values are "proto2" and "proto3".
    */
  var syntax: String
  
  /**
    * Indexes of the weak imported files in the dependency list.
    * For Google-internal migration only. Do not use.
    */
  var weakDependency: js.Array[Double]
}
object FileDescriptorProto {
  
  inline def apply(
    _package: String,
    dependency: js.Array[String],
    enumType: js.Array[EnumDescriptorProto],
    `extension`: js.Array[FieldDescriptorProto],
    messageType: js.Array[DescriptorProto],
    name: String,
    publicDependency: js.Array[Double],
    service: js.Array[ServiceDescriptorProto],
    syntax: String,
    weakDependency: js.Array[Double]
  ): FileDescriptorProto = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], enumType = enumType.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicDependency = publicDependency.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any], weakDependency = weakDependency.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDescriptorProto]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  
  inline def toJSON(message: FileDescriptorProto): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setDependency(value: js.Array[String]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyVarargs(value: String*): Self = StObject.set(x, "dependency", js.Array(value*))
    
    inline def setEnumType(value: js.Array[EnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeVarargs(value: EnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setExtension(value: js.Array[FieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionVarargs(value: FieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setMessageType(value: js.Array[DescriptorProto]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeVarargs(value: DescriptorProto*): Self = StObject.set(x, "messageType", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FileOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPublicDependency(value: js.Array[Double]): Self = StObject.set(x, "publicDependency", value.asInstanceOf[js.Any])
    
    inline def setPublicDependencyVarargs(value: Double*): Self = StObject.set(x, "publicDependency", js.Array(value*))
    
    inline def setService(value: js.Array[ServiceDescriptorProto]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceVarargs(value: ServiceDescriptorProto*): Self = StObject.set(x, "service", js.Array(value*))
    
    inline def setSourceCodeInfo(value: SourceCodeInfo): Self = StObject.set(x, "sourceCodeInfo", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeInfoUndefined: Self = StObject.set(x, "sourceCodeInfo", js.undefined)
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    inline def setWeakDependency(value: js.Array[Double]): Self = StObject.set(x, "weakDependency", value.asInstanceOf[js.Any])
    
    inline def setWeakDependencyVarargs(value: Double*): Self = StObject.set(x, "weakDependency", js.Array(value*))
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
