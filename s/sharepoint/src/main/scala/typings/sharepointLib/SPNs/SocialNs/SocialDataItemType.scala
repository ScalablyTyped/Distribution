package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataItemType extends js.Object

/** Specifies whether the item being inserted is a user, document, site, tag, or link. */
@JSGlobal("SP.Social.SocialDataItemType")
@js.native
object SocialDataItemType extends js.Object {
  @js.native
  sealed trait document
    extends sharepointLib.SPNs.SocialNs.SocialDataItemType
  
  @js.native
  sealed trait link
    extends sharepointLib.SPNs.SocialNs.SocialDataItemType
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.SocialNs.SocialDataItemType
  
  @js.native
  sealed trait tag
    extends sharepointLib.SPNs.SocialNs.SocialDataItemType
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.SocialNs.SocialDataItemType
  
  /* 1 */ val document: document with scala.Double = js.native
  /* 4 */ val link: link with scala.Double = js.native
  /* 2 */ val site: site with scala.Double = js.native
  /* 3 */ val tag: tag with scala.Double = js.native
  /* 0 */ val user: user with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialDataItemType with scala.Double] = js.native
}

