package typings.ssbKeys

import typings.node.bufferMod.global.Buffer
import typings.ssbKeys.anon.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssb-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def box(content: String, recipients: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(content.asInstanceOf[js.Any], recipients.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def box(content: js.Object, recipients: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(content.asInstanceOf[js.Any], recipients.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def box(content: Boolean, recipients: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(content.asInstanceOf[js.Any], recipients.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def box(content: Double, recipients: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(content.asInstanceOf[js.Any], recipients.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generate(): Keys = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Keys]
  inline def generate(curve: String): Keys = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(curve.asInstanceOf[js.Any]).asInstanceOf[Keys]
  inline def generate(curve: String, seed: Buffer): Keys = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(curve.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Keys]
  inline def generate(curve: Unit, seed: Buffer): Keys = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(curve.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Keys]
  
  inline def getTag(ssb_id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(ssb_id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(data: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hash(data: Buffer, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadOrCreate(filename: String, cb: js.Function2[/* err */ js.Error | Null, /* keys */ Keys, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadOrCreate")(filename.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadOrCreateSync(filename: String): Keys = ^.asInstanceOf[js.Dynamic].applyDynamic("loadOrCreateSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Keys]
  
  inline def secretBox(obj: js.Object, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("secretBox")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def secretUnbox(boxed: Buffer, key: Buffer): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("secretUnbox")(boxed.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def signObj[T /* <: js.Object */](keys: Keys, hmac_key: String, obj: T): T & Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("signObj")(keys.asInstanceOf[js.Any], hmac_key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T & Signature]
  inline def signObj[T /* <: js.Object */](keys: Keys, obj: T): T & Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("signObj")(keys.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T & Signature]
  
  inline def unbox(boxed: String, keys: Keys): js.UndefOr[js.Object | String | Boolean | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unbox")(boxed.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object | String | Boolean | Double]]
  
  inline def unboxBody(boxed: String, msg_key: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unboxBody")(boxed.asInstanceOf[js.Any], msg_key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def unboxKey(boxed: String, keys: Keys): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unboxKey")(boxed.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def verifyObj(keys: Keys, hmac_key: String, obj: Signature): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyObj")(keys.asInstanceOf[js.Any], hmac_key.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verifyObj(keys: Keys, obj: Signature): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyObj")(keys.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Keys extends StObject {
    
    var curve: String
    
    var id: String
    
    var `private`: String
    
    var public: String
  }
  object Keys {
    
    inline def apply(curve: String, id: String, `private`: String, public: String): Keys = {
      val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
