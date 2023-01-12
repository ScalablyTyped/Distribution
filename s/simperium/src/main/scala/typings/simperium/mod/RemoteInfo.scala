package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteInfo[T] extends StObject {
  
  var isIndexing: Boolean
  
  var original: T
  
  var patch: JSONDiff[T]
}
object RemoteInfo {
  
  inline def apply[T](isIndexing: Boolean, original: T, patch: JSONDiff[T]): RemoteInfo[T] = {
    val __obj = js.Dynamic.literal(isIndexing = isIndexing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoteInfo[?], T] (val x: Self & RemoteInfo[T]) extends AnyVal {
    
    inline def setIsIndexing(value: Boolean): Self = StObject.set(x, "isIndexing", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: T): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: JSONDiff[T]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
