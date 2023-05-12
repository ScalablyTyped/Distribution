package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StringDictionary
import typings.storybookTheming.storybookThemingBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmotionCache extends StObject {
  
  var compat: js.UndefOr[`true`] = js.undefined
  
  def insert(selector: String, serialized: SerializedStyles, sheet: StyleSheet, shouldCache: Boolean): String | Unit
  
  var inserted: StringDictionary[String | `true`]
  
  var key: String
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var registered: RegisteredCache
  
  var sheet: StyleSheet
}
object EmotionCache {
  
  inline def apply(
    insert: (String, SerializedStyles, StyleSheet, Boolean) => String | Unit,
    inserted: StringDictionary[String | `true`],
    key: String,
    registered: RegisteredCache,
    sheet: StyleSheet
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert), inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmotionCache] (val x: Self) extends AnyVal {
    
    inline def setCompat(value: `true`): Self = StObject.set(x, "compat", value.asInstanceOf[js.Any])
    
    inline def setCompatUndefined: Self = StObject.set(x, "compat", js.undefined)
    
    inline def setInsert(value: (String, SerializedStyles, StyleSheet, Boolean) => String | Unit): Self = StObject.set(x, "insert", js.Any.fromFunction4(value))
    
    inline def setInserted(value: StringDictionary[String | `true`]): Self = StObject.set(x, "inserted", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setRegistered(value: RegisteredCache): Self = StObject.set(x, "registered", value.asInstanceOf[js.Any])
    
    inline def setSheet(value: StyleSheet): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
  }
}
