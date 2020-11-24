package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // Other events than ApiGatewayEvent are available
  type Event = typings.serverless.validateMod.ApiGatewayEvent | js.Object
}
