package typings.shrinkRay

import typings.shrinkRay.shrinkRayInts.`-1`
import typings.shrinkRay.shrinkRayInts.`0`
import typings.shrinkRay.shrinkRayInts.`10`
import typings.shrinkRay.shrinkRayInts.`11`
import typings.shrinkRay.shrinkRayInts.`1`
import typings.shrinkRay.shrinkRayInts.`2`
import typings.shrinkRay.shrinkRayInts.`3`
import typings.shrinkRay.shrinkRayInts.`4`
import typings.shrinkRay.shrinkRayInts.`5`
import typings.shrinkRay.shrinkRayInts.`6`
import typings.shrinkRay.shrinkRayInts.`7`
import typings.shrinkRay.shrinkRayInts.`8`
import typings.shrinkRay.shrinkRayInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lgblock extends StObject {
    
    var lgblock: Double
    
    var lgwin: Double
    
    var mode: `0` | `1` | `2`
    
    var quality: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
  }
  object Lgblock {
    
    inline def apply(
      lgblock: Double,
      lgwin: Double,
      mode: `0` | `1` | `2`,
      quality: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
    ): Lgblock = {
      val __obj = js.Dynamic.literal(lgblock = lgblock.asInstanceOf[js.Any], lgwin = lgwin.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lgblock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lgblock] (val x: Self) extends AnyVal {
      
      inline def setLgblock(value: Double): Self = StObject.set(x, "lgblock", value.asInstanceOf[js.Any])
      
      inline def setLgwin(value: Double): Self = StObject.set(x, "lgwin", value.asInstanceOf[js.Any])
      
      inline def setMode(value: `0` | `1` | `2`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  flush :number | undefined,   finishFlush :number | undefined,   chunkSize :number | undefined,   windowBits :number | undefined,   strategy :number | undefined,   dictionary :any | undefined,   level :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}> */
  trait Partialflushnumberundefin extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var dictionary: js.UndefOr[Any] = js.undefined
    
    var finishFlush: js.UndefOr[Double] = js.undefined
    
    var flush: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
    
    var memLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
    
    var strategy: js.UndefOr[Double] = js.undefined
    
    var windowBits: js.UndefOr[Double] = js.undefined
  }
  object Partialflushnumberundefin {
    
    inline def apply(): Partialflushnumberundefin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialflushnumberundefin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Partialflushnumberundefin] (val x: Self) extends AnyVal {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setDictionary(value: Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
      
      inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
      
      inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
      
      inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
      
      inline def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMemLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
}
