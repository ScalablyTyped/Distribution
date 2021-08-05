package typings.rsocketCore

import typings.rsocketTypes.reactiveSocketTypesMod.Encodable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketserializationMod {
  
  @JSImport("rsocket-core/RSocketSerialization", "IdentitySerializer")
  @js.native
  val IdentitySerializer: Serializer[Encodable] = js.native
  
  object IdentitySerializers {
    
    @JSImport("rsocket-core/RSocketSerialization", "IdentitySerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core/RSocketSerialization", "IdentitySerializers.data")
    @js.native
    def data: Serializer[js.Any] = js.native
    inline def data_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketSerialization", "IdentitySerializers.metadata")
    @js.native
    def metadata: Serializer[js.Any] = js.native
    inline def metadata_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rsocket-core/RSocketSerialization", "JsonSerializer")
  @js.native
  val JsonSerializer: Serializer[js.Any] = js.native
  
  object JsonSerializers {
    
    @JSImport("rsocket-core/RSocketSerialization", "JsonSerializers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rsocket-core/RSocketSerialization", "JsonSerializers.data")
    @js.native
    def data: Serializer[js.Any] = js.native
    inline def data_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("rsocket-core/RSocketSerialization", "JsonSerializers.metadata")
    @js.native
    def metadata: Serializer[js.Any] = js.native
    inline def metadata_=(x: Serializer[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  trait PayloadSerializers[D, M] extends StObject {
    
    var data: Serializer[D]
    
    var metadata: Serializer[M]
  }
  object PayloadSerializers {
    
    inline def apply[D, M](data: Serializer[D], metadata: Serializer[M]): PayloadSerializers[D, M] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadSerializers[D, M]]
    }
    
    extension [Self <: PayloadSerializers[?, ?], D, M](x: Self & (PayloadSerializers[D, M])) {
      
      inline def setData(value: Serializer[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Serializer[M]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Serializer[T] extends StObject {
    
    def deserialize(): js.UndefOr[T] = js.native
    def deserialize(data: Encodable): js.UndefOr[T] = js.native
    
    def serialize(): js.UndefOr[Encodable] = js.native
    def serialize(data: T): js.UndefOr[Encodable] = js.native
  }
}
