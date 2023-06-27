package typings.react.mod

import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use either `ReactNode[]` if you need an array or `Iterable<ReactNode>` if its passed to a host component.
  */
/** 
NOTE: Rewritten from type alias:
{{{
type ReactNodeArray = std.ReadonlyArray<react.react.ReactNode>
}}}
to avoid circular code involving: 
- react.react.ReactNode
- react.react.ReactNodeArray
*/
@js.native
trait ReactNodeArray
  extends StObject
     with ReadonlyArray[ReactNode]
