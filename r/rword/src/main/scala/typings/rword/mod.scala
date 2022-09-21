package typings.rword

import typings.rword.rwordNumbers.`1`
import typings.rword.rwordStrings.all
import typings.rword.rwordStrings.big
import typings.rword.rwordStrings.first
import typings.rword.rwordStrings.none
import typings.rword.rwordStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rword", "rword")
  @js.native
  open class rword () extends StObject
  /* static members */
  object rword {
    
    @JSImport("rword", "rword")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Randomly generates words from the words array
      */
    inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
    inline def generate(count: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def generate(count: Double, opt: GenerateOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def generate(count: Unit, opt: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * A simple generator that pulls words from a prefilled global pool. Should
      *  be preferred over `rword.generate()` if custom filters are not needed as
      *  this method can in certain instances be many times faster.
      * @param count - Words to return. Throws error if greater than `10`
      */
    inline def generateFromPool(): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFromPool")().asInstanceOf[String | js.Array[String]]
    inline def generateFromPool(count: Double): String | js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFromPool")(count.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[String]]
    
    inline def generate_1(count: `1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def generate_1(count: `1`, opt: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(count.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("rword", "rword.globalPool")
    @js.native
    def globalPool: js.Array[String] = js.native
    inline def globalPool_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalPool")(x.asInstanceOf[js.Any])
    
    /**
      * Load and shuffle word list
      */
    inline def load(list: big | small): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(list.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Shuffles words and globalPool arrays
      */
    inline def shuffle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")().asInstanceOf[Unit]
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
    var contains: js.UndefOr[js.RegExp | String] = js.undefined
    
    /**
      * A length or range of lengths that a word must match for it to have a
      *  chance of being randomly chosen
      * @example 5
      * @example "3-10"
      */
    var length: js.UndefOr[String | Double] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setCapitalize(value: none | first | all): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      inline def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      inline def setContains(value: js.RegExp | String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setLength(value: String | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
}
