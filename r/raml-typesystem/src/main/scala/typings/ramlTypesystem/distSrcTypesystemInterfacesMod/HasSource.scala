package typings.ramlTypesystem.distSrcTypesystemInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasSource extends StObject {
  
  def sourceMap(): ElementSourceInfo
}
object HasSource {
  
  inline def apply(sourceMap: () => ElementSourceInfo): HasSource = {
    val __obj = js.Dynamic.literal(sourceMap = js.Any.fromFunction0(sourceMap))
    __obj.asInstanceOf[HasSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasSource] (val x: Self) extends AnyVal {
    
    inline def setSourceMap(value: () => ElementSourceInfo): Self = StObject.set(x, "sourceMap", js.Any.fromFunction0(value))
  }
}
