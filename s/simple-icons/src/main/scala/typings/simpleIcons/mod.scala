package typings.simpleIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simple-icons", "get")
  @js.native
  def get(name: String): SimpleIcon = js.native
  
  @js.native
  trait SimpleIcon extends StObject {
    
    var hex: String = js.native
    
    var path: String = js.native
    
    var slug: String = js.native
    
    var source: String = js.native
    
    var svg: String = js.native
    
    var title: String = js.native
  }
  object SimpleIcon {
    
    @scala.inline
    def apply(hex: String, path: String, slug: String, source: String, svg: String, title: String): SimpleIcon = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleIcon]
    }
    
    @scala.inline
    implicit class SimpleIconMutableBuilder[Self <: SimpleIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
