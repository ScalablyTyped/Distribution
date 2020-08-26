package typings.semanticUiReact.paginationPaginationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationProps
  extends StrictPaginationProps
     with /* key */ StringDictionary[js.Any]

object PaginationProps {
  @scala.inline
  def apply(totalPages: Double | String): PaginationProps = {
    val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

