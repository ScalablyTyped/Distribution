package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialPostDefinitionDataItemType extends js.Object

/** Defines the type of item being specified in the SocialPostDefinitionDataItem.
  This type is only available in server-to-server calls. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItemType")
@js.native
object SocialPostDefinitionDataItemType extends js.Object {
  @js.native
  sealed trait document extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait link extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait site extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait tag extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait text extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait user extends SocialPostDefinitionDataItemType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostDefinitionDataItemType with Double] = js.native
  /* 2 */ @js.native
  object document extends TopLevel[document with Double]
  
  /* 5 */ @js.native
  object link extends TopLevel[link with Double]
  
  /* 3 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 4 */ @js.native
  object tag extends TopLevel[tag with Double]
  
  /* 0 */ @js.native
  object text extends TopLevel[text with Double]
  
  /* 1 */ @js.native
  object user extends TopLevel[user with Double]
  
}

