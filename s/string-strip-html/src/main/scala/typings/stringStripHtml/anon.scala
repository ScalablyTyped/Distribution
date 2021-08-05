package typings.stringStripHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LimitLinebreaksCount extends StObject {
    
    /**
      * This is the number of maximum consecutive line breaks allowed in collapsed result.
      * Practically, setting this to 2 would allow single blank lines in the output (for example, between paragraphs).
      *
      * Default: 1
      */
    var limitLinebreaksCount: Double
    
    /**
      * If set to true, if to-be-added string (3rd element in the range array) contains only whitespace (trim()s to empty string),
      * replace it with: either line break \n (if there's at least one line break or \r in it) or with a single space (all other cases).
      * Same applies when we have a string, surrounded by whitespace. That whitespace will be replaced with space or line break.
      *
      * Default: false
      */
    var limitToBeAddedWhitespace: Boolean
    
    /**
      * Default mode, 1 is concatenate clashing values, but alternative mode 2 is newer value overwrites older.
      *
      * Default: 1
      */
    var mergeType: Double
  }
  object LimitLinebreaksCount {
    
    inline def apply(limitLinebreaksCount: Double, limitToBeAddedWhitespace: Boolean, mergeType: Double): LimitLinebreaksCount = {
      val __obj = js.Dynamic.literal(limitLinebreaksCount = limitLinebreaksCount.asInstanceOf[js.Any], limitToBeAddedWhitespace = limitToBeAddedWhitespace.asInstanceOf[js.Any], mergeType = mergeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LimitLinebreaksCount]
    }
    
    extension [Self <: LimitLinebreaksCount](x: Self) {
      
      inline def setLimitLinebreaksCount(value: Double): Self = StObject.set(x, "limitLinebreaksCount", value.asInstanceOf[js.Any])
      
      inline def setLimitToBeAddedWhitespace(value: Boolean): Self = StObject.set(x, "limitToBeAddedWhitespace", value.asInstanceOf[js.Any])
      
      inline def setMergeType(value: Double): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    }
  }
}
