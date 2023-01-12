package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleId extends StObject {
  
  var bundleId: js.UndefOr[String] = js.undefined
}
object BundleId {
  
  inline def apply(): BundleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BundleId] (val x: Self) extends AnyVal {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
  }
}
