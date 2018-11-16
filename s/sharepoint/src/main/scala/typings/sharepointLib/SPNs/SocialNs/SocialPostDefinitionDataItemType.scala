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
  
  val document: document with java.lang.String = js.native
  val link: link with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val tag: tag with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.SocialNs.SocialPostDefinitionDataItemType with java.lang.String
  ] = js.native
}

