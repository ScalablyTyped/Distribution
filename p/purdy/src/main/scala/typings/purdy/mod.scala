package typings.purdy

import typings.purdy.purdyStrings.left
import typings.purdy.purdyStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: js.Object, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("purdy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def purdy(options: Options): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("purdy")(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  inline def stringify(obj: js.Object, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait Instance extends StObject {
    
    def apply(obj: js.Object, options: Options): Unit = js.native
    
    def print(args: js.Any*): Unit = js.native
    
    def stringify(args: js.Any*): String = js.native
  }
  
  trait Options extends StObject {
    
    var align: js.UndefOr[left | right] = js.undefined
    
    var arrayIndex: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[Boolean] = js.undefined
    
    var pathPrefix: js.UndefOr[String] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var proto: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrayIndex(value: Boolean): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
      
      inline def setArrayIndexUndefined: Self = StObject.set(x, "arrayIndex", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setProto(value: Boolean): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
}
