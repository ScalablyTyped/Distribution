package typings.reactBootstrapTable2Filter.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FILTER_TYPES extends js.Object

@JSImport("react-bootstrap-table2-filter", "FILTER_TYPES")
@js.native
object FILTER_TYPES extends js.Object {
  @js.native
  sealed trait DATE extends FILTER_TYPES
  
  @js.native
  sealed trait MULTISELECT extends FILTER_TYPES
  
  @js.native
  sealed trait NUMBER extends FILTER_TYPES
  
  @js.native
  sealed trait SELECT extends FILTER_TYPES
  
  @js.native
  sealed trait TEXT extends FILTER_TYPES
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FILTER_TYPES with String] = js.native
  /* "DATE" */ @js.native
  object DATE extends TopLevel[DATE with String]
  
  /* "MULTISELECT" */ @js.native
  object MULTISELECT extends TopLevel[MULTISELECT with String]
  
  /* "NUMBER" */ @js.native
  object NUMBER extends TopLevel[NUMBER with String]
  
  /* "SELECT" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
  
  /* "TEXT" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
}

