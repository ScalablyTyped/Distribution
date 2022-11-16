package typings.rax.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type RaxNodeArray = std.Array<rax.rax.RaxNode>
}}}
to avoid circular code involving: 
- rax.rax.JSXElementConstructor
- rax.rax.RaxChild
- rax.rax.RaxFragment
- rax.rax.RaxNode
- rax.rax.RaxNodeArray
*/
@js.native
trait RaxNodeArray
  extends StObject
     with Array[RaxNode]
