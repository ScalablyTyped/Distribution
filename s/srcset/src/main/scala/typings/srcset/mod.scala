package typings.srcset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("srcset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Parse the HTML `<img>` [srcset](http://mobile.smashingmagazine.com/2013/08/21/webkit-implements-srcset-and-why-its-a-good-thing/) attribute.
  	@param srcset - A srcset string.
  	@example
  	```
  	import srcset = require('srcset');
  	console.log(srcset.parse('banner-HD.jpg 2x, banner-phone.jpg 100w'));
  	// [
  	// 	{
  	// 		url: 'banner-HD.jpg',
  	// 		density: 2
  	// 	},
  	// 	{
  	// 		url: 'banner-phone.jpg',
  	// 		width: 100
  	// 	}
  	// ]
  	```
  	*/
  @scala.inline
  def parse(srcset: String): js.Array[SrcSetDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(srcset.asInstanceOf[js.Any]).asInstanceOf[js.Array[SrcSetDefinition]]
  
  /**
  	Stringify `SrcSetDefinition`s.
  	@returns A srcset string.
  	@example
  	```
  	import srcset = require('srcset');
  	const stringified = srcset.stringify([
  		{
  			url: 'banner-HD.jpg',
  			density: 2
  		},
  		{
  			url: 'banner-phone.jpg',
  			width: 100
  		},
  		{
  			url: 'banner-phone-HD.jpg',
  			width: 100,
  			density: 2
  		}
  	]);
  	console.log(stringified);
  	// banner-HD.jpg 2x, banner-phone.jpg 100w, banner-phone-HD.jpg 100w 2x
  	```
  	*/
  @scala.inline
  def stringify(srcSetDefinitions: js.Array[SrcSetDefinition]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(srcSetDefinitions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SrcSetDefinition extends StObject {
    
    var density: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SrcSetDefinition {
    
    @scala.inline
    def apply(url: String): SrcSetDefinition = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SrcSetDefinition]
    }
    
    @scala.inline
    implicit class SrcSetDefinitionMutableBuilder[Self <: SrcSetDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
