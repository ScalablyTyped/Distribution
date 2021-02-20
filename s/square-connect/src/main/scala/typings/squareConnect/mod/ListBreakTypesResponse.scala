package typings.squareConnect.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "ListBreakTypesResponse")
@js.native
class ListBreakTypesResponse () extends StObject {
  
  /**
    *  A page of `BreakType` results.
    */
  var break_types: js.UndefOr[js.Array[BreakType]] = js.native
  
  /**
    * Value supplied in the subsequent request to fetch the next next page of Break Type results.
    */
  var cursor: js.UndefOr[String] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
