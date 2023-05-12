package typings.prettyBytes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(number: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(number.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Format the number using the [Binary Prefix](https://en.wikipedia.org/wiki/Binary_prefix) instead of the [SI Prefix](https://en.wikipedia.org/wiki/SI_prefix). This can be useful for presenting memory amounts. However, this should not be used for presenting file sizes.
    	@default false
    	@example
    	```
    	import prettyBytes from 'pretty-bytes';
    	prettyBytes(1000, {binary: true});
    	//=> '1000 bit'
    	prettyBytes(1024, {binary: true});
    	//=> '1 kiB'
    	```
    	*/
    val binary: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Format the number as [bits](https://en.wikipedia.org/wiki/Bit) instead of [bytes](https://en.wikipedia.org/wiki/Byte). This can be useful when, for example, referring to [bit rate](https://en.wikipedia.org/wiki/Bit_rate).
    	@default false
    	@example
    	```
    	import prettyBytes from 'pretty-bytes';
    	prettyBytes(1337, {bits: true});
    	//=> '1.34 kbit'
    	```
    	*/
    val bits: js.UndefOr[Boolean] = js.undefined
    
    /**
    	- If `false`: Output won't be localized.
    	- If `true`: Localize the output using the system/browser locale.
    	- If `string`: Expects a [BCP 47 language tag](https://en.wikipedia.org/wiki/IETF_language_tag) (For example: `en`, `de`, …)
    	- If `string[]`: Expects a list of [BCP 47 language tags](https://en.wikipedia.org/wiki/IETF_language_tag) (For example: `en`, `de`, …)
    	@default false
    	*/
    val locale: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /**
    	The maximum number of fraction digits to display.
    	If neither `minimumFractionDigits` or `maximumFractionDigits` are set, the default behavior is to round to 3 significant digits.
    	@default undefined
    	@example
    	```
    	import prettyBytes from 'pretty-bytes';
    	// Show the number with at most 1 fractional digit
    	prettyBytes(1920, {maximumFractionDigits: 1});
    	//=> '1.9 kB'
    	prettyBytes(1920);
    	//=> '1.92 kB'
    	```
    	*/
    val maximumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /**
    	The minimum number of fraction digits to display.
    	If neither `minimumFractionDigits` or `maximumFractionDigits` are set, the default behavior is to round to 3 significant digits.
    	@default undefined
    	@example
    	```
    	import prettyBytes from 'pretty-bytes';
    	// Show the number with at least 3 fractional digits
    	prettyBytes(1900, {minimumFractionDigits: 3});
    	//=> '1.900 kB'
    	prettyBytes(1900);
    	//=> '1.9 kB'
    	```
    	*/
    val minimumFractionDigits: js.UndefOr[Double] = js.undefined
    
    /**
    	Include plus sign for positive numbers. If the difference is exactly zero a space character will be prepended instead for better alignment.
    	@default false
    	*/
    val signed: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Put a space between the number and unit.
    	@default true
    	@example
    	```
    	import prettyBytes from 'pretty-bytes';
    	prettyBytes(1920, {space: false});
    	//=> '1.9kB'
    	prettyBytes(1920);
    	//=> '1.92 kB'
    	```
    	*/
    val space: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setBits(value: Boolean): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setLocale(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value*))
      
      inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
      
      inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
