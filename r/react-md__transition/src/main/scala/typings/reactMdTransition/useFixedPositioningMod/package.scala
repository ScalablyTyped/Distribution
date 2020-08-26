package typings.reactMdTransition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useFixedPositioningMod {
  type FixedTo = java.lang.String | typings.std.HTMLElement | scala.Null | typings.reactMdTransition.useFixedPositioningMod.FixedToFunction
  type FixedToFunction = js.Function0[typings.std.HTMLElement | scala.Null]
  type GetFixedPositionOptions = js.Function1[
    /* node */ typings.std.HTMLElement, 
    typings.reactMdTransition.useFixedPositioningMod.OptionalFixedPositionOptions
  ]
  type OnFixedPositionScroll = js.Function2[
    /* event */ typings.std.Event, 
    /* data */ typings.reactMdTransition.useFixedPositioningMod.ScrollData, 
    scala.Unit
  ]
  type PositionChange = js.Function2[
    /* wanted */ typings.reactMdUtils.typesMod.PositionAnchor, 
    /* actual */ typings.reactMdUtils.typesMod.PositionAnchor, 
    scala.Unit
  ]
}
