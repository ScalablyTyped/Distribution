package typings.saxStream

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sax-stream", JSImport.Namespace)
  @js.native
  def apply(options: Options): Transform = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Size of internal transform stream buffer - defaults to 350 objects.
      */
    var highWaterMark: js.UndefOr[Double] = js.native
    
    /**
      * If true, then lowercase tag names and attribute names in loose mode, rather than uppercasing them.
      */
    var lowercase: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, then turn any whitespace into a single space.
      */
    var normalize: js.UndefOr[Boolean] = js.native
    
    /**
      * Default to false, if true makes sax parser to accept valid XML only.
      */
    var strict: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, only parse predefined XML entities (&amp;, &apos;, &gt;, &lt;, and &quot;).
      */
    var strictEntities: js.UndefOr[Boolean] = js.native
    
    /**
      * Name of the tag to select objects from XML file, an Array of tag names can be used -
      * when multiple tags are specified stream pushes `{ tag, record }` tuples.
      */
    var tag: String | js.Array[String] = js.native
    
    /**
      * If false, then don't track line/col/position.
      */
    var trackPosition: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not to trim text and comment nodes.
      */
    var trim: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, then namespaces are supported.
      */
    var xmlns: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(tag: String | js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      @scala.inline
      def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictEntities(value: Boolean): Self = StObject.set(x, "strictEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictEntitiesUndefined: Self = StObject.set(x, "strictEntities", js.undefined)
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      @scala.inline
      def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value :_*))
      
      @scala.inline
      def setTrackPosition(value: Boolean): Self = StObject.set(x, "trackPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackPositionUndefined: Self = StObject.set(x, "trackPosition", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
}
