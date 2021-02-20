package typings.purdy

import typings.purdy.purdyStrings.left
import typings.purdy.purdyStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("purdy", JSImport.Namespace)
  @js.native
  def apply(obj: js.Object, options: Options): Unit = js.native
  
  @JSImport("purdy", "purdy")
  @js.native
  def purdy(options: Options): Instance = js.native
  
  @JSImport("purdy", "stringify")
  @js.native
  def stringify(obj: js.Object, options: Options): String = js.native
  
  @js.native
  trait Instance extends StObject {
    
    def apply(obj: js.Object, options: Options): Unit = js.native
    
    def print(args: js.Any*): Unit = js.native
    
    def stringify(args: js.Any*): String = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var align: js.UndefOr[left | right] = js.native
    
    var arrayIndex: js.UndefOr[Boolean] = js.native
    
    var depth: js.UndefOr[Double | Null] = js.native
    
    var indent: js.UndefOr[Double] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[Boolean] = js.native
    
    var pathPrefix: js.UndefOr[String] = js.native
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var proto: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setArrayIndex(value: Boolean): Self = StObject.set(x, "arrayIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayIndexUndefined: Self = StObject.set(x, "arrayIndex", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthNull: Self = StObject.set(x, "depth", null)
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setPath(value: Boolean): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setProto(value: Boolean): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
}
