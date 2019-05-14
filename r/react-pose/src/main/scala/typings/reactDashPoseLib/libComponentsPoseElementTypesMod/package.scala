package typings
package reactDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPoseElementTypesMod {
  type ConfigFactory = js.Function1[/* props */ PoseElementProps, popmotionDashPoseLib.libTypesMod.DomPopmotionConfig]
  type CurrentPose = java.lang.String | js.Array[java.lang.String]
  type PoseElementInternalProps = PoseElementProps with reactDashPoseLib.Anon_ElementType
  type PoseElementProps = reactDashPoseLib.Anon_Children with PoseContextProps
  type RefFunc = js.Function1[/* el */ stdLib.Element, js.Any]
}
