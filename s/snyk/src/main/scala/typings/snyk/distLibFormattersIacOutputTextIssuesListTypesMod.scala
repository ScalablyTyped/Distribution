package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextIssuesListTypesMod {
  
  trait Options extends StObject {
    
    var shouldShowLineNumbers: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setShouldShowLineNumbers(value: Boolean): Self = StObject.set(x, "shouldShowLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setShouldShowLineNumbersUndefined: Self = StObject.set(x, "shouldShowLineNumbers", js.undefined)
    }
  }
}
