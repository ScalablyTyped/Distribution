package typings.reactBootstrapTable2Filter.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FILTER_TYPES extends js.Object
@JSImport("react-bootstrap-table2-filter", "FILTER_TYPES")
@js.native
object FILTER_TYPES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FILTER_TYPES with String] = js.native
  
  @js.native
  sealed trait DATE extends FILTER_TYPES
  /* "DATE" */ @js.native
  object DATE extends TopLevel[DATE with String]
  
  @js.native
  sealed trait MULTISELECT extends FILTER_TYPES
  /* "MULTISELECT" */ @js.native
  object MULTISELECT extends TopLevel[MULTISELECT with String]
  
  @js.native
  sealed trait NUMBER extends FILTER_TYPES
  /* "NUMBER" */ @js.native
  object NUMBER extends TopLevel[NUMBER with String]
  
  @js.native
  sealed trait SELECT extends FILTER_TYPES
  /* "SELECT" */ @js.native
  object SELECT extends TopLevel[SELECT with String]
  
  @js.native
  sealed trait TEXT extends FILTER_TYPES
  /* "TEXT" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
}
