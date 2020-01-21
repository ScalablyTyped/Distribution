package typings.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ConfigFactory = js.Function1[
    /* props */ typings.reactPose.typesMod.PoseElementProps, 
    typings.popmotionPose.typesMod.DomPopmotionConfig
  ]
  type CurrentPose = java.lang.String | js.Array[java.lang.String]
  type PoseElementInternalProps = typings.reactPose.typesMod.PoseElementProps with typings.reactPose.AnonElementType
  type PoseElementProps = typings.reactPose.AnonChildrenInitialPose with typings.reactPose.typesMod.PoseContextProps
  type RefFunc = js.Function1[/* el */ typings.std.Element, js.Any]
}
