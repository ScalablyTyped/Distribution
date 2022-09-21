package typings.sitemapGenerator

import typings.sitemapGenerator.mod.FreqValues
import typings.sitemapGenerator.mod.PriorityValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChangeFreq extends StObject {
    
    var changeFreq: js.UndefOr[FreqValues] = js.undefined
    
    var filepath: js.UndefOr[String | Null] = js.undefined
    
    var ignore: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
    
    var ignoreAMP: js.UndefOr[Boolean] = js.undefined
    
    var lastMod: js.UndefOr[Boolean] = js.undefined
    
    var maxEntriesPerFile: js.UndefOr[Double] = js.undefined
    
    var priorityMap: js.UndefOr[js.Array[PriorityValues]] = js.undefined
  }
  object ChangeFreq {
    
    inline def apply(): ChangeFreq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeFreq]
    }
    
    extension [Self <: ChangeFreq](x: Self) {
      
      inline def setChangeFreq(value: FreqValues): Self = StObject.set(x, "changeFreq", value.asInstanceOf[js.Any])
      
      inline def setChangeFreqUndefined: Self = StObject.set(x, "changeFreq", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathNull: Self = StObject.set(x, "filepath", null)
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setIgnore(value: /* url */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreAMP(value: Boolean): Self = StObject.set(x, "ignoreAMP", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAMPUndefined: Self = StObject.set(x, "ignoreAMP", js.undefined)
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setLastMod(value: Boolean): Self = StObject.set(x, "lastMod", value.asInstanceOf[js.Any])
      
      inline def setLastModUndefined: Self = StObject.set(x, "lastMod", js.undefined)
      
      inline def setMaxEntriesPerFile(value: Double): Self = StObject.set(x, "maxEntriesPerFile", value.asInstanceOf[js.Any])
      
      inline def setMaxEntriesPerFileUndefined: Self = StObject.set(x, "maxEntriesPerFile", js.undefined)
      
      inline def setPriorityMap(value: js.Array[PriorityValues]): Self = StObject.set(x, "priorityMap", value.asInstanceOf[js.Any])
      
      inline def setPriorityMapUndefined: Self = StObject.set(x, "priorityMap", js.undefined)
      
      inline def setPriorityMapVarargs(value: PriorityValues*): Self = StObject.set(x, "priorityMap", js.Array(value*))
    }
  }
}
