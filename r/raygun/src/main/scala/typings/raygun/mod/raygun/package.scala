package typings.raygun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygun {
  type GroupingKey = js.Function5[
    /* payload */ typings.raygun.mod.raygun.RaygunPayload, 
    /* exception */ typings.std.Error, 
    /* customData */ typings.raygun.mod.raygun.KeyValueObject, 
    /* request */ typings.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    java.lang.String
  ]
  type OnBeforeSend = js.Function5[
    /* payload */ typings.raygun.mod.raygun.RaygunPayload, 
    /* exception */ typings.std.Error, 
    /* customData */ typings.raygun.mod.raygun.KeyValueObject, 
    /* request */ typings.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    scala.Boolean | typings.raygun.mod.raygun.RaygunPayload
  ]
}
