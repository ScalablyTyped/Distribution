package typings.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterComparator extends js.Object

/**
  * Filter comparators used for table filters
  */
@JSImport("react-bootstrap-table-next", "FilterComparator")
@js.native
object FilterComparator extends js.Object {
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

