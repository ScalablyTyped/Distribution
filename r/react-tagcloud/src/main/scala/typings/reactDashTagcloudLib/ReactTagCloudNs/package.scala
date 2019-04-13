package typings
package reactDashTagcloudLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTagCloudNs {
  type RendererFunction = js.Function4[
    /* tag */ js.Any, 
    /* size */ scala.Double, 
    /* key */ java.lang.String | scala.Double, 
    /* handlers */ js.Any, 
    js.Any
  ]
  type TagCloudClass = reactLib.reactMod.ComponentClass[TagCloudProps, reactLib.reactMod.ComponentState]
}
