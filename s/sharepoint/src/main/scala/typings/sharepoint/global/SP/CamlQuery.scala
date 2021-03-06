package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@JSGlobal("SP.CamlQuery")
@js.native
class CamlQuery ()
  extends typings.sharepoint.SP.CamlQuery
object CamlQuery {
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the folders in a list, including
    the subfolders. */
  /* static member */
  @JSGlobal("SP.CamlQuery.createAllFoldersQuery")
  @js.native
  def createAllFoldersQuery(): typings.sharepoint.SP.CamlQuery = js.native
  
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the items in a list, including
    the items in the subfolders. */
  /* static member */
  @JSGlobal("SP.CamlQuery.createAllItemsQuery")
  @js.native
  def createAllItemsQuery(): typings.sharepoint.SP.CamlQuery = js.native
}
