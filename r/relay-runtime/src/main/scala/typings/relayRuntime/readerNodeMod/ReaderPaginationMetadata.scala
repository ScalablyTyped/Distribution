package typings.relayRuntime.readerNodeMod

import typings.relayRuntime.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaderPaginationMetadata extends StObject {
  
  val backward: Count | Null
  
  val forward: Count | Null
  
  val path: js.Array[String]
}
object ReaderPaginationMetadata {
  
  @scala.inline
  def apply(path: js.Array[String]): ReaderPaginationMetadata = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], backward = null, forward = null)
    __obj.asInstanceOf[ReaderPaginationMetadata]
  }
  
  @scala.inline
  implicit class ReaderPaginationMetadataMutableBuilder[Self <: ReaderPaginationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackward(value: Count): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardNull: Self = StObject.set(x, "backward", null)
    
    @scala.inline
    def setForward(value: Count): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardNull: Self = StObject.set(x, "forward", null)
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
