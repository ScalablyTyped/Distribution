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
  
  val document: document with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val tag: tag with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.SocialNs.SocialDataItemType with java.lang.String] = js.native
}

