package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpVersion extends StObject {
  
  var major: Double
  
  var minor: Double
}
object HttpVersion {
  
  @scala.inline
  def apply(major: Double, minor: Double): HttpVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpVersion]
  }
  
  @scala.inline
  implicit class HttpVersionMutableBuilder[Self <: HttpVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
