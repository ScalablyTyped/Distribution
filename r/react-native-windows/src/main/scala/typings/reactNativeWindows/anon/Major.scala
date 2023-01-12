package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Major extends StObject {
  
  var major: Double
  
  var minor: Double
  
  var patch: Double
  
  var prerelease: js.UndefOr[Double | Null] = js.undefined
}
object Major {
  
  inline def apply(major: Double, minor: Double, patch: Double): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Major] (val x: Self) extends AnyVal {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPrerelease(value: Double): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    inline def setPrereleaseNull: Self = StObject.set(x, "prerelease", null)
    
    inline def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
  }
}
