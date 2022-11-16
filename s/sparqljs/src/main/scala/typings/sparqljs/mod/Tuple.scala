package typings.sparqljs.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Tuple = std.Array<sparqljs.sparqljs.Expression>
}}}
to avoid circular code involving: 
- sparqljs.sparqljs.Expression
- sparqljs.sparqljs.Tuple
*/
@js.native
trait Tuple
  extends StObject
     with Array[Expression]
     with _Expression
