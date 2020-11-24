package typings.smartystreetsJavascriptSdk.mod.usStreet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "usStreet.Lookup")
@js.native
class Lookup protected ()
  extends typings.smartystreetsJavascriptSdk.mod.core.Lookup {
  def this(
    street1: js.UndefOr[String],
    street2: js.UndefOr[String],
    secondary: js.UndefOr[String],
    city: js.UndefOr[String],
    state: js.UndefOr[String],
    zipCode: js.UndefOr[String],
    lastLine: js.UndefOr[String],
    addressee: js.UndefOr[String],
    urbanization: js.UndefOr[String],
    `match`: js.UndefOr[String],
    maxCandidates: js.UndefOr[String],
    inputId: js.UndefOr[String]
  ) = this()
  
  var adressee: String = js.native
  
  var city: String = js.native
  
  var inputId: String = js.native
  
  var lastLine: String = js.native
  
  var `match`: String = js.native
  
  var maxCandidates: Double = js.native
  
  var result: js.Array[Candidate] = js.native
  
  var secondary: String = js.native
  
  var state: String = js.native
  
  var street: String = js.native
  
  var street2: String = js.native
  
  var urbanization: String = js.native
  
  var zipCode: String = js.native
}
