package typings.reactNativeFirebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleId extends StObject {
  
  var bundleId: js.UndefOr[String] = js.undefined
}
object BundleId {
  
  @scala.inline
  def apply(): BundleId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleId]
  }
  
  @scala.inline
  implicit class BundleIdMutableBuilder[Self <: BundleId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
  }
}
