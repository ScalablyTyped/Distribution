package typings.reactBootstrapTableNext.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterComparator extends StObject
/**
  * Filter comparators used for table filters
  */
@JSImport("react-bootstrap-table-next", "FilterComparator")
@js.native
object FilterComparator extends StObject {
  
  @js.native
  sealed trait EQ extends FilterComparator
  
  @js.native
  sealed trait GE extends FilterComparator
  
  @js.native
  sealed trait GT extends FilterComparator
  
  @js.native
  sealed trait LE extends FilterComparator
  
  @js.native
  sealed trait LIKE extends FilterComparator
  
  @js.native
  sealed trait LT extends FilterComparator
  
  @js.native
  sealed trait NE extends FilterComparator
}
