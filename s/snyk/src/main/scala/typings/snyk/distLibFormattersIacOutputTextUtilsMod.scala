package typings.snyk

import typings.chalk.mod.Chalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersIacOutputTextUtilsMod {
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/utils", "colors")
  @js.native
  val colors: IacOutputColors = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/utils", "contentPadding")
  @js.native
  val contentPadding: String = js.native
  
  @JSImport("snyk/dist/lib/formatters/iac-output/text/utils", "maxLineWidth")
  @js.native
  val maxLineWidth: Double = js.native
  
  trait IacOutputColors extends StObject {
    
    var failure: Chalk
    
    var info: Chalk
    
    var severities: SeverityColor
    
    var success: Chalk
    
    var suggestion: Chalk
    
    var title: Chalk
  }
  object IacOutputColors {
    
    inline def apply(
      failure: Chalk,
      info: Chalk,
      severities: SeverityColor,
      success: Chalk,
      suggestion: Chalk,
      title: Chalk
    ): IacOutputColors = {
      val __obj = js.Dynamic.literal(failure = failure.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], severities = severities.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IacOutputColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IacOutputColors] (val x: Self) extends AnyVal {
      
      inline def setFailure(value: Chalk): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Chalk): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setSeverities(value: SeverityColor): Self = StObject.set(x, "severities", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Chalk): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: Chalk): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: Chalk): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ severity in snyk.snyk/dist/lib/snyk-test/common.SEVERITY ]: chalk.chalk.Chalk}
    }}}
    */
  @js.native
  trait SeverityColor extends StObject
}
