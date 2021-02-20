package typings.sourceMap.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawIndexMap extends StartOfSourceMap {
  
  var sections: js.Array[RawSection] = js.native
  
  var version: Double = js.native
}
object RawIndexMap {
  
  @scala.inline
  def apply(sections: js.Array[RawSection], version: Double): RawIndexMap = {
    val __obj = js.Dynamic.literal(sections = sections.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawIndexMap]
  }
  
  @scala.inline
  implicit class RawIndexMapMutableBuilder[Self <: RawIndexMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSections(value: js.Array[RawSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionsVarargs(value: RawSection*): Self = StObject.set(x, "sections", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
