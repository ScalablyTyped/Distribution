package typings.reactDashDates.reactDashDatesMod

import org.scalablytyped.runtime.TopLevel
import typings.moment.momentMod.Moment
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utils/toMomentObject.js
@JSImport("react-dates", "toMomentObject")
@js.native
object toMomentObject
  extends TopLevel[
      js.Function2[
        /* dateString */ MomentInput, 
        /* customFormat */ MomentFormatSpecification, 
        Moment | Null
      ]
    ]

