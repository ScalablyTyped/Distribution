package typings.snowpackEnv

import typings.snowpackEnv.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportMeta extends StObject {
  
  val env: Dictkey
  
  // TypeScript Bug: https://github.com/microsoft/TypeScript/issues/41468
  // When TS bug is fixed and ecosystem has upgraded, then it will be safe
  // to change `hot` to the more correct "possibly undefined" (hot?: ...).
  val hot: ImportMetaHot
  
  val url: String
}
object ImportMeta {
  
  inline def apply(env: Dictkey, hot: ImportMetaHot, url: String): ImportMeta = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
  
  extension [Self <: ImportMeta](x: Self) {
    
    inline def setEnv(value: Dictkey): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setHot(value: ImportMetaHot): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
