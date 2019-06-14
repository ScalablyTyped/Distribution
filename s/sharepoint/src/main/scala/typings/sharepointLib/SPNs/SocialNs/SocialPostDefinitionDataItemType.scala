package typings
package sharepointLib.SPNs.SocialNs

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
  sealed trait document
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait link
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait tag
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait text
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType
  
  /* 2 */ val document: document with scala.Double = js.native
  /* 5 */ val link: link with scala.Double = js.native
  /* 3 */ val site: site with scala.Double = js.native
  /* 4 */ val tag: tag with scala.Double = js.native
  /* 0 */ val text: text with scala.Double = js.native
  /* 1 */ val user: user with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType with scala.Double] = js.native
}

