package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexSourceMapSection extends StObject {
  
  var map: IndexSourceMap | BasicSourceMap
  
  var offset: Column
}
object IndexSourceMapSection {
  
  inline def apply(map: IndexSourceMap | BasicSourceMap, offset: Column): IndexSourceMapSection = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSourceMapSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexSourceMapSection] (val x: Self) extends AnyVal {
    
    inline def setMap(value: IndexSourceMap | BasicSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Column): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
