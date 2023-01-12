package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceS3 extends StObject {
  
  /**
    * address of S3 bucket containing data
    * @type {string}
    * @memberof SourceS3
    */
  var bucket: String
  
  /**
    * Pattern that selects keys to ingest.
    * @type {string}
    * @memberof SourceS3
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix that selects keys to ingest.
    * @type {string}
    * @memberof SourceS3
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object SourceS3 {
  
  inline def apply(bucket: String): SourceS3 = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceS3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceS3] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
