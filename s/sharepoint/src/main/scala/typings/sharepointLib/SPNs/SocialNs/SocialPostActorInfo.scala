package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
@JSGlobal("SP.Social.SocialPostActorInfo")
@js.native
class SocialPostActorInfo ()
  extends sharepointLib.SPNs.ClientValueObject {
  def get_includesCurrentUser(): scala.Boolean = js.native
  /** Specifies an array of indexes into the SocialThreadActors array.
                  The server can choose to return a limited set of actors. For example, the server can choose to return a subset of the users that like a post. */
  def get_indexes(): js.Array[scala.Double] = js.native
  def get_totalCount(): scala.Double = js.native
}

