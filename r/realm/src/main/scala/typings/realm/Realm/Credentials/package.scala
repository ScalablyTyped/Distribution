package typings.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Credentials {
  
  /**
    * Payload sent when authenticating using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
    */
  type AnonymousPayload = js.Object
  
  /**
    * Payload sent when authenticating using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
    */
  type FunctionPayload = js.Object
}
