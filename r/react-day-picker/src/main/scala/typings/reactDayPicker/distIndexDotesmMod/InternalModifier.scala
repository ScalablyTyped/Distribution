package typings.reactDayPicker.distIndexDotesmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InternalModifier extends StObject
/** The name of the modifiers that are used internally by DayPicker. */
@JSImport("react-day-picker/dist/index.esm", "InternalModifier")
@js.native
object InternalModifier extends StObject {
  
  /** Name of the modifier applied to the disabled days, using the `disabled` prop. */
  @js.native
  sealed trait Disabled
    extends StObject
       with InternalModifier
  
  /** Name of the modifier applied to the hidden days using the `hidden` prop). */
  @js.native
  sealed trait Hidden
    extends StObject
       with InternalModifier
  
  @js.native
  sealed trait Outside
    extends StObject
       with InternalModifier
  
  /** The modifier applied to the day ending a selected range, when in range selection mode.  */
  @js.native
  sealed trait RangeEnd
    extends StObject
       with InternalModifier
  
  /** The modifier applied to the days between the start and the end of a selected range, when in range selection mode.  */
  @js.native
  sealed trait RangeMiddle
    extends StObject
       with InternalModifier
  
  /** The modifier applied to the day starting a selected range, when in range selection mode.  */
  @js.native
  sealed trait RangeStart
    extends StObject
       with InternalModifier
  
  /** Name of the modifier applied to the selected days using the `selected` prop). */
  @js.native
  sealed trait Selected
    extends StObject
       with InternalModifier
  
  /** Name of the modifier applied to the day specified using the `today` prop). */
  @js.native
  sealed trait Today
    extends StObject
       with InternalModifier
}
