package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChangeTypes extends js.Object

/** Specifies types of changes made in the user profile store. */
@JSGlobal("SP.UserProfiles.ChangeTypes")
@js.native
object ChangeTypes extends js.Object {
  /** An object was added */
  @js.native
  sealed trait add extends ChangeTypes
  
  /** Multiple operations were performed on an object */
  @js.native
  sealed trait all extends ChangeTypes
  
  /** The metadata of an object was modified */
  @js.native
  sealed trait metadata extends ChangeTypes
  
  /** An object was modified */
  @js.native
  sealed trait modify extends ChangeTypes
  
  /** No change was made */
  @js.native
  sealed trait none extends ChangeTypes
  
  /** An object was removed */
  @js.native
  sealed trait remove extends ChangeTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChangeTypes with Double] = js.native
  /* 1 */ @js.native
  object add extends TopLevel[add with Double]
  
  /* 5 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 4 */ @js.native
  object metadata extends TopLevel[metadata with Double]
  
  /* 2 */ @js.native
  object modify extends TopLevel[modify with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object remove extends TopLevel[remove with Double]
  
}

