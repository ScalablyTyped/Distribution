package typings.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SailthruCallback = js.Function2[
    /* err */ typings.sailthruClient.mod.SailthruError, 
    /* response */ typings.sailthruClient.mod.SailthruResponse, 
    scala.Unit
  ]
  type SailthruError = typings.sailthruClient.anon.Error | scala.Null
  type SailthruResponse = js.Object | java.lang.String
}
