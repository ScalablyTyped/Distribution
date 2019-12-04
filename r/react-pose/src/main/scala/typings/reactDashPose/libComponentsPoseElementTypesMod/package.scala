package typings.reactDashPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsPoseElementTypesMod {
  import typings.popmotionDashPose.libTypesMod.DomPopmotionConfig
  import typings.reactDashPose.Anon_ChildrenInitialPose
  import typings.reactDashPose.Anon_ElementType
  import typings.std.Element

  type ConfigFactory = js.Function1[/* props */ PoseElementProps, DomPopmotionConfig]
  type CurrentPose = String | js.Array[String]
  type PoseElementInternalProps = PoseElementProps with Anon_ElementType
  type PoseElementProps = Anon_ChildrenInitialPose with PoseContextProps
  type RefFunc = js.Function1[/* el */ Element, js.Any]
}
