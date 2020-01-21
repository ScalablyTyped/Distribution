package typings.reactDates.mod

import org.scalablytyped.runtime.TopLevel
import typings.moment.mod.Moment
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
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

