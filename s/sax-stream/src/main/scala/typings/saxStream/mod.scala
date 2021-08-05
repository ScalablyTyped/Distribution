package typings.saxStream

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("sax-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Size of internal transform stream buffer - defaults to 350 objects.
      */
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, then lowercase tag names and attribute names in loose mode, rather than uppercasing them.
      */
    var lowercase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, then turn any whitespace into a single space.
      */
    var normalize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default to false, if true makes sax parser to accept valid XML only.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, only parse predefined XML entities (&amp;, &apos;, &gt;, &lt;, and &quot;).
      */
    var strictEntities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the tag to select objects from XML file, an Array of tag names can be used -
      * when multiple tags are specified stream pushes `{ tag, record }` tuples.
      */
    var tag: String | js.Array[String]
    
    /**
      * If false, then don't track line/col/position.
      */
    var trackPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to trim text and comment nodes.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, then namespaces are supported.
      */
    var xmlns: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(tag: String | js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictEntities(value: Boolean): Self = StObject.set(x, "strictEntities", value.asInstanceOf[js.Any])
      
      inline def setStrictEntitiesUndefined: Self = StObject.set(x, "strictEntities", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTag(value: String | js.Array[String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagVarargs(value: String*): Self = StObject.set(x, "tag", js.Array(value :_*))
      
      inline def setTrackPosition(value: Boolean): Self = StObject.set(x, "trackPosition", value.asInstanceOf[js.Any])
      
      inline def setTrackPositionUndefined: Self = StObject.set(x, "trackPosition", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
      
      inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    }
  }
}
