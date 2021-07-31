package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinerStructure extends StObject {
  
  /** Keyword */
  var k: String
  
  var l: Double
  
  var r: js.Array[RefinementCategory]
}
object RefinerStructure {
  
  @scala.inline
  def apply(k: String, l: Double, r: js.Array[RefinementCategory]): RefinerStructure = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinerStructure]
  }
  
  @scala.inline
  implicit class RefinerStructureMutableBuilder[Self <: RefinerStructure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: js.Array[RefinementCategory]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRVarargs(value: RefinementCategory*): Self = StObject.set(x, "r", js.Array(value :_*))
  }
}
