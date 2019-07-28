package typings.reactDashTagcloud

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTagCloudNs {
  type RendererFunction = js.Function4[
    /* tag */ js.Any, 
    /* size */ Double, 
    /* key */ String | Double, 
    /* handlers */ js.Any, 
    js.Any
  ]
  type TagCloudClass = ComponentClass[TagCloudProps, ComponentState]
}
