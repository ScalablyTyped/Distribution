package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base
  extends CountSubscriptions
     with ClearAllSubscriptions
     with GetSubscriptions
     with Publish
     with Subscribe
     with Unsubscribe {
  
  var name: String = js.native
  
  var version: String = js.native
}
