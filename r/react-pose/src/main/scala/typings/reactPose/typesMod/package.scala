package typings.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ConfigFactory = js.Function1[
    /* props */ typings.reactPose.typesMod.PoseElementProps, 
    typings.popmotionPose.typesMod.DomPopmotionConfig
  ]
  
  type CurrentPose = java.lang.String | js.Array[java.lang.String]
  
  type RefFunc = js.Function1[/* el */ typings.std.Element, js.Any]
}
