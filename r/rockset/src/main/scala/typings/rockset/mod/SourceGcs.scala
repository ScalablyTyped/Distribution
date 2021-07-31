package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceGcs extends StObject {
  
  // name of GCS bucket you want to ingest from
  var bucket: js.UndefOr[String] = js.undefined
  
  // Prefix that selects keys to ingest.
  var prefix: js.UndefOr[String] = js.undefined
}
object SourceGcs {
  
  @scala.inline
  def apply(): SourceGcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGcs]
  }
  
  @scala.inline
  implicit class SourceGcsMutableBuilder[Self <: SourceGcs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
