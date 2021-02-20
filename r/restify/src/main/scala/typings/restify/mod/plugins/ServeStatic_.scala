package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServeStatic_ extends StObject {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var appendRequestPath: js.UndefOr[Boolean] = js.native
  
  var charSet: js.UndefOr[String] = js.native
  
  var directory: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var gzip: js.UndefOr[Boolean] = js.native
  
  var `match`: js.UndefOr[js.Any] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
}
object ServeStatic_ {
  
  @scala.inline
  def apply(): ServeStatic_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStatic_]
  }
  
  @scala.inline
  implicit class ServeStatic_MutableBuilder[Self <: ServeStatic_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendRequestPath(value: Boolean): Self = StObject.set(x, "appendRequestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendRequestPathUndefined: Self = StObject.set(x, "appendRequestPath", js.undefined)
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
