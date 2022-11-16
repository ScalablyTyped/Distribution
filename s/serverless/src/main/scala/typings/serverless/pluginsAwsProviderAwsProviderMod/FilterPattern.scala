package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type FilterPattern = {[k: string] : serverless.serverless/plugins/aws/provider/awsProvider.FilterPattern | std.Array<serverless.serverless/plugins/aws/provider/awsProvider.Filter>}
}}}
to avoid circular code involving: 
- serverless.serverless/plugins/aws/provider/awsProvider.FilterPattern
*/
trait FilterPattern
  extends StObject
     with /* k */ StringDictionary[FilterPattern | js.Array[Filter]]
object FilterPattern {
  
  inline def apply(): FilterPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPattern]
  }
}
