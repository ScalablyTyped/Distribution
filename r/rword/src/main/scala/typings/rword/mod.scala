package typings.rword

import typings.rword.rwordStrings.all
import typings.rword.rwordStrings.big
import typings.rword.rwordStrings.first
import typings.rword.rwordStrings.none
import typings.rword.rwordStrings.small
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rword", "rword")
  @js.native
  class rword () extends StObject
  /* static members */
  object rword {
    
    @JSImport("rword", "rword")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Randomly generates words from the words array
      */
    @scala.inline
    def generate(): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String | js.Array[String]]
    @scala.inline
    def generate(count: Double): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
    @scala.inline
    def generate(count: Double, opt: GenerateOptions): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
    @scala.inline
    def generate(count: Unit, opt: GenerateOptions): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
    
    /**
      * A simple generator that pulls words from a prefilled global pool. Should
      *  be preferred over `rword.generate()` if custom filters are not needed as
      *  this method can in certain instances be many times faster.
      * @param count - Words to return. Throws error if greater than `10`
      */
    @scala.inline
    def generateFromPool(): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFromPool")().asInstanceOf[String | js.Array[String]]
    @scala.inline
    def generateFromPool(count: Double): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFromPool")(count.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
    
    @JSImport("rword", "rword.globalPool")
    @js.native
    def globalPool: js.Array[String] = js.native
    @scala.inline
    def globalPool_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalPool")(x.asInstanceOf[js.Any])
    
    /**
      * Load and shuffle word list
      */
    @scala.inline
    def load_big(list: big): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def load_small(list: small): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Shuffles words and globalPool arrays
      */
    @scala.inline
    def shuffle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")().asInstanceOf[Unit]
  }
  
  trait GenerateOptions extends StObject {
    
    /**
      * Sets the capitalization of the randomly chosen words
      */
    var capitalize: js.UndefOr[none | first | all] = js.undefined
    
    /**
      * Regex words must match to have a chance of being randomly chosen
      * @example "word"
      * @example /ing$/
      */
    var contains: js.UndefOr[RegExp | String] = js.undefined
    
    /**
      * A length or range of lengths that a word must match for it to have a
      *  chance of being randomly chosen
      * @example 5
      * @example "3-10"
      */
    var length: js.UndefOr[String | Double] = js.undefined
  }
  object GenerateOptions {
    
    @scala.inline
    def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit class GenerateOptionsMutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapitalize(value: none | first | all): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      @scala.inline
      def setContains(value: RegExp | String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setLength(value: String | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
}
