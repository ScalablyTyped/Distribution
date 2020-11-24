package typings.smartystreetsJavascriptSdk.mod.usZipcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smartystreets-javascript-sdk", "usZipcode.Result")
@js.native
class Result protected () extends js.Object {
  def this(responseData: js.Any) = this()
  
  var cities: js.Array[City] = js.native
  
  var inputIndex: String = js.native
  
  var reason: String = js.native
  
  var status: String = js.native
  
  var valid: Boolean = js.native
  
  var zipcodes: js.Array[ZipCode] = js.native
}
