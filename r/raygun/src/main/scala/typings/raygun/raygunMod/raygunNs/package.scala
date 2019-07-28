package typings.raygun.raygunMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygunNs {
  type OnBeforeSend = js.Function5[
    /* payload */ RaygunPayload, 
    /* exception */ Error, 
    /* customData */ KeyValueObject, 
    /* request */ RaygunRequest, 
    /* tags */ js.Array[String], 
    Boolean | RaygunPayload
  ]
}
