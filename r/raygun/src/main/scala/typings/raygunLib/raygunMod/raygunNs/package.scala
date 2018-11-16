package typings
package raygunLib.raygunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygunNs {
  type OnBeforeSend = js.Function5[
    /* payload */ RaygunPayload, 
    /* exception */ stdLib.Error, 
    /* customData */ KeyValueObject, 
    /* request */ RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    scala.Boolean | RaygunPayload
  ]
}
