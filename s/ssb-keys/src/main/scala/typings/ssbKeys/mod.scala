package typings.ssbKeys

import typings.node.Buffer
import typings.ssbKeys.anon.Signature
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssb-keys", "box")
  @js.native
  def box(content: String, recipients: js.Array[String]): String = js.native
  @JSImport("ssb-keys", "box")
  @js.native
  def box(content: js.Object, recipients: js.Array[String]): String = js.native
  @JSImport("ssb-keys", "box")
  @js.native
  def box(content: Boolean, recipients: js.Array[String]): String = js.native
  @JSImport("ssb-keys", "box")
  @js.native
  def box(content: Double, recipients: js.Array[String]): String = js.native
  
  @JSImport("ssb-keys", "generate")
  @js.native
  def generate(): Keys = js.native
  @JSImport("ssb-keys", "generate")
  @js.native
  def generate(curve: js.UndefOr[scala.Nothing], seed: Buffer): Keys = js.native
  @JSImport("ssb-keys", "generate")
  @js.native
  def generate(curve: String): Keys = js.native
  @JSImport("ssb-keys", "generate")
  @js.native
  def generate(curve: String, seed: Buffer): Keys = js.native
  
  @JSImport("ssb-keys", "getTag")
  @js.native
  def getTag(ssb_id: String): String = js.native
  
  @JSImport("ssb-keys", "hash")
  @js.native
  def hash(data: Buffer): String = js.native
  @JSImport("ssb-keys", "hash")
  @js.native
  def hash(data: Buffer, encoding: String): String = js.native
  
  @JSImport("ssb-keys", "loadOrCreate")
  @js.native
  def loadOrCreate(filename: String, cb: js.Function2[/* err */ Error | Null, /* keys */ Keys, _]): Unit = js.native
  
  @JSImport("ssb-keys", "loadOrCreateSync")
  @js.native
  def loadOrCreateSync(filename: String): Keys = js.native
  
  @JSImport("ssb-keys", "secretBox")
  @js.native
  def secretBox(obj: js.Object, key: Buffer): Buffer = js.native
  
  @JSImport("ssb-keys", "secretUnbox")
  @js.native
  def secretUnbox(boxed: Buffer, key: Buffer): js.Object = js.native
  
  @JSImport("ssb-keys", "signObj")
  @js.native
  def signObj[T /* <: js.Object */](keys: Keys, hmac_key: String, obj: T): T with Signature = js.native
  @JSImport("ssb-keys", "signObj")
  @js.native
  def signObj[T /* <: js.Object */](keys: Keys, obj: T): T with Signature = js.native
  
  @JSImport("ssb-keys", "unbox")
  @js.native
  def unbox(boxed: String, keys: Keys): js.UndefOr[js.Object | String | Boolean | Double] = js.native
  
  @JSImport("ssb-keys", "unboxBody")
  @js.native
  def unboxBody(boxed: String, msg_key: String): js.UndefOr[String | Null] = js.native
  
  @JSImport("ssb-keys", "unboxKey")
  @js.native
  def unboxKey(boxed: String, keys: Keys): js.UndefOr[String | Null] = js.native
  
  @JSImport("ssb-keys", "verifyObj")
  @js.native
  def verifyObj(keys: Keys, hmac_key: String, obj: Signature): Boolean = js.native
  @JSImport("ssb-keys", "verifyObj")
  @js.native
  def verifyObj(keys: Keys, obj: Signature): Boolean = js.native
  
  @js.native
  trait Keys extends StObject {
    
    var curve: String = js.native
    
    var id: String = js.native
    
    var `private`: String = js.native
    
    var public: String = js.native
  }
  object Keys {
    
    @scala.inline
    def apply(curve: String, id: String, `private`: String, public: String): Keys = {
      val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit class KeysMutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
