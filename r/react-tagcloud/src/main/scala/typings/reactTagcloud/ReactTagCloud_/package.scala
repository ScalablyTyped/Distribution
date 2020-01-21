package typings.reactTagcloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTagCloud_ {
  type RendererFunction = js.Function4[
    /* tag */ js.Any, 
    /* size */ scala.Double, 
    /* key */ java.lang.String | scala.Double, 
    /* handlers */ js.Any, 
    js.Any
  ]
  type TagCloudClass = typings.react.mod.ComponentClass[
    typings.reactTagcloud.ReactTagCloud_.TagCloudProps, 
    typings.react.mod.ComponentState
  ]
}
