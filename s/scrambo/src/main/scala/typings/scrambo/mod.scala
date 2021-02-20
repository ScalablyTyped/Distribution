package typings.scrambo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrambo", JSImport.Namespace)
  @js.native
  class ^ () extends Scrambo
  
  /* Rewritten from type alias, can be one of: 
    - typings.scrambo.scramboStrings.`222`
    - typings.scrambo.scramboStrings.`333`
    - typings.scrambo.scramboStrings.`444`
    - typings.scrambo.scramboStrings.`555`
    - typings.scrambo.scramboStrings.`666`
    - typings.scrambo.scramboStrings.`777`
  */
  trait NNN extends StObject
  object NNN {
    
    @scala.inline
    def `222`: typings.scrambo.scramboStrings.`222` = "222".asInstanceOf[typings.scrambo.scramboStrings.`222`]
    
    @scala.inline
    def `333`: typings.scrambo.scramboStrings.`333` = "333".asInstanceOf[typings.scrambo.scramboStrings.`333`]
    
    @scala.inline
    def `444`: typings.scrambo.scramboStrings.`444` = "444".asInstanceOf[typings.scrambo.scramboStrings.`444`]
    
    @scala.inline
    def `555`: typings.scrambo.scramboStrings.`555` = "555".asInstanceOf[typings.scrambo.scramboStrings.`555`]
    
    @scala.inline
    def `666`: typings.scrambo.scramboStrings.`666` = "666".asInstanceOf[typings.scrambo.scramboStrings.`666`]
    
    @scala.inline
    def `777`: typings.scrambo.scramboStrings.`777` = "777".asInstanceOf[typings.scrambo.scramboStrings.`777`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scrambo.scramboStrings.clock
    - typings.scrambo.scramboStrings.minx
    - typings.scrambo.scramboStrings.pyram
    - typings.scrambo.scramboStrings.sq1
    - typings.scrambo.scramboStrings.skewb
    - typings.scrambo.scramboStrings.`222`
    - typings.scrambo.scramboStrings.`333`
    - typings.scrambo.scramboStrings.`444`
    - typings.scrambo.scramboStrings.`555`
    - typings.scrambo.scramboStrings.`666`
    - typings.scrambo.scramboStrings.`777`
  */
  trait ScrambleType extends StObject
  object ScrambleType {
    
    @scala.inline
    def `222`: typings.scrambo.scramboStrings.`222` = "222".asInstanceOf[typings.scrambo.scramboStrings.`222`]
    
    @scala.inline
    def `333`: typings.scrambo.scramboStrings.`333` = "333".asInstanceOf[typings.scrambo.scramboStrings.`333`]
    
    @scala.inline
    def `444`: typings.scrambo.scramboStrings.`444` = "444".asInstanceOf[typings.scrambo.scramboStrings.`444`]
    
    @scala.inline
    def `555`: typings.scrambo.scramboStrings.`555` = "555".asInstanceOf[typings.scrambo.scramboStrings.`555`]
    
    @scala.inline
    def `666`: typings.scrambo.scramboStrings.`666` = "666".asInstanceOf[typings.scrambo.scramboStrings.`666`]
    
    @scala.inline
    def `777`: typings.scrambo.scramboStrings.`777` = "777".asInstanceOf[typings.scrambo.scramboStrings.`777`]
    
    @scala.inline
    def clock: typings.scrambo.scramboStrings.clock = "clock".asInstanceOf[typings.scrambo.scramboStrings.clock]
    
    @scala.inline
    def minx: typings.scrambo.scramboStrings.minx = "minx".asInstanceOf[typings.scrambo.scramboStrings.minx]
    
    @scala.inline
    def pyram: typings.scrambo.scramboStrings.pyram = "pyram".asInstanceOf[typings.scrambo.scramboStrings.pyram]
    
    @scala.inline
    def skewb: typings.scrambo.scramboStrings.skewb = "skewb".asInstanceOf[typings.scrambo.scramboStrings.skewb]
    
    @scala.inline
    def sq1: typings.scrambo.scramboStrings.sq1 = "sq1".asInstanceOf[typings.scrambo.scramboStrings.sq1]
  }
  
  @js.native
  trait Scrambo extends StObject {
    
    /**
      * Returns an array of random scrambles with the given length
      * for the configured scrambler type.
      * @param number defaults to 1
      */
    def get(): js.Array[String] = js.native
    def get(number: Double): js.Array[String] = js.native
    
    /**
      * Returns the currently configured scramble length.
      */
    def length(): Double = js.native
    /**
      * Sets this instance's scramble length and returns the original instance.
      * @param length
      */
    def length(length: Double): Scrambo = js.native
    
    /**
      * Returns the current seed type of this scrambler.
      */
    def seed(): Double = js.native
    /**
      * Sets this instance's seed and returns the original instance.
      * @param seed
      */
    def seed(seed: Double): Scrambo = js.native
    
    /**
      * Returns the currently configured scrambler type.
      */
    def `type`(): ScrambleType = js.native
    /**
      * Sets this instance's scrambler type and returns the original instance.
      * @param type
      */
    def `type`(`type`: ScrambleType): Scrambo = js.native
  }
}
